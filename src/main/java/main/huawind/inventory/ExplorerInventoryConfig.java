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

public class ExplorerInventoryConfig {
    public void openGuiExplorer(Player p) {
        Inventory gui = Bukkit.createInventory(p, 54, "Explorer Config");
        ItemStack Explorer = new ItemStack(Material.STONE);
        ItemMeta ExplorerMeta = Explorer.getItemMeta();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 10");
        ArrayList<String> ExplorerLore = new ArrayList<>();
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.abilitycooldown.lvl10"));
        ExplorerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(0, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 20");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.abilitycooldown.lvl20"));
        ExplorerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(1, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 30");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.abilitycooldown.lvl30"));
        ExplorerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(2, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 40");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.abilitycooldown.lvl40"));
        ExplorerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(3, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 50");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.abilitycooldown.lvl50"));
        ExplorerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(4, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 60");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.abilitycooldown.lvl60"));
        ExplorerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(5, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 70");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.abilitycooldown.lvl70"));
        ExplorerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(6, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 80");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.abilitycooldown.lvl80"));
        ExplorerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(7, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 90");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.abilitycooldown.lvl90"));
        ExplorerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(8, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 100");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.abilitycooldown.lvl100"));
        ExplorerLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(9, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 10");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.distance.lvl10"));
        ExplorerLore.add(ChatColor.YELLOW + "How far you get teleported in blocks");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(27, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 20");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.distance.lvl20"));
        ExplorerLore.add(ChatColor.YELLOW + "How far you get teleported in blocks");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(28, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 30");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.distance.lvl30"));
        ExplorerLore.add(ChatColor.YELLOW + "How far you get teleported in blocks");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(29, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 40");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.distance.lvl40"));
        ExplorerLore.add(ChatColor.YELLOW + "How far you get teleported in blocks");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(30, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 50");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.distance.lvl50"));
        ExplorerLore.add(ChatColor.YELLOW + "How far you get teleported in blocks");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(31, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 60");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.distance.lvl60"));
        ExplorerLore.add(ChatColor.YELLOW + "How far you get teleported in blocks");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(32, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 70");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.distance.lvl70"));
        ExplorerLore.add(ChatColor.YELLOW + "How far you get teleported in blocks");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(33, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 80");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.distance.lvl80"));
        ExplorerLore.add(ChatColor.YELLOW + "How far you get teleported in blocks");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(34, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 90");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.distance.lvl90"));
        ExplorerLore.add(ChatColor.YELLOW + "How far you get teleported in blocks");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(35, Explorer);
        ExplorerLore.clear();

        ExplorerMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 100");
        ExplorerLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Explorer.distance.lvl100"));
        ExplorerLore.add(ChatColor.YELLOW + "How far you get teleported in blocks");
        ExplorerLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        ExplorerMeta.setLore(ExplorerLore);
        Explorer.setItemMeta(ExplorerMeta);
        gui.setItem(36, Explorer);
        ExplorerLore.clear();

        p.openInventory(gui);
    }
}
