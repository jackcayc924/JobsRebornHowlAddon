package main.huawind.Abilities;

import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.container.Job;
import com.gamingmesh.jobs.container.JobsPlayer;
import com.sk89q.worldguard.internal.flywaydb.core.internal.util.StringUtils;
import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import org.bukkit.*;
import org.bukkit.entity.Fish;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.bukkit.Bukkit.getServer;

public class FishermanAbility implements Listener {
	Random random = new Random();
	List<Material> lvl10reward = Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.GOLDEN_APPLE);
	List<Material> lvl20reward = Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.GOLDEN_APPLE, Material.DIAMOND);
	List<Material> lvl30reward = Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.GOLDEN_APPLE, Material.DIAMOND, Material.EMERALD);
	List<Material> lvl40reward = Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.GOLDEN_APPLE, Material.DIAMOND, Material.EMERALD);
	List<Material> lvl50reward = Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.GOLDEN_APPLE, Material.DIAMOND, Material.EMERALD);
	List<Material> lvl60reward = Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.GOLDEN_APPLE, Material.DIAMOND, Material.EMERALD);
	List<Material> lvl70reward = Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.GOLDEN_APPLE, Material.DIAMOND, Material.EMERALD);
	List<Material> lvl80reward = Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.GOLDEN_APPLE, Material.DIAMOND, Material.EMERALD);
	List<Material> lvl90reward = Arrays.asList(Material.IRON_INGOT, Material.GOLD_INGOT, Material.GOLDEN_APPLE, Material.DIAMOND, Material.EMERALD);
	List<Material> lvl100reward = Arrays.asList(Material.GOLD_INGOT, Material.ENCHANTED_GOLDEN_APPLE, Material.DIAMOND, Material.EMERALD);

	public static Boolean percentChance(double chance) {
		return Math.random() <= chance;
	}

	public boolean night() {
		Server server = getServer();
		long time = server.getWorld("overworld").getTime();
		return time > 18000 && time < 23000;
	}

	// BEGIN MAIN FISHERMAN ABILITY
	@EventHandler
	public void customdrop(PlayerFishEvent e) {
		Material result;
		JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(e.getPlayer().getUniqueId());
		Job fisherman = Jobs.getJob("Fisherman");
		if (jobsPlayer.isInJob(fisherman)) {
			int fishermanlevel = jobsPlayer.getJobProgression(fisherman).getLevel();
			if (jobsPlayer.isInJob(Jobs.getJob("Fisherman")) && fishermanlevel >= 10 && fishermanlevel <= 19) {
				e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.minimum.lvl10") * 20);
				e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.maxtime.lvl10") * 20); // wait time reduced by 2 seconds
				if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
					if (percentChance(Custom.get().getInt("Fisherman.chance.lvl10"))) { // chance to get custom drop
						Player p = e.getPlayer();

						Location loc = e.getPlayer().getLocation();
						result = lvl10reward.get(random.nextInt(lvl10reward.size()));
						if (result.equals(Material.IRON_INGOT) || result.equals(Material.GOLD_INGOT)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(2);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 2 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.GOLDEN_APPLE)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
					}
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Fisherman")) && fishermanlevel >= 20 && fishermanlevel <= 29) {
				if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
					if (percentChance(Custom.get().getInt("Fisherman.chance.lvl20"))) {
						e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.minimum.lvl20") * 20);
						e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.maxtime.lvl20") * 20); // wait time reduced by 2 seconds
						Player p = e.getPlayer();
						Location loc = e.getPlayer().getLocation();
						result = lvl20reward.get(random.nextInt(lvl20reward.size()));
						if (result.equals(Material.IRON_INGOT) || result.equals(Material.GOLD_INGOT)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(10);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 5 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.DIAMOND)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1); // ADD DIAMOND LVL 20
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.GOLDEN_APPLE)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
					}
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Fisherman")) && fishermanlevel >= 30 && fishermanlevel <= 39) {
				if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
					if (percentChance(Custom.get().getInt("Fisherman.chance.lvl30"))) {
						e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.minimum.lvl30") * 20);
						e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.maxtime.lvl30") * 20); // wait time reduced by 2 seconds
						Player p = e.getPlayer();
						Location loc = e.getPlayer().getLocation();
						result = lvl30reward.get(random.nextInt(lvl30reward.size()));
						if (result.equals(Material.IRON_INGOT) || result.equals(Material.GOLD_INGOT)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(15);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 5 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.DIAMOND) || result.equals(Material.EMERALD)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(2);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.GOLDEN_APPLE)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
					}
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Fisherman")) && fishermanlevel >= 40 && fishermanlevel <= 49) {
				if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
					if (percentChance(Custom.get().getInt("Fisherman.chance.lvl40"))) {
						e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.minimum.lvl40") * 20);
						e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.maxtime.lvl40") * 20); // wait time reduced by 2 seconds
						Player p = e.getPlayer();
						Location loc = e.getPlayer().getLocation();
						result = lvl40reward.get(random.nextInt(lvl40reward.size()));
						if (result.equals(Material.IRON_INGOT) || result.equals(Material.GOLD_INGOT)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(15);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 5 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.DIAMOND) || result.equals(Material.EMERALD)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(2);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.GOLDEN_APPLE)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
					}
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Fisherman")) && fishermanlevel >= 50 && fishermanlevel <= 59) {
				if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
					if (percentChance(Custom.get().getInt("Fisherman.chance.lvl50"))) {
						if (night()) {
							e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.nightminimum.lvl50") * 20);
							e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.nightmaxtime.lvl50") * 20);
						}
						e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.minimum.lvl50") * 20);
						e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.maxtime.lvl50") * 20); // wait time reduced by 2 seconds
						Player p = e.getPlayer();
						Location loc = e.getPlayer().getLocation();
						result = lvl50reward.get(random.nextInt(lvl50reward.size()));
						if (result.equals(Material.IRON_INGOT) || result.equals(Material.GOLD_INGOT)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(15);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 5 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.DIAMOND) || result.equals(Material.EMERALD)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(2);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.GOLDEN_APPLE)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
					}
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Fisherman")) && fishermanlevel >= 60 && fishermanlevel <= 69) {
				if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
					if (percentChance(Custom.get().getInt("Fisherman.chance.lvl60"))) {
						if (night()) {
							e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.nightminimum.lvl60") * 20);
							e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.nightmaxtime.lvl60") * 20);
						}
						e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.minimum.lvl60") * 20);
						e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.maxtime.lvl60") * 20); // wait time reduced by 2 seconds
						Player p = e.getPlayer();
						Location loc = e.getPlayer().getLocation();
						result = lvl60reward.get(random.nextInt(lvl60reward.size()));
						if (result.equals(Material.IRON_INGOT) || result.equals(Material.GOLD_INGOT)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(15);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 5 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.DIAMOND) || result.equals(Material.EMERALD)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(2);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.GOLDEN_APPLE)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
					}
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Fisherman")) && fishermanlevel >= 70 && fishermanlevel <= 79) {
				if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
					if (percentChance(Custom.get().getInt("Fisherman.chance.lvl70"))) {
						if (night()) {
							e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.nightminimum.lvl70") * 20);
							e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.nightmaxtime.lvl70") * 20);
						}
						e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.minimum.lvl70") * 20);
						e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.maxtime.lvl70") * 20); // wait time reduced by 2 seconds
						Player p = e.getPlayer();
						Location loc = e.getPlayer().getLocation();
						result = lvl70reward.get(random.nextInt(lvl70reward.size()));
						if (result.equals(Material.IRON_INGOT) || result.equals(Material.GOLD_INGOT)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(15);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 5 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.DIAMOND) || result.equals(Material.EMERALD)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(2);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.GOLDEN_APPLE)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
					}
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Fisherman")) && fishermanlevel >= 80 && fishermanlevel <= 89) {
				if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
					if (percentChance(Custom.get().getInt("Fisherman.chance.lvl80"))) {
						if (night()) {
							e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.nightminimum.lvl80") * 20);
							e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.nightmaxtime.lvl80") * 20);
						}
						e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.minimum.lvl80") * 20);
						e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.maxtime.lvl80") * 20); // wait time reduced by 2 seconds
						Player p = e.getPlayer();
						Location loc = e.getPlayer().getLocation();
						result = lvl80reward.get(random.nextInt(lvl80reward.size()));
						if (result.equals(Material.IRON_INGOT) || result.equals(Material.GOLD_INGOT)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(15);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 5 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.DIAMOND) || result.equals(Material.EMERALD)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(2);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.GOLDEN_APPLE)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
					}
				}
			}
			if (jobsPlayer.isInJob(Jobs.getJob("Fisherman")) && fishermanlevel >= 90 && fishermanlevel <= 99) {
				if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
					if (percentChance(Custom.get().getInt("Fisherman.chance.lvl90"))) {
						if (night()) {
							e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.nightminimum.lvl90") * 20);
							e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.nightmaxtime.lvl90") * 20);
						}
						e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.minimum.lvl90") * 20);
						e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.maxtime.lvl90") * 20); // wait time reduced by 2 seconds
						Player p = e.getPlayer();
						Location loc = e.getPlayer().getLocation();
						result = lvl90reward.get(random.nextInt(lvl90reward.size()));
						if (result.equals(Material.IRON_INGOT) || result.equals(Material.GOLD_INGOT)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(15);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 5 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.DIAMOND) || result.equals(Material.EMERALD)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(2);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.GOLDEN_APPLE)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
					}
				}
			}

			if (jobsPlayer.isInJob(Jobs.getJob("Fisherman")) && fishermanlevel == 100) {
				if (e.getState() == PlayerFishEvent.State.CAUGHT_FISH) {
					if (percentChance(Custom.get().getInt("Fisherman.chance.lvl100"))) {
						if (night()) {
							e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.nightminimum.lvl100") * 20);
							e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.nightmaxtime.lvl100") * 20);
						}
						e.getHook().setMinWaitTime(Custom.get().getInt("Fisherman.minimum.lvl100") * 20);
						e.getHook().setMaxWaitTime(Custom.get().getInt("Fisherman.maxtime.lvl100") * 20);
						Player p = e.getPlayer();
						Location loc = e.getPlayer().getLocation();
						result = lvl100reward.get(random.nextInt(lvl100reward.size()));
						if (result.equals(Material.GOLD_INGOT)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(40);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 40 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.EMERALD) || result.equals(Material.DIAMOND)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(10);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in 10 " + item.getType().name().replace("_", " ").toLowerCase());
						}
						if (result.equals(Material.ENCHANTED_GOLDEN_APPLE)) {
							ItemStack item = new ItemStack(result);
							item.setAmount(1);
							p.getWorld().dropItem(loc, item);
							p.sendMessage(ChatColor.AQUA + " " + ChatColor.BOLD + "FISHERMAN:" + ChatColor.RESET + "" + ChatColor.AQUA + " Oh? You have gotten lucky and reeled in a " + item.getType().name().replace("_", " ").toLowerCase());
						}
					}
				}
			}
		}
	}
}
