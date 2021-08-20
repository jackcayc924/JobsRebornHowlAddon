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

public class BuilderInventoryConfig {
    public void openGuiBuilder(Player p) {
        Inventory gui = Bukkit.createInventory(p, 54, "Builder Config");
        ItemStack builder = new ItemStack(Material.STONE);
        ItemMeta builderMeta = builder.getItemMeta();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 10");
        ArrayList<String> builderLore = new ArrayList<>();
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.refund.lvl10"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to be refunded a block");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(0, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 20");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.refund.lvl20"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to be refunded a block");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(1, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 30");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.refund.lvl30"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to be refunded a block");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(2, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 40");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.refund.lvl40"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to be refunded a block");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(3, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 50");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.refund.lvl50"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to be refunded a block");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(4, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 60");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.refund.lvl60"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to be refunded a block");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(5, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 70");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.refund.lvl70"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to be refunded a block");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(6, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 80");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.refund.lvl80"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to be refunded a block");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(7, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 90");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.refund.lvl90"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to be refunded a block");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(8, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 100");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.refund.lvl100"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to be refunded a block");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(9, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 10");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.doubleitem.lvl10"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to get double item on craft");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(27, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 20");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.doubleitem.lvl20"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to get double item on craft");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(28, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 30");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.doubleitem.lvl30"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to get double item on craft");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(29, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 40");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.doubleitem.lvl40"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to get double item on craft");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(30, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 50");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.doubleitem.lvl50"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to get double item on craft");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(31, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 60");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.doubleitem.lvl60"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to get double item on craft");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(32, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 70");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.doubleitem.lvl70"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to get double item on craft");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(33, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 80");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.doubleitem.lvl80"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to get double item on craft");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(34, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 90");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.doubleitem.lvl90"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to get double item on craft");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(35, builder);
        builderLore.clear();

        builderMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 100");
        builderLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Builder.doubleitem.lvl100"));
        builderLore.add(ChatColor.YELLOW + "Percent chance to get double item on craft");
        builderLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        builderMeta.setLore(builderLore);
        builder.setItemMeta(builderMeta);
        gui.setItem(36, builder);
        builderLore.clear();

        p.openInventory(gui);
    }
}