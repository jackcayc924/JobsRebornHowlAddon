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

public class HunterInventoryConfig {
    public void openGuiHunter(Player p) {
        Inventory gui = Bukkit.createInventory(p, 54, "Hunter Config");
        ItemStack Hunter = new ItemStack(Material.STONE);
        ItemMeta HunterMeta = Hunter.getItemMeta();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Cooldown Lvl 10");
        ArrayList<String> HunterLore = new ArrayList<>();
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.cooldown.lvl10"));
        HunterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(0, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Cooldown Lvl 20");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.cooldown.lvl20"));
        HunterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(1, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Cooldown Lvl 30");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.cooldown.lvl30"));
        HunterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(2, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Cooldown Lvl 40");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.cooldown.lvl40"));
        HunterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(3, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Cooldown Lvl 50");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.cooldown.lvl50"));
        HunterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(4, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Cooldown Lvl 60");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.cooldown.lvl60"));
        HunterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(5, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Cooldown Lvl 70");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.cooldown.lvl70"));
        HunterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(6, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Cooldown Lvl 80");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.cooldown.lvl80"));
        HunterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(7, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Cooldown Lvl 90");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.cooldown.lvl90"));
        HunterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(8, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Cooldown Lvl 100");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.cooldown.lvl100"));
        HunterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(9, Hunter);
        HunterLore.clear();
        
        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Duration Lvl 10");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.abilityduration.lvl10"));
        HunterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(27, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Duration Lvl 20");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.abilityduration.lvl20"));
        HunterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(28, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Duration Lvl 30");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.abilityduration.lvl30"));
        HunterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(29, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Duration Lvl 40");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.abilityduration.lvl40"));
        HunterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(30, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Duration Lvl 50");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.abilityduration.lvl50"));
        HunterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(31, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Duration Lvl 60");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.abilityduration.lvl60"));
        HunterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(32, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Duration Lvl 70");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.abilityduration.lvl70"));
        HunterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(33, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Duration Lvl 80");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.abilityduration.lvl80"));
        HunterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(34, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Duration Lvl 90");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.abilityduration.lvl90"));
        HunterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(35, Hunter);
        HunterLore.clear();

        HunterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hunter Duration Lvl 100");
        HunterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Hunter.abilityduration.lvl100"));
        HunterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        HunterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        HunterMeta.setLore(HunterLore);
        Hunter.setItemMeta(HunterMeta);
        gui.setItem(36, Hunter);
        HunterLore.clear();

        p.openInventory(gui);


    }
}
