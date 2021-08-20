package main.huawind.Abilities;
import com.SirBlobman.combatlogx.api.ICombatLogX;
import com.SirBlobman.combatlogx.api.utility.ICombatManager;
import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.container.Job;
import com.gamingmesh.jobs.container.JobsPlayer;
import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import main.huawind.jobs.Hunter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.*;

public class HunterAbility implements Listener {

	 HashMap<UUID, Long> cooldownsHunter = new HashMap<>();
	 HashMap<UUID, Long> abilityDurationHunter = new HashMap<>();

	public void applyNoDelay(Player p) {
		p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(NaturesHowl.getPlugin().isEnabled() ? 1024.0D : 4.0D);
		p.saveData();
	}

	public boolean isInCombat(Player player) {
		// You need to ensure that CombatLogX is enabled before using it for anything.
		ICombatLogX plugin = (ICombatLogX) Bukkit.getPluginManager().getPlugin("CombatLogX");
		ICombatManager combatManager = plugin.getCombatManager();
		return combatManager.isInCombat(player);
	}

	public void applyDelay(Player p) {
		p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(4.0D);
		p.saveData();
	}


	@EventHandler
	public void joinWithNohitDelay(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if (p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).getBaseValue() != 4.0D) {
			p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(4.0D);
		}
	}


	@EventHandler
	public void mobCancelDamage(EntityDamageByEntityEvent e) {
		if (abilityDurationHunter.containsKey(e.getEntity().getUniqueId())) {
			if (e.getDamager() instanceof Mob) {
				e.setCancelled(true);
			}
		}
	}


	@EventHandler
	public void mobtest(EntityTargetEvent e) {
		if (e.getEntity() instanceof Skeleton) {

			if (e.getTarget() instanceof Player) {
				if (abilityDurationHunter.containsKey(e.getTarget().getUniqueId())) {
					e.setTarget(null);
				}
			}
		}
	}

	@EventHandler
	public void huntersAbility(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		BukkitTask task = new BukkitRunnable() {
			public void run() {
				if (abilityDurationHunter.containsKey(e.getPlayer().getUniqueId())) {
					if (abilityDurationHunter.get(e.getPlayer().getUniqueId()) <= System.currentTimeMillis()) {
						abilityDurationHunter.remove(e.getPlayer().getUniqueId());
					}
				}
				if (abilityDurationHunter.containsKey(e.getPlayer().getUniqueId())) {
					applyNoDelay(e.getPlayer()); // WHEN ABILITY ACTIVATED, SET ATTRIBUTE TO NO DELAY ATTACKS
				}

				if(!abilityDurationHunter.containsKey(e.getPlayer().getUniqueId())) {
					if (p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).getBaseValue() != 4.0D) {
						p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(4.0D);
					}
				}

				for (PotionEffect potioneffect : p.getActivePotionEffects()) {
					int duration = potioneffect.getDuration();
					if (abilityDurationHunter.containsKey(e.getPlayer().getUniqueId())) {
						if (p.hasPotionEffect(PotionEffectType.SPEED)) {
							if (duration / 20 == 0) {
								p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 1)); // GIVE SLOWNESS AFTER SPEED
							}
						}
					}
				}
				if (cooldownsHunter.containsKey(e.getPlayer().getUniqueId())) {
					if (cooldownsHunter.get(e.getPlayer().getUniqueId()) <= System.currentTimeMillis()) {
						p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "HUNTER:" + ChatColor.RESET + "" + ChatColor.RED + " Your ability is now ready"); // RUNNABLE TO CHECK IF ABILITY READy
						cooldownsHunter.remove(e.getPlayer().getUniqueId());
						this.cancel();
					}
				}
			}
		}.runTaskTimer(NaturesHowl.getPlugin(),0,20L);

		List<Material> swords = Arrays.asList(Material.STONE_SWORD, Material.DIAMOND_SWORD, Material.IRON_SWORD, Material.GOLDEN_SWORD, Material.NETHERITE_SWORD, Material.WOODEN_SWORD);
		Action action = e.getAction();
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(e.getPlayer());
		Job hunter = Jobs.getJob("Hunter");
		if (jobsPlayer.isInJob(hunter)) {
			int hunterlevel = jobsPlayer.getJobProgression(hunter).getLevel();
			EquipmentSlot hand = e.getHand();
			if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
				if (action.equals(Action.RIGHT_CLICK_BLOCK) && p.isSneaking() || action.equals(Action.RIGHT_CLICK_AIR) && p.isSneaking()) {
					if (hand.equals(EquipmentSlot.HAND)) {
						if (swords.contains(p.getPlayer().getInventory().getItemInMainHand().getType())) {
								if (cooldownsHunter.containsKey(p.getUniqueId())) // player in hashmap
								{
									if (cooldownsHunter.get(p.getUniqueId()) > System.currentTimeMillis()) {
										long timeleft = (cooldownsHunter.get(p.getUniqueId()) - System.currentTimeMillis()) / 1000;
										p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

									}
								}
						}
					}
						if (!cooldownsHunter.containsKey(p.getUniqueId())) {
							if (swords.contains(p.getPlayer().getInventory().getItemInMainHand().getType())) {
								if (hunterlevel >= 10 && hunterlevel <= 19) {
									if (!isInCombat(e.getPlayer())) {
										p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10.0F, 0F);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Come to me Nature Gods! Fill my veins with rage!");
										p.sendMessage(" ");
										PotionEffect blindness = new PotionEffect(PotionEffectType.BLINDNESS, 2, 2, false);
										p.addPotionEffect(blindness);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 120, 0, false);
										p.addPotionEffect(speedI);
										PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 120, 0, false);
										p.addPotionEffect(haste);
										cooldownsHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.cooldown.lvl10") * 1000L);
										abilityDurationHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.abilityduration.lvl10") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (hunterlevel >= 20 && hunterlevel <= 29) {
									if (!isInCombat(e.getPlayer())) {
										p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10.0F, 0F);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Come to me Nature Gods! Fill my veins with rage!");
										p.sendMessage(" ");
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 160, 0, false);
										p.addPotionEffect(speedI);
										PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 160, 0, false);
										p.addPotionEffect(haste);
										cooldownsHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.cooldown.lvl20") * 1000L);
										abilityDurationHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.abilityduration.lvl10") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (hunterlevel >= 30 && hunterlevel <= 39) {
									if (!isInCombat(e.getPlayer())) {
										p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10.0F, 0F);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Come to me Nature Gods! Fill my veins with rage!");
										p.sendMessage(" ");
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 200, 1, false);
										p.addPotionEffect(speedI);
										PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 200, 0, false);
										p.addPotionEffect(haste);
										cooldownsHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.cooldown.lvl30") * 1000L);
										abilityDurationHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.abilityduration.lvl30") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (hunterlevel >= 40 && hunterlevel <= 49) {
									if (!isInCombat(e.getPlayer())) {
										p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10.0F, 0F);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Come to me Nature Gods! Fill my veins with rage!");
										p.sendMessage(" ");
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 240, 1, false);
										p.addPotionEffect(speedI);
										PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 240, 1, false);
										p.addPotionEffect(haste);
										cooldownsHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.cooldown.lvl40") * 1000L);
										abilityDurationHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.abilityduration.lvl40") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (hunterlevel >= 50 && hunterlevel <= 59) {
									if (!isInCombat(e.getPlayer())) {
										p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10.0F, 0F);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Come to me Nature Gods! Fill my veins with rage!");
										p.sendMessage(" ");
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 300, 1, false);
										p.addPotionEffect(speedI);
										PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 300, 1, false);
										p.addPotionEffect(haste);
										cooldownsHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.cooldown.lvl50") * 1000L);
										abilityDurationHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.abilityduration.lvl50") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (hunterlevel >= 60 && hunterlevel <= 69) {
									if (!isInCombat(e.getPlayer())) {
										p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10.0F, 0F);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Come to me Nature Gods! Fill my veins with rage!");
										p.sendMessage(" ");
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 320, 2, false);
										p.addPotionEffect(speedI);
										PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 320, 1, false);
										p.addPotionEffect(haste);
										cooldownsHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.cooldown.lvl60") * 1000L);
										abilityDurationHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.abilityduration.lvl60") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (hunterlevel >= 70 && hunterlevel <= 79) {
									if (!isInCombat(e.getPlayer())) {
										p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10.0F, 0F);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Come to me Nature Gods! Fill my veins with rage!");
										p.sendMessage(" ");
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 360, 2, false);
										p.addPotionEffect(speedI);
										PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 360, 1, false);
										p.addPotionEffect(haste);
										cooldownsHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.cooldown.lvl70") * 1000L);
										abilityDurationHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.abilityduration.lvl70") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (hunterlevel >= 80 && hunterlevel <= 89) {
									if (!isInCombat(e.getPlayer())) {
										p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10.0F, 0F);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Come to me Nature Gods! Fill my veins with rage!");
										p.sendMessage(" ");
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 360, 3, false);
										p.addPotionEffect(speedI);
										PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 360, 2, false);
										p.addPotionEffect(haste);
										cooldownsHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.cooldown.lvl80") * 1000L);
										abilityDurationHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.abilityduration.lvl80") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (hunterlevel >= 90 && hunterlevel <= 99) {
									if (!isInCombat(e.getPlayer())) {
										p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10.0F, 0F);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Come to me Nature Gods! Fill my veins with rage!");
										p.sendMessage(" ");
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 400, 3, false);
										p.addPotionEffect(speedI);
										PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 400, 2, false);
										p.addPotionEffect(haste);
										cooldownsHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.cooldown.lvl90") * 1000L);
										abilityDurationHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.abilityduration.lvl90") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (hunterlevel == 100) {
									if (!isInCombat(e.getPlayer())) {
										p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10.0F, 0F);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Come to me Nature Gods! Fill my veins with rage!");
										p.sendMessage(" ");
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 400, 4, false);
										p.addPotionEffect(speedI);
										PotionEffect haste = new PotionEffect(PotionEffectType.FAST_DIGGING, 400, 3, false);
										p.addPotionEffect(haste);
										cooldownsHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.cooldown.lvl100") * 1000L);
										abilityDurationHunter.put(e.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Hunter.abilityduration.lvl100") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
							}
						}
					}
				}
			}
		}
	}