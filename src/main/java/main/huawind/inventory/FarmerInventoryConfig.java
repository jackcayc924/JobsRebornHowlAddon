package main.huawind.inventory;

import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class FarmerInventoryConfig {
    public void openGuiFarmer(Player p) {
        Inventory gui = Bukkit.createInventory(p, 54, "Farmer Config");
        ItemStack Farmer = new ItemStack(Material.STONE);
        ItemMeta FarmerMeta = Farmer.getItemMeta();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 10");
        ArrayList<String> FarmerLore = new ArrayList<>();
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.cooldown.lvl10"));
        FarmerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(0, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 20");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.cooldown.lvl20"));
        FarmerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(1, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 30");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.cooldown.lvl30"));
        FarmerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(2, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 40");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.cooldown.lvl40"));
        FarmerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(3, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 50");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.cooldown.lvl50"));
        FarmerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(4, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 60");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.cooldown.lvl60"));
        FarmerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(5, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 70");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.cooldown.lvl70"));
        FarmerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(6, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 80");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.cooldown.lvl80"));
        FarmerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(7, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 90");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.cooldown.lvl90"));
        FarmerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(8, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 10");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.drops.lvl10"));
        FarmerLore.add(ChatColor.YELLOW + "Percent chance to get more drops");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(18, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 20");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.drops.lvl20"));
        FarmerLore.add(ChatColor.YELLOW + "Percent chance to get more drops");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(19, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 30");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.drops.lvl30"));
        FarmerLore.add(ChatColor.YELLOW + "Percent chance to get more drops");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(20, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 40");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.drops.lvl40"));
        FarmerLore.add(ChatColor.YELLOW + "Percent chance to get more drops");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(21, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 50");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.drops.lvl50"));
        FarmerLore.add(ChatColor.YELLOW + "Percent chance to get more drops");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(22, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 60");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.drops.lvl60"));
        FarmerLore.add(ChatColor.YELLOW + "Percent chance to get more drops");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(23, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 70");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.drops.lvl70"));
        FarmerLore.add(ChatColor.YELLOW + "Percent chance to get more drops");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(24, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 80");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.drops.lvl80"));
        FarmerLore.add(ChatColor.YELLOW + "Percent chance to get more drops");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(25, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 90");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.drops.lvl90"));
        FarmerLore.add(ChatColor.YELLOW + "Percent chance to get more drops");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(26, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 100");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.drops.lvl100"));
        FarmerLore.add(ChatColor.YELLOW + "Percent chance to get more drops");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(27, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 10");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.dropamount.lvl10"));
        FarmerLore.add(ChatColor.YELLOW + "The amount of drops you get on harvest");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(36, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 20");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.dropamount.lvl20"));
        FarmerLore.add(ChatColor.YELLOW + "The amount of drops you get on harvest");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(37, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 30");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.dropamount.lvl30"));
        FarmerLore.add(ChatColor.YELLOW + "The amount of drops you get on harvest");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(38, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 40");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.dropamount.lvl40"));
        FarmerLore.add(ChatColor.YELLOW + "The amount of drops you get on harvest");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(39, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 50");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.dropamount.lvl50"));
        FarmerLore.add(ChatColor.YELLOW + "The amount of drops you get on harvest");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(40, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 60");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.dropamount.lvl60"));
        FarmerLore.add(ChatColor.YELLOW + "The amount of drops you get on harvest");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(41, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 70");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.dropamount.lvl70"));
        FarmerLore.add(ChatColor.YELLOW + "The amount of drops you get on harvest");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(42, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 80");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.dropamount.lvl80"));
        FarmerLore.add(ChatColor.YELLOW + "The amount of drops you get on harvest");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(43, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 90");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.dropamount.lvl90"));
        FarmerLore.add(ChatColor.YELLOW + "The amount of drops you get on harvest");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(44, Farmer);
        FarmerLore.clear();

        FarmerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 100");
        FarmerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Farmer.dropamount.lvl100"));
        FarmerLore.add(ChatColor.YELLOW + "The amount of drops you get on harvest");
        FarmerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FarmerMeta.setLore(FarmerLore);
        Farmer.setItemMeta(FarmerMeta);
        gui.setItem(45, Farmer);
        FarmerLore.clear();

        p.openInventory(gui);
    }
}
