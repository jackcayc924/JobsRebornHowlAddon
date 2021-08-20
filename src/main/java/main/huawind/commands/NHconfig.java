package main.huawind.commands;

import main.huawind.NaturesHowl;
import main.huawind.inventory.*;
import main.huawind.jobs.Hunter;
import main.huawind.jobs.Miner;
import main.huawind.jobs.Woodcutter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NHconfig implements CommandExecutor {

    BuilderInventoryConfig builderInven = new BuilderInventoryConfig();
    ExplorerInventoryConfig explorerInven = new ExplorerInventoryConfig();
    FarmerInventoryConfig farmerInven = new FarmerInventoryConfig();
    FishermanInventoryConfig fishermanInven = new FishermanInventoryConfig();
    HunterInventoryConfig hunterInven = new HunterInventoryConfig();
    MinerInventoryConfig minerInven = new MinerInventoryConfig();
    WoodcutterInventoryConfig woodcutterInven = new WoodcutterInventoryConfig();

    List<String> jobs = Arrays.asList("Builder", "Miner", "Explorer", "Farmer", "Fisherman", "Woodcutter", "Hunter");


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (label.equalsIgnoreCase("NHconfig")) {
            if (sender.hasPermission("natureshowl.NHconfig")) {
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("builder")) {
                        builderInven.openGuiBuilder(player);
                    }
                    if (args[0].equalsIgnoreCase("explorer")) {
                        explorerInven.openGuiExplorer(player);
                    }
                    if (args[0].equalsIgnoreCase("farmer")) {
                        farmerInven.openGuiFarmer(player);
                    }
                    if (args[0].equalsIgnoreCase("fisherman")) {
                        fishermanInven.openGuiFisherman(player);
                    }
                    if (args[0].equalsIgnoreCase("hunter")) {
                        hunterInven.openGuiHunter(player);
                    }
                    if (args[0].equalsIgnoreCase("miner")) {
                        minerInven.openGuiMiner(player);
                    }
                    if (args[0].equalsIgnoreCase("woodcutter")) {
                        woodcutterInven.openGuiWoodcutter(player);
                    }
                }
            }
        }
        return false;
    }
}
