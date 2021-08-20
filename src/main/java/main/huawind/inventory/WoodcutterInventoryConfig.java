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

public class WoodcutterInventoryConfig {
    public void openGuiWoodcutter(Player p) {
        Inventory gui = Bukkit.createInventory(p, 54, "Woodcutter Config");
        ItemStack Woodcutter = new ItemStack(Material.STONE);
        ItemMeta WoodcutterMeta = Woodcutter.getItemMeta();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Cooldown Lvl 10");
        ArrayList<String> WoodcutterLore = new ArrayList<>();
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.cooldown.lvl10"));
        WoodcutterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(0, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Cooldown Lvl 20");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.cooldown.lvl20"));
        WoodcutterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(1, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Cooldown Lvl 30");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.cooldown.lvl30"));
        WoodcutterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(2, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Cooldown Lvl 40");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.cooldown.lvl40"));
        WoodcutterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(3, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Cooldown Lvl 50");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.cooldown.lvl50"));
        WoodcutterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(4, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Cooldown Lvl 60");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.cooldown.lvl60"));
        WoodcutterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(5, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Cooldown Lvl 70");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.cooldown.lvl70"));
        WoodcutterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(6, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Cooldown Lvl 80");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.cooldown.lvl80"));
        WoodcutterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(7, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Cooldown Lvl 90");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.cooldown.lvl90"));
        WoodcutterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(8, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Cooldown Lvl 100");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.cooldown.lvl100"));
        WoodcutterLore.add(ChatColor.YELLOW + "Cooldown in seconds after ability use");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(9, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Duration Lvl 10");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.abilityduration.lvl10"));
        WoodcutterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(18, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Duration Lvl 20");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.abilityduration.lvl20"));
        WoodcutterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(19, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Duration Lvl 30");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.abilityduration.lvl30"));
        WoodcutterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(20, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Duration Lvl 40");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.abilityduration.lvl40"));
        WoodcutterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(21, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Duration Lvl 50");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.abilityduration.lvl50"));
        WoodcutterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(22, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Duration Lvl 60");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.abilityduration.lvl60"));
        WoodcutterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(23, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Duration Lvl 70");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.abilityduration.lvl70"));
        WoodcutterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(24, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Duration Lvl 80");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.abilityduration.lvl80"));
        WoodcutterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(25, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Duration Lvl 90");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.abilityduration.lvl90"));
        WoodcutterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(26, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Duration Lvl 100");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.abilityduration.lvl100"));
        WoodcutterLore.add(ChatColor.YELLOW + "How long the ability lasts in seconds");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(27, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Saplings Lvl 10");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.saplings.lvl10"));
        WoodcutterLore.add(ChatColor.YELLOW + "Percent chance to grow trees on place");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(36, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Saplings Lvl 20");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.saplings.lvl20"));
        WoodcutterLore.add(ChatColor.YELLOW + "Percent chance to grow trees on place");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(37, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Saplings Lvl 30");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.saplings.lvl30"));
        WoodcutterLore.add(ChatColor.YELLOW + "Percent chance to grow trees on place");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(38, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Saplings Lvl 40");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.saplings.lvl40"));
        WoodcutterLore.add(ChatColor.YELLOW + "Percent chance to grow trees on place");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(39, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Saplings Lvl 50");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.saplings.lvl50"));
        WoodcutterLore.add(ChatColor.YELLOW + "Percent chance to grow trees on place");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(40, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Saplings Lvl 60");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.saplings.lvl60"));
        WoodcutterLore.add(ChatColor.YELLOW + "Percent chance to grow trees on place");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(41, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Saplings Lvl 70");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.saplings.lvl70"));
        WoodcutterLore.add(ChatColor.YELLOW + "Percent chance to grow trees on place");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(42, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Saplings Lvl 80");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.saplings.lvl80"));
        WoodcutterLore.add(ChatColor.YELLOW + "Percent chance to grow trees on place");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(43, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Saplings Lvl 90");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.saplings.lvl90"));
        WoodcutterLore.add(ChatColor.YELLOW + "Percent chance to grow trees on place");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(44, Woodcutter);
        WoodcutterLore.clear();

        WoodcutterMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Woodcutter Saplings Lvl 100");
        WoodcutterLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Woodcutter.saplings.lvl100"));
        WoodcutterLore.add(ChatColor.YELLOW + "Percent chance to grow trees on place");
        WoodcutterLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        WoodcutterMeta.setLore(WoodcutterLore);
        Woodcutter.setItemMeta(WoodcutterMeta);
        gui.setItem(45, Woodcutter);
        WoodcutterLore.clear();

        p.openInventory(gui);
    }
}
