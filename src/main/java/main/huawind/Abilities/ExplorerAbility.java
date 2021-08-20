package main.huawind.Abilities;

import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.container.CurrencyType;
import com.gamingmesh.jobs.container.Job;
import com.gamingmesh.jobs.container.JobsPlayer;
import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ExplorerAbility implements Listener {
	

	Map<UUID, Long> cooldowns = new HashMap<>();

	
	@EventHandler
	public void exploroAbility(PlayerInteractEvent event) {
		Action action = event.getAction();
		Player p = event.getPlayer();
		BukkitTask task = new BukkitRunnable() {
			public void run() {
				if (cooldowns.containsKey(event.getPlayer().getUniqueId())) {
					if (cooldowns.get(event.getPlayer().getUniqueId()) <= System.currentTimeMillis()) {
						p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "EXPLORER:" + ChatColor.RESET + "" + ChatColor.DARK_GREEN + " Your ability is now ready");
						cooldowns.remove(event.getPlayer().getUniqueId());
						this.cancel();
					}
				}
			}
		}.runTaskTimer(NaturesHowl.getPlugin(),0,20L);
		ItemStack item = p.getInventory().getItemInMainHand();
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(event.getPlayer());
		Job explorer = Jobs.getJob("Explorer");
		if (jobsPlayer.isInJob(explorer)) {
			int explorerlevel = jobsPlayer.getJobProgression(explorer).getLevel();
			EquipmentSlot hand = event.getHand();
			if (action.equals(Action.RIGHT_CLICK_AIR)) {
				if (item.getType() == Material.STICK) {
					if (hand.equals(EquipmentSlot.HAND)) {
						if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Exploro")) {
							if (p.getInventory().getItemInMainHand().getItemMeta().getLore().contains(ChatColor.GREEN + "✦ An ability passed down to explorers by the Nature Gods")) {
								if (!jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
									p.sendMessage(ChatColor.RED + "You have to be job Explorer to use this");
								}
								if (explorerlevel < 10) {
									p.sendMessage(ChatColor.RED + "You have to be at least a level 10 Explorer to use this");
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Explorer")) && explorerlevel >= 10 && explorerlevel <= 19) {
									if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
									{
										if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
											long timeleft = (cooldowns.get(event.getPlayer().getUniqueId()) - System.currentTimeMillis()) / 1000;
											p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

										}

									}
									if (!cooldowns.containsKey(event.getPlayer().getUniqueId())) {
										Location loc = p.getTargetBlock(null, Custom.get().getInt("Explorer.distance.lvl10")).getLocation().clone();
										loc.setPitch(p.getLocation().getPitch());
										loc.setYaw(p.getLocation().getYaw());
										p.teleport(loc);
										p.playSound(p.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, 10.0F, 0F);
										p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 10.0F, 1.0F);
										PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 25, 1, false);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 100, 0, false);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Nature Gods bless me with dexterity!");
										p.sendMessage(" ");
										p.addPotionEffect(speedI);
										p.addPotionEffect(blind);
										jobsPlayer.getBoost("Explorer", CurrencyType.EXP, true);
										cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Explorer.abilitycooldown.lvl10") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Explorer")) && explorerlevel >= 20 && explorerlevel <= 29) {
									if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
									{
										if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
											long timeleft = (cooldowns.get(event.getPlayer().getUniqueId()) - System.currentTimeMillis()) / 1000;
											p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

										}

									}
									if (!cooldowns.containsKey(event.getPlayer().getUniqueId())) {
										Location loc = p.getTargetBlock(null, Custom.get().getInt("Explorer.distance.lvl20")).getLocation().clone();
										loc.setPitch(p.getLocation().getPitch());
										loc.setYaw(p.getLocation().getYaw());
										p.teleport(loc);
										p.playSound(p.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, 10.0F, 0F);
										p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 10.0F, 1.0F);
										PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 25, 1, false);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 160, 0, false);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Nature Gods bless me with dexterity!");
										p.sendMessage(" ");
										p.addPotionEffect(speedI);
										p.addPotionEffect(blind);
										cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Explorer.abilitycooldown.lvl20") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Explorer")) && explorerlevel >= 30 && explorerlevel <= 39) {
									if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
									{
										if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
											long timeleft = (cooldowns.get(event.getPlayer().getUniqueId()) - System.currentTimeMillis()) / 1000;
											p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

										}

									}
									if (!cooldowns.containsKey(event.getPlayer().getUniqueId())) {
										Location loc = p.getTargetBlock(null, Custom.get().getInt("Explorer.distance.lvl30")).getLocation().clone();
										loc.setPitch(p.getLocation().getPitch());
										loc.setYaw(p.getLocation().getYaw());
										p.teleport(loc);
										p.playSound(p.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, 10.0F, 0F);
										p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 10.0F, 1.0F);
										PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 25, 1, false);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 220, 1, false);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Nature Gods bless me with dexterity!");
										p.sendMessage(" ");
										p.addPotionEffect(speedI);
										p.addPotionEffect(blind);
										cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Explorer.abilitycooldown.lvl30") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);

									}
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Explorer")) && explorerlevel >= 40 && explorerlevel <= 49) {
									if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
									{
										if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
											long timeleft = (cooldowns.get(event.getPlayer().getUniqueId()) - System.currentTimeMillis()) / 1000;
											p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

										}

									}
									if (!cooldowns.containsKey(event.getPlayer().getUniqueId())) {
										Location loc = p.getTargetBlock(null, Custom.get().getInt("Explorer.distance.lvl40")).getLocation().clone();
										loc.setPitch(p.getLocation().getPitch());
										loc.setYaw(p.getLocation().getYaw());
										p.teleport(loc);
										p.playSound(p.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, 10.0F, 0F);
										p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 10.0F, 1.0F);
										PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 25, 1, false);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 280, 1, false);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Nature Gods bless me with dexterity!");
										p.sendMessage(" ");
										p.addPotionEffect(speedI);
										p.addPotionEffect(blind);
										cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Explorer.abilitycooldown.lvl40") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Explorer")) && explorerlevel >= 50 && explorerlevel <= 59) {
									if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
									{
										if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
											long timeleft = (cooldowns.get(event.getPlayer().getUniqueId()) - System.currentTimeMillis()) / 1000;
											p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

										}

									}
									if (!cooldowns.containsKey(event.getPlayer().getUniqueId())) {
										Location loc = p.getTargetBlock(null, Custom.get().getInt("Explorer.distance.lvl50")).getLocation().clone();
										loc.setPitch(p.getLocation().getPitch());
										loc.setYaw(p.getLocation().getYaw());
										p.teleport(loc);
										p.playSound(p.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, 10.0F, 0F);
										p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 10.0F, 1.0F);
										PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 25, 1, false);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 380, 1, false);
										PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, 260, 1, false);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Nature Gods bless me with dexterity!");
										p.sendMessage(" ");
										p.addPotionEffect(speedI);
										p.addPotionEffect(blind);
										p.addPotionEffect(jump);
										cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Explorer.abilitycooldown.lvl50") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Explorer")) && explorerlevel >= 60 && explorerlevel <= 69) {
									if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
									{
										if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
											long timeleft = (cooldowns.get(event.getPlayer().getUniqueId()) - System.currentTimeMillis()) / 1000;
											p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

										}

									}
									if (!cooldowns.containsKey(event.getPlayer().getUniqueId())) {
										Location loc = p.getTargetBlock(null, Custom.get().getInt("Explorer.distance.lvl60")).getLocation().clone();
										loc.setPitch(p.getLocation().getPitch());
										loc.setYaw(p.getLocation().getYaw());
										p.teleport(loc);
										p.playSound(p.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, 10.0F, 0F);
										p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 10.0F, 1.0F);
										PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 25, 1, false);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 440, 1, false);
										PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, 300, 2, false);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Nature Gods bless me with dexterity!");
										p.sendMessage(" ");
										p.addPotionEffect(speedI);
										p.addPotionEffect(blind);
										p.addPotionEffect(jump);
										cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Explorer.abilitycooldown.lvl60") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Explorer")) && explorerlevel >= 70 && explorerlevel <= 79) {
									if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
									{
										if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
											long timeleft = (cooldowns.get(event.getPlayer().getUniqueId()) - System.currentTimeMillis()) / 1000;
											p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

										}

									}
									if (!cooldowns.containsKey(event.getPlayer().getUniqueId())) {
										Location loc = p.getTargetBlock(null, Custom.get().getInt("Explorer.distance.lvl70")).getLocation().clone();
										loc.setPitch(p.getLocation().getPitch());
										loc.setYaw(p.getLocation().getYaw());
										p.teleport(loc);
										p.playSound(p.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, 10.0F, 0F);
										p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 10.0F, 1.0F);
										PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 25, 1, false);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 500, 3, false);
										PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, 340, 2, false);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Nature Gods bless me with dexterity!");
										p.sendMessage(" ");
										p.addPotionEffect(speedI);
										p.addPotionEffect(blind);
										p.addPotionEffect(jump);
										cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Explorer.abilitycooldown.lvl70") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Explorer")) && explorerlevel >= 80 && explorerlevel <= 89) {
									if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
									{
										if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
											long timeleft = (cooldowns.get(event.getPlayer().getUniqueId()) - System.currentTimeMillis()) / 1000;
											p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

										}

									}
									if (!cooldowns.containsKey(event.getPlayer().getUniqueId())) {
										Location loc = p.getTargetBlock(null, Custom.get().getInt("Explorer.distance.lvl80")).getLocation().clone();
										loc.setPitch(p.getLocation().getPitch());
										loc.setYaw(p.getLocation().getYaw());
										p.teleport(loc);
										p.playSound(p.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, 10.0F, 0F);
										p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 10.0F, 1.0F);
										PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 25, 1, false);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 560, 4, false);
										PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, 380, 3, false);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Nature Gods bless me with dexterity!");
										p.sendMessage(" ");
										p.addPotionEffect(speedI);
										p.addPotionEffect(blind);
										p.addPotionEffect(jump);
										cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Explorer.abilitycooldown.lvl80") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Explorer")) && explorerlevel >= 90 && explorerlevel <= 99) {
									if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
									{
										if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
											long timeleft = (cooldowns.get(event.getPlayer().getUniqueId()) - System.currentTimeMillis()) / 1000;
											p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

										}

									}
									if (!cooldowns.containsKey(event.getPlayer().getUniqueId())) {
										Location loc = p.getTargetBlock(null, Custom.get().getInt("Explorer.distance.lvl90")).getLocation().clone();
										loc.setPitch(p.getLocation().getPitch());
										loc.setYaw(p.getLocation().getYaw());
										p.teleport(loc);
										p.playSound(p.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, 10.0F, 0F);
										p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 10.0F, 1.0F);
										PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 25, 1, false);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 620, 4, false);
										PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, 420, 4, false);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Nature Gods bless me with dexterity!");
										p.sendMessage(" ");
										p.addPotionEffect(speedI);
										p.addPotionEffect(blind);
										p.addPotionEffect(jump);
										cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Explorer.abilitycooldown.lvl90") * 1000L);
										Bukkit.getScheduler().runTask(NaturesHowl.getPlugin(), (Runnable) task);
									}
								}
								if (jobsPlayer.isInJob(Jobs.getJob("Explorer")) && explorerlevel >= 100) {
									if (cooldowns.containsKey(event.getPlayer().getUniqueId())) // player in hashmap
									{
										if (cooldowns.get(event.getPlayer().getUniqueId()) > System.currentTimeMillis()) {
											long timeleft = (cooldowns.get(event.getPlayer().getUniqueId()) - System.currentTimeMillis()) / 1000;
											p.sendMessage(ChatColor.RED + "You are still on cooldown for " + timeleft + " seconds");

										}

									}
									if (!cooldowns.containsKey(event.getPlayer().getUniqueId())) {
										Location loc = p.getTargetBlock(null, Custom.get().getInt("Explorer.distance.lvl100")).getLocation().clone();
										loc.setPitch(p.getLocation().getPitch());
										loc.setYaw(p.getLocation().getYaw());
										p.teleport(loc);
										p.playSound(p.getLocation(), Sound.ENTITY_ELDER_GUARDIAN_AMBIENT, 10.0F, 0F);
										p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 10.0F, 1.0F);
										PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 25, 1, false);
										PotionEffect speedI = new PotionEffect(PotionEffectType.SPEED, 460, 5, false);
										PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, 460, 5, false);
										p.sendMessage(" ");
										p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Nature Gods bless me with dexterity!");
										p.sendMessage(" ");
										p.addPotionEffect(speedI);
										p.addPotionEffect(blind);
										p.addPotionEffect(jump);
										cooldowns.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + Custom.get().getInt("Explorer.abilitycooldown.lvl100") * 1000L);
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
}
