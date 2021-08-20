package main.huawind.inventory;

import main.huawind.files.Custom;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MinerInventoryConfig {
    public void openGuiMiner(Player p) {
        Inventory gui = Bukkit.createInventory(p, 54, "Miner Config");
        ItemStack Miner = new ItemStack(Material.STONE);
        ItemMeta MinerMeta = Miner.getItemMeta();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Cooldown Lvl 10");
        ArrayList<String> MinerLore = new ArrayList<>();
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.cooldown.lvl10"));
        MinerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta); 
        gui.setItem(0, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Cooldown Lvl 20");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.cooldown.lvl20"));
        MinerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(1, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Cooldown Lvl 30");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.cooldown.lvl30"));
        MinerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(2, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Cooldown Lvl 40");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.cooldown.lvl40"));
        MinerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(3, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Cooldown Lvl 50");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.cooldown.lvl50"));
        MinerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(4, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Cooldown Lvl 60");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.cooldown.lvl60"));
        MinerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(5, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Cooldown Lvl 70");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.cooldown.lvl70"));
        MinerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(6, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Cooldown Lvl 80");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.cooldown.lvl80"));
        MinerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(7, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Cooldown Lvl 90");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.cooldown.lvl90"));
        MinerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(8, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Cooldown Lvl 100");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.cooldown.lvl100"));
        MinerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(9, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Duration Lvl 10");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.abilityduration.lvl10"));
        MinerLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(18, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Duration Lvl 20");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.abilityduration.lvl20"));
        MinerLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(19, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Duration Lvl 30");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.abilityduration.lvl30"));
        MinerLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(20, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Duration Lvl 40");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.abilityduration.lvl40"));
        MinerLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(21, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Duration Lvl 50");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.abilityduration.lvl50"));
        MinerLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(22, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Duration Lvl 60");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.abilityduration.lvl60"));
        MinerLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(23, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Duration Lvl 70");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.abilityduration.lvl70"));
        MinerLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(24, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Duration Lvl 80");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.abilityduration.lvl80"));
        MinerLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(25, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Duration Lvl 90");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.abilityduration.lvl90"));
        MinerLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(26, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Duration Lvl 100");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.abilityduration.lvl100"));
        MinerLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(27, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Radius Lvl 10");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.radius.lvl10"));
        MinerLore.add(ChatColor.YELLOW + "The radius of the superbreaker");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(36, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Radius Lvl 20");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.radius.lvl20"));
        MinerLore.add(ChatColor.YELLOW + "The radius of the superbreaker");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(37, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Radius Lvl 30");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.radius.lvl30"));
        MinerLore.add(ChatColor.YELLOW + "The radius of the superbreaker");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(38, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Radius Lvl 40");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.radius.lvl40"));
        MinerLore.add(ChatColor.YELLOW + "The radius of the superbreaker");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(39, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Radius Lvl 50");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.radius.lvl50"));
        MinerLore.add(ChatColor.YELLOW + "The radius of the superbreaker");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(40, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Radius Lvl 60");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.radius.lvl60"));
        MinerLore.add(ChatColor.YELLOW + "The radius of the superbreaker");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(41, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Radius Lvl 70");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.radius.lvl70"));
        MinerLore.add(ChatColor.YELLOW + "The radius of the superbreaker");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(42, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Radius Lvl 80");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.radius.lvl80"));
        MinerLore.add(ChatColor.YELLOW + "The radius of the superbreaker");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(43, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Radius Lvl 90");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.radius.lvl90"));
        MinerLore.add(ChatColor.YELLOW + "The radius of the superbreaker");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(44, Miner);
        MinerLore.clear();

        MinerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Miner Radius Lvl 100");
        MinerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Miner.radius.lvl100"));
        MinerLore.add(ChatColor.YELLOW + "The radius of the superbreaker");
        MinerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        MinerMeta.setLore(MinerLore);
        Miner.setItemMeta(MinerMeta);
        gui.setItem(45, Miner);
        MinerLore.clear();

        p.openInventory(gui);
    }
}
