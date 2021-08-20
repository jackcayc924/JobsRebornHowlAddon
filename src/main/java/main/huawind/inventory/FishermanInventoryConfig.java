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

public class FishermanInventoryConfig {
    public void openGuiFisherman(Player p) {
        Inventory gui = Bukkit.createInventory(p, 54, "Fisherman Config");
        ItemStack Fisherman = new ItemStack(Material.STONE);
        ItemStack Next = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        ItemMeta FishermanMeta = Fisherman.getItemMeta();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Chance Lvl 10");
        ArrayList<String> FishermanLore = new ArrayList<>();
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.chance.lvl10"));
        FishermanLore.add(ChatColor.YELLOW + "Percent chance to get custom drops");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(0, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Chance Lvl 20");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.chance.lvl20"));
        FishermanLore.add(ChatColor.YELLOW + "Percent chance to get custom drops");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(1, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Chance Lvl 30");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.chance.lvl30"));
        FishermanLore.add(ChatColor.YELLOW + "Percent chance to get custom drops");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(2, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Chance Lvl 40");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.chance.lvl40"));
        FishermanLore.add(ChatColor.YELLOW + "Percent chance to get custom drops");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(3, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Chance Lvl 50");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.chance.lvl50"));
        FishermanLore.add(ChatColor.YELLOW + "Percent chance to get custom drops");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(4, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Chance Lvl 60");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.chance.lvl60"));
        FishermanLore.add(ChatColor.YELLOW + "Percent chance to get custom drops");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(5, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Chance Lvl 70");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.chance.lvl70"));
        FishermanLore.add(ChatColor.YELLOW + "Percent chance to get custom drops");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(6, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Chance Lvl 80");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.chance.lvl80"));
        FishermanLore.add(ChatColor.YELLOW + "Percent chance to get custom drops");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(7, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Chance Lvl 90");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.chance.lvl90"));
        FishermanLore.add(ChatColor.YELLOW + "Percent chance to get custom drops");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(8, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Chance Lvl 100");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.chance.lvl100"));
        FishermanLore.add(ChatColor.YELLOW + "Percent chance to get custom drops");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(9, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Minimum Lvl 10");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.minimum.lvl10"));
        FishermanLore.add(ChatColor.YELLOW + "Minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(18, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Minimum Lvl 20");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.minimum.lvl20"));
        FishermanLore.add(ChatColor.YELLOW + "Minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(19, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Minimum Lvl 30");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.minimum.lvl30"));
        FishermanLore.add(ChatColor.YELLOW + "Minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(20, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Minimum Lvl 40");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.minimum.lvl40"));
        FishermanLore.add(ChatColor.YELLOW + "Minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(21, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Minimum Lvl 50");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.minimum.lvl50"));
        FishermanLore.add(ChatColor.YELLOW + "Minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(22, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Minimum Lvl 60");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.minimum.lvl60"));
        FishermanLore.add(ChatColor.YELLOW + "Minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(23, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Minimum Lvl 70");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.minimum.lvl70"));
        FishermanLore.add(ChatColor.YELLOW + "Minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(24, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Minimum Lvl 80");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.minimum.lvl80"));
        FishermanLore.add(ChatColor.YELLOW + "Minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(25, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Minimum Lvl 90");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.minimum.lvl90"));
        FishermanLore.add(ChatColor.YELLOW + "Minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(26, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Minimum Lvl 100");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.minimum.lvl100"));
        FishermanLore.add(ChatColor.YELLOW + "Minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(27, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Maximum Lvl 10");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.maxtime.lvl10"));
        FishermanLore.add(ChatColor.YELLOW + "Maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(36, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Maximum Lvl 20");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.maxtime.lvl20"));
        FishermanLore.add(ChatColor.YELLOW + "Maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(37, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Maximum Lvl 30");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.maxtime.lvl30"));
        FishermanLore.add(ChatColor.YELLOW + "Maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(38, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Maximum Lvl 40");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.maxtime.lvl40"));
        FishermanLore.add(ChatColor.YELLOW + "Maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(39, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Maximum Lvl 50");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.maxtime.lvl50"));
        FishermanLore.add(ChatColor.YELLOW + "Maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(40, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Maximum Lvl 60");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.maxtime.lvl60"));
        FishermanLore.add(ChatColor.YELLOW + "Maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(41, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Maximum Lvl 70");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.maxtime.lvl70"));
        FishermanLore.add(ChatColor.YELLOW + "Maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(42, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Maximum Lvl 80");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.maxtime.lvl80"));
        FishermanLore.add(ChatColor.YELLOW + "Maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(43, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Maximum Lvl 90");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.maxtime.lvl90"));
        FishermanLore.add(ChatColor.YELLOW + "Maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(44, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Maximum Lvl 100");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.maxtime.lvl100"));
        FishermanLore.add(ChatColor.YELLOW + "Maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(45, Fisherman);
        FishermanLore.clear();

        ItemMeta nextMeta = Next.getItemMeta();
        nextMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "NEXT >");
        Next.setItemMeta(nextMeta);
        gui.setItem(53, Next);

        p.openInventory(gui);
    }

    public void openGuiFisherman2(Player p) {

        Inventory gui = Bukkit.createInventory(p, 54, "Fisherman Config 2");
        ItemStack Fisherman = new ItemStack(Material.STONE);
        ItemStack Back = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta FishermanMeta = Fisherman.getItemMeta();
        ArrayList<String> FishermanLore = new ArrayList<>();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Minimum Lvl 50");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightminimum.lvl50"));
        FishermanLore.add(ChatColor.YELLOW + "Night minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(0, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Minimum Lvl 60");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightminimum.lvl60"));
        FishermanLore.add(ChatColor.YELLOW + "Night minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(1, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Minimum Lvl 70");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightminimum.lvl70"));
        FishermanLore.add(ChatColor.YELLOW + "Night minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(2, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Minimum Lvl 80");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightminimum.lvl80"));
        FishermanLore.add(ChatColor.YELLOW + "Night minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(3, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Minimum Lvl 90");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightminimum.lvl90"));
        FishermanLore.add(ChatColor.YELLOW + "Night minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(4, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Minimum Lvl 100");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightminimum.lvl100"));
        FishermanLore.add(ChatColor.YELLOW + "Night minimum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(5, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Maximum Lvl 50");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightmaxtime.lvl50"));
        FishermanLore.add(ChatColor.YELLOW + "Night maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(18, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Maximum Lvl 60");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightmaxtime.lvl60"));
        FishermanLore.add(ChatColor.YELLOW + "Night maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(19, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Maximum Lvl 70");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightmaxtime.lvl70"));
        FishermanLore.add(ChatColor.YELLOW + "Night maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(20, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Maximum Lvl 80");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightmaxtime.lvl80"));
        FishermanLore.add(ChatColor.YELLOW + "Night maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(21, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Maximum Lvl 90");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightmaxtime.lvl90"));
        FishermanLore.add(ChatColor.YELLOW + "Night maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(22, Fisherman);
        FishermanLore.clear();

        FishermanMeta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Fisherman Night Maximum Lvl 100");
        FishermanLore.add(ChatColor.YELLOW + "Current Value: " + Custom.get().get("Fisherman.nightmaxtime.lvl100"));
        FishermanLore.add(ChatColor.YELLOW + "Night maximum time in seconds it takes to catch fish");
        FishermanLore.add(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK TO EDIT");
        FishermanMeta.setLore(FishermanLore);
        Fisherman.setItemMeta(FishermanMeta);
        gui.setItem(23, Fisherman);
        FishermanLore.clear();

        ItemMeta backMeta = Back.getItemMeta();
        backMeta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "< BACK");
        Back.setItemMeta(backMeta);
        gui.setItem(45, Back);

        p.openInventory(gui);

    }
}
