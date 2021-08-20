package main.huawind;

import main.huawind.files.Custom;
import org.bukkit.ChatColor;

public class configData {
	public void loadConfig() {

		Custom.setup();

		Custom.get().addDefault("thirstycooldown", 500);
		Custom.get().addDefault("jobscooldown", 10800);
		Custom.get().addDefault("cropcooldown", 5);
		Custom.get().addDefault("explorocooldown", 5);
		Custom.get().addDefault("veinminer.players", "NONE");
		Custom.get().addDefault("exploroMap.", null);

		Custom.get().addDefault("Builder.refund.lvl10", 0.05);
		Custom.get().addDefault("Builder.refund.lvl20", 0.06);
		Custom.get().addDefault("Builder.refund.lvl30", 0.07);
		Custom.get().addDefault("Builder.refund.lvl40", 0.08);
		Custom.get().addDefault("Builder.refund.lvl50", 0.09);
		Custom.get().addDefault("Builder.refund.lvl60", 0.10);
		Custom.get().addDefault("Builder.refund.lvl70", 0.11);
		Custom.get().addDefault("Builder.refund.lvl80", 0.12);
		Custom.get().addDefault("Builder.refund.lvl90", 0.13);
		Custom.get().addDefault("Builder.refund.lvl100", 0.20);

		Custom.get().addDefault("Builder.doubleitem.lvl10", 0.05);
		Custom.get().addDefault("Builder.doubleitem.lvl20", 0.06);
		Custom.get().addDefault("Builder.doubleitem.lvl30", 0.07);
		Custom.get().addDefault("Builder.doubleitem.lvl40", 0.08);
		Custom.get().addDefault("Builder.doubleitem.lvl50", 0.09);
		Custom.get().addDefault("Builder.doubleitem.lvl60", 0.10);
		Custom.get().addDefault("Builder.doubleitem.lvl70", 0.11);
		Custom.get().addDefault("Builder.doubleitem.lvl80", 0.12);
		Custom.get().addDefault("Builder.doubleitem.lvl90", 0.13);
		Custom.get().addDefault("Builder.doubleitem.lvl100", 0.20);

		Custom.get().addDefault("Explorer.abilitycooldown.lvl10",120);
		Custom.get().addDefault("Explorer.abilitycooldown.lvl20",70);
		Custom.get().addDefault("Explorer.abilitycooldown.lvl30",60);
		Custom.get().addDefault("Explorer.abilitycooldown.lvl40",50);
		Custom.get().addDefault("Explorer.abilitycooldown.lvl50",40);
		Custom.get().addDefault("Explorer.abilitycooldown.lvl60",30);
		Custom.get().addDefault("Explorer.abilitycooldown.lvl70",20);
		Custom.get().addDefault("Explorer.abilitycooldown.lvl80",15);
		Custom.get().addDefault("Explorer.abilitycooldown.lvl90",10);
		Custom.get().addDefault("Explorer.abilitycooldown.lvl100",5);

		Custom.get().addDefault("Explorer.distance.lvl10", 5);
		Custom.get().addDefault("Explorer.distance.lvl20", 10);
		Custom.get().addDefault("Explorer.distance.lvl30", 15);
		Custom.get().addDefault("Explorer.distance.lvl40", 20);
		Custom.get().addDefault("Explorer.distance.lvl50", 20);
		Custom.get().addDefault("Explorer.distance.lvl60", 20);
		Custom.get().addDefault("Explorer.distance.lvl70", 20);
		Custom.get().addDefault("Explorer.distance.lvl80", 20);
		Custom.get().addDefault("Explorer.distance.lvl90", 20);
		Custom.get().addDefault("Explorer.distance.lvl100", 20);

		Custom.get().addDefault("Farmer.cooldown.lvl10", 60);
		Custom.get().addDefault("Farmer.cooldown.lvl20", 50);
		Custom.get().addDefault("Farmer.cooldown.lvl30", 40);
		Custom.get().addDefault("Farmer.cooldown.lvl40", 30);
		Custom.get().addDefault("Farmer.cooldown.lvl50", 20);
		Custom.get().addDefault("Farmer.cooldown.lvl60", 15);
		Custom.get().addDefault("Farmer.cooldown.lvl70", 10);
		Custom.get().addDefault("Farmer.cooldown.lvl80", 5);
		Custom.get().addDefault("Farmer.cooldown.lvl90", 2);

		Custom.get().addDefault("Farmer.drops.lvl10", 0.15);
		Custom.get().addDefault("Farmer.drops.lvl20", 0.15);
		Custom.get().addDefault("Farmer.drops.lvl30", 0.15);
		Custom.get().addDefault("Farmer.drops.lvl40", 0.15);
		Custom.get().addDefault("Farmer.drops.lvl50", 0.15);
		Custom.get().addDefault("Farmer.drops.lvl60", 0.15);
		Custom.get().addDefault("Farmer.drops.lvl70", 0.15);
		Custom.get().addDefault("Farmer.drops.lvl80", 0.15);
		Custom.get().addDefault("Farmer.drops.lvl90", 0.15);
		Custom.get().addDefault("Farmer.drops.lvl100", 0.15);

		Custom.get().addDefault("Farmer.dropamount.lvl10", 2);
		Custom.get().addDefault("Farmer.dropamount.lvl20", 3);
		Custom.get().addDefault("Farmer.dropamount.lvl30", 4);
		Custom.get().addDefault("Farmer.dropamount.lvl40", 5);
		Custom.get().addDefault("Farmer.dropamount.lvl50", 6);
		Custom.get().addDefault("Farmer.dropamount.lvl60", 7);
		Custom.get().addDefault("Farmer.dropamount.lvl70", 8);
		Custom.get().addDefault("Farmer.dropamount.lvl80", 9);
		Custom.get().addDefault("Farmer.dropamount.lvl90", 10);
		Custom.get().addDefault("Farmer.dropamount.lvl100", 15);

		Custom.get().addDefault("Fisherman.chance.lvl10", 0.05);
		Custom.get().addDefault("Fisherman.chance.lvl20", 0.06);
		Custom.get().addDefault("Fisherman.chance.lvl30", 0.07);
		Custom.get().addDefault("Fisherman.chance.lvl40", 0.08);
		Custom.get().addDefault("Fisherman.chance.lvl50", 0.09);
		Custom.get().addDefault("Fisherman.chance.lvl60", 0.10);
		Custom.get().addDefault("Fisherman.chance.lvl70", 0.11);
		Custom.get().addDefault("Fisherman.chance.lvl80", 0.12);
		Custom.get().addDefault("Fisherman.chance.lvl90", 0.13);
		Custom.get().addDefault("Fisherman.chance.lvl100", 0.10);

		Custom.get().addDefault("Fisherman.minimum.lvl10", 5);
		Custom.get().addDefault("Fisherman.minimum.lvl20", 5);
		Custom.get().addDefault("Fisherman.minimum.lvl30", 5);
		Custom.get().addDefault("Fisherman.minimum.lvl40", 5);
		Custom.get().addDefault("Fisherman.minimum.lvl50", 5);
		Custom.get().addDefault("Fisherman.minimum.lvl60", 5);
		Custom.get().addDefault("Fisherman.minimum.lvl70", 5);
		Custom.get().addDefault("Fisherman.minimum.lvl80", 5);
		Custom.get().addDefault("Fisherman.minimum.lvl90", 5);
		Custom.get().addDefault("Fisherman.minimum.lvl100", 1);

		Custom.get().addDefault("Fisherman.maxtime.lvl10", 27);
		Custom.get().addDefault("Fisherman.maxtime.lvl20", 24);
		Custom.get().addDefault("Fisherman.maxtime.lvl30", 21);
		Custom.get().addDefault("Fisherman.maxtime.lvl40", 19);
		Custom.get().addDefault("Fisherman.maxtime.lvl50", 17);
		Custom.get().addDefault("Fisherman.maxtime.lvl60", 13);
		Custom.get().addDefault("Fisherman.maxtime.lvl70", 12);
		Custom.get().addDefault("Fisherman.maxtime.lvl80", 9);
		Custom.get().addDefault("Fisherman.maxtime.lvl90", 7);
		Custom.get().addDefault("Fisherman.maxtime.lvl100", 1);

		Custom.get().addDefault("Fisherman.nightminimum.lvl50", 3);
		Custom.get().addDefault("Fisherman.nightminimum.lvl60", 2);
		Custom.get().addDefault("Fisherman.nightminimum.lvl70", 1);
		Custom.get().addDefault("Fisherman.nightminimum.lvl80", 1);
		Custom.get().addDefault("Fisherman.nightminimum.lvl90", 1);
		Custom.get().addDefault("Fisherman.nightminimum.lvl100", 1);

		Custom.get().addDefault("Fisherman.nightmaxtime.lvl50", 15);
		Custom.get().addDefault("Fisherman.nightmaxtime.lvl60", 13);
		Custom.get().addDefault("Fisherman.nightmaxtime.lvl70", 11);
		Custom.get().addDefault("Fisherman.nightmaxtime.lvl80", 9);
		Custom.get().addDefault("Fisherman.nightmaxtime.lvl90", 7);
		Custom.get().addDefault("Fisherman.nightmaxtime.lvl100", 7);

		Custom.get().addDefault("Hunter.cooldown.lvl10", 120);
		Custom.get().addDefault("Hunter.cooldown.lvl20", 110);
		Custom.get().addDefault("Hunter.cooldown.lvl30", 100);
		Custom.get().addDefault("Hunter.cooldown.lvl40", 90);
		Custom.get().addDefault("Hunter.cooldown.lvl50", 80);
		Custom.get().addDefault("Hunter.cooldown.lvl60", 70);
		Custom.get().addDefault("Hunter.cooldown.lvl70", 60);
		Custom.get().addDefault("Hunter.cooldown.lvl80", 50);
		Custom.get().addDefault("Hunter.cooldown.lvl90", 40);
		Custom.get().addDefault("Hunter.cooldown.lvl100", 30);

		Custom.get().addDefault("Hunter.abilityduration.lvl10", 6);
		Custom.get().addDefault("Hunter.abilityduration.lvl20", 8);
		Custom.get().addDefault("Hunter.abilityduration.lvl30", 10);
		Custom.get().addDefault("Hunter.abilityduration.lvl40", 12);
		Custom.get().addDefault("Hunter.abilityduration.lvl50", 15);
		Custom.get().addDefault("Hunter.abilityduration.lvl60", 16);
		Custom.get().addDefault("Hunter.abilityduration.lvl70", 18);
		Custom.get().addDefault("Hunter.abilityduration.lvl80", 18);
		Custom.get().addDefault("Hunter.abilityduration.lvl90", 20);
		Custom.get().addDefault("Hunter.abilityduration.lvl100", 20);

		Custom.get().addDefault("Miner.cooldown.lvl10", 120);
		Custom.get().addDefault("Miner.cooldown.lvl20", 110);
		Custom.get().addDefault("Miner.cooldown.lvl30", 100);
		Custom.get().addDefault("Miner.cooldown.lvl40", 90);
		Custom.get().addDefault("Miner.cooldown.lvl50", 80);
		Custom.get().addDefault("Miner.cooldown.lvl60", 70);
		Custom.get().addDefault("Miner.cooldown.lvl70", 60);
		Custom.get().addDefault("Miner.cooldown.lvl80", 50);
		Custom.get().addDefault("Miner.cooldown.lvl90", 40);
		Custom.get().addDefault("Miner.cooldown.lvl100", 30);

		Custom.get().addDefault("Miner.abilityduration.lvl10", 3);
		Custom.get().addDefault("Miner.abilityduration.lvl20", 3);
		Custom.get().addDefault("Miner.abilityduration.lvl30", 3);
		Custom.get().addDefault("Miner.abilityduration.lvl40", 3);
		Custom.get().addDefault("Miner.abilityduration.lvl50", 3);
		Custom.get().addDefault("Miner.abilityduration.lvl60", 3);
		Custom.get().addDefault("Miner.abilityduration.lvl70", 3);
		Custom.get().addDefault("Miner.abilityduration.lvl80", 3);
		Custom.get().addDefault("Miner.abilityduration.lvl90", 3);
		Custom.get().addDefault("Miner.abilityduration.lvl100", 3);

		Custom.get().addDefault("Miner.radius.lvl10", 1);
		Custom.get().addDefault("Miner.radius.lvl20", 1);
		Custom.get().addDefault("Miner.radius.lvl30", 1);
		Custom.get().addDefault("Miner.radius.lvl40", 1);
		Custom.get().addDefault("Miner.radius.lvl50", 1);
		Custom.get().addDefault("Miner.radius.lvl60", 1);
		Custom.get().addDefault("Miner.radius.lvl70", 1);
		Custom.get().addDefault("Miner.radius.lvl80", 1);
		Custom.get().addDefault("Miner.radius.lvl90", 1);
		Custom.get().addDefault("Miner.radius.lvl100", 2);

		Custom.get().addDefault("Woodcutter.cooldown.lvl10", 120);
		Custom.get().addDefault("Woodcutter.cooldown.lvl20", 110);
		Custom.get().addDefault("Woodcutter.cooldown.lvl30", 100);
		Custom.get().addDefault("Woodcutter.cooldown.lvl40", 90);
		Custom.get().addDefault("Woodcutter.cooldown.lvl50", 80);
		Custom.get().addDefault("Woodcutter.cooldown.lvl60", 70);
		Custom.get().addDefault("Woodcutter.cooldown.lvl70", 60);
		Custom.get().addDefault("Woodcutter.cooldown.lvl80", 50);
		Custom.get().addDefault("Woodcutter.cooldown.lvl90", 40);
		Custom.get().addDefault("Woodcutter.cooldown.lvl100", 30);

		Custom.get().addDefault("Woodcutter.abilityduration.lvl10", 5);
		Custom.get().addDefault("Woodcutter.abilityduration.lvl20", 7);
		Custom.get().addDefault("Woodcutter.abilityduration.lvl30", 3);
		Custom.get().addDefault("Woodcutter.abilityduration.lvl40", 3);
		Custom.get().addDefault("Woodcutter.abilityduration.lvl50", 3);
		Custom.get().addDefault("Woodcutter.abilityduration.lvl60", 3);
		Custom.get().addDefault("Woodcutter.abilityduration.lvl70", 3);
		Custom.get().addDefault("Woodcutter.abilityduration.lvl80", 3);
		Custom.get().addDefault("Woodcutter.abilityduration.lvl90", 3);
		Custom.get().addDefault("Woodcutter.abilityduration.lvl100", 3);

		Custom.get().addDefault("Woodcutter.saplings.lvl10", 0.15);
		Custom.get().addDefault("Woodcutter.saplings.lvl20", 0.15);
		Custom.get().addDefault("Woodcutter.saplings.lvl30", 0.15);
		Custom.get().addDefault("Woodcutter.saplings.lvl40", 0.15);
		Custom.get().addDefault("Woodcutter.saplings.lvl50", 0.15);
		Custom.get().addDefault("Woodcutter.saplings.lvl60", 0.15);
		Custom.get().addDefault("Woodcutter.saplings.lvl70", 0.15);
		Custom.get().addDefault("Woodcutter.saplings.lvl80", 0.15);
		Custom.get().addDefault("Woodcutter.saplings.lvl90", 0.15);
		Custom.get().addDefault("Woodcutter.saplings.lvl100", 0.15);
		
		Custom.get().options().copyDefaults(true);
		Custom.save();
	}
}
