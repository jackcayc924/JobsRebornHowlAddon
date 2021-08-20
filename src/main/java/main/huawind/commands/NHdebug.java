package main.huawind.commands;

import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.container.JobsPlayer;
import com.sk89q.worldguard.internal.flywaydb.core.internal.util.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
// This is to help test abilities and messages so i dont have to go back and run many commands to test things

public class NHdebug implements CommandExecutor {

    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        UUID u = p.getUniqueId();
        JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(((Player) sender).getPlayer());
        if (label.equalsIgnoreCase("NHdebug")) {
            if (sender.hasPermission("natureshowl.NHdebug")) {
                if (args.length == 0) {
                    sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.RED + " Incorrect Usage. Use /nhdebug <job> <level>");
                }
                if(args.length == 1)
                {
                    if (args[0].equalsIgnoreCase("reset")) {
                        if (jobsPlayer.isInJob(Jobs.getJob("Miner"))) {
                            String command1 = "jobs level " + p.getDisplayName() + " Miner set 1";
                            Bukkit.dispatchCommand(console, command1);
                            String command2 = "jobs exp " + p.getDisplayName() + " Miner set 1";
                            Bukkit.dispatchCommand(console, command2);
                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " Reset MINER to exp and lvl set to 1");
                        }
                        if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                            String command1 = "jobs level " + p.getDisplayName() + " Hunter set 1";
                            Bukkit.dispatchCommand(console, command1);
                            String command2 = "jobs exp " + p.getDisplayName() + " Hunter set 1";
                            Bukkit.dispatchCommand(console, command2);
                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " Reset HUNTER to exp and lvl set to 1");
                        }
                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 1";
                            Bukkit.dispatchCommand(console, command1);
                            String command2 = "jobs exp " + p.getDisplayName() + " Explorer set 1";
                            Bukkit.dispatchCommand(console, command2);
                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " Reset EXPLORER to exp and lvl set to 1");
                        }
                        if (jobsPlayer.isInJob(Jobs.getJob("Woodcutter"))) {
                            String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 1";
                            Bukkit.dispatchCommand(console, command1);
                            String command2 = "jobs exp " + p.getDisplayName() + " Woodcutter set 1";
                            Bukkit.dispatchCommand(console, command2);
                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " Reset WOODCUTTER to exp and lvl set to 1");
                        }
                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 1";
                            Bukkit.dispatchCommand(console, command1);
                            String command2 = "jobs exp " + p.getDisplayName() + " Fisherman set 1";
                            Bukkit.dispatchCommand(console, command2);
                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " Reset FISHERMAN to exp and lvl set to 1");
                        }
                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 1";
                            Bukkit.dispatchCommand(console, command1);
                            String command2 = "jobs exp " + p.getDisplayName() + " Builder set 1";
                            Bukkit.dispatchCommand(console, command2);
                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " Reset BUILDER to exp and lvl set to 1");
                        }
                        if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                            String command1 = "jobs level " + p.getDisplayName() + " Farmer set 1";
                            Bukkit.dispatchCommand(console, command1);
                            String command2 = "jobs exp " + p.getDisplayName() + " Farmer set 1";
                            Bukkit.dispatchCommand(console, command2);
                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " Reset FARMER to exp and lvl set to 1");
                        }
                    }
                    else
                    {
                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.RED + " Incorrect Usage. Use /nhdebug <job> <level>");
                    }
                }
                if (args.length >= 2) {
                    if (args[0].equalsIgnoreCase("woodcutter")) {
                        if (args[1].equalsIgnoreCase("10")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("woodcutter"))) {
                                if (p.hasPermission("Woodcutter.10")) {
                                    String command1 = "lp user " + u + " permission unset Woodcutter.10";
                                    Bukkit.dispatchCommand(console, command1);
                                }
                                String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 10";
                                Bukkit.dispatchCommand(console, command1);
                                sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " WOODCUTTER debugging level 10");
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                        }
                        if (args[1].equalsIgnoreCase("20")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("woodcutter"))) {
                                if (p.hasPermission("Woodcutter.20")) {
                                    String command1 = "lp user " + u + " permission unset Woodcutter.20";
                                    Bukkit.dispatchCommand(console, command1);
                                }
                                String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 20";
                                Bukkit.dispatchCommand(console, command1);
                                sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " WOODCUTTER debugging level 20");
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                        }
                        if (args[1].equalsIgnoreCase("30")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("woodcutter"))) {
                                if (p.hasPermission("Woodcutter.30")) {
                                    String command1 = "lp user " + u + " permission unset Woodcutter.30";
                                    Bukkit.dispatchCommand(console, command1);
                                }
                                String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 30";
                                Bukkit.dispatchCommand(console, command1);
                                sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " WOODCUTTER debugging level 30");
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                        }
                        if (args[1].equalsIgnoreCase("40")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("woodcutter"))) {
                                if (p.hasPermission("Woodcutter.40")) {
                                    String command1 = "lp user " + u + " permission unset Woodcutter.40";
                                    Bukkit.dispatchCommand(console, command1);
                                }
                                String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 40";
                                Bukkit.dispatchCommand(console, command1);
                                sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " WOODCUTTER debugging level 40");
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                        }
                        if (args[1].equalsIgnoreCase("50")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("woodcutter"))) {
                                if (p.hasPermission("Woodcutter.50")) {
                                    String command1 = "lp user " + u + " permission unset Woodcutter.50";
                                    Bukkit.dispatchCommand(console, command1);
                                }
                                String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 50";
                                Bukkit.dispatchCommand(console, command1);
                                sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " WOODCUTTER debugging level 50");
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                        }
                        if (args[1].equalsIgnoreCase("60")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("woodcutter"))) {
                                if (p.hasPermission("Woodcutter.60")) {
                                    String command1 = "lp user " + u + " permission unset Woodcutter.60";
                                    Bukkit.dispatchCommand(console, command1);
                                }
                                String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 60";
                                Bukkit.dispatchCommand(console, command1);
                                sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " WOODCUTTER debugging level 60");
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                        }
                        if (args[1].equalsIgnoreCase("70")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("woodcutter"))) {
                                if (p.hasPermission("Woodcutter.70")) {
                                    String command1 = "lp user " + u + " permission unset Woodcutter.70";
                                    Bukkit.dispatchCommand(console, command1);
                                }
                                String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 70";
                                Bukkit.dispatchCommand(console, command1);
                                sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " WOODCUTTER debugging level 70");
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                        }
                        if (args[1].equalsIgnoreCase("80")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("woodcutter"))) {
                                if (p.hasPermission("Woodcutter.80")) {
                                    String command1 = "lp user " + u + " permission unset Woodcutter.80";
                                    Bukkit.dispatchCommand(console, command1);
                                }
                                String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 80";
                                Bukkit.dispatchCommand(console, command1);
                                sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " WOODCUTTER debugging level 80");
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                        }
                        if (args[1].equalsIgnoreCase("90")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("woodcutter"))) {
                                if (p.hasPermission("Woodcutter.90")) {
                                    String command1 = "lp user " + u + " permission unset Woodcutter.90";
                                    Bukkit.dispatchCommand(console, command1);
                                }
                                String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 90";
                                Bukkit.dispatchCommand(console, command1);
                                sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " WOODCUTTER debugging level 90");
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                        }
                        if (args[1].equalsIgnoreCase("100")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("woodcutter"))) {
                                if (p.hasPermission("Woodcutter.100")) {
                                    String command1 = "lp user " + u + " permission unset Woodcutter.100";
                                    Bukkit.dispatchCommand(console, command1);
                                }
                                String command1 = "jobs level " + p.getDisplayName() + " Woodcutter set 100";
                                Bukkit.dispatchCommand(console, command1);
                                sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " WOODCUTTER debugging level 100");
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                        }
                    }
                        if (args[0].equalsIgnoreCase("Miner")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("Miner"))) {
                                if (args[1].equalsIgnoreCase("10")) {
                                    if (p.hasPermission("Miner.10")) {
                                        String command1 = "lp user " + u + " permission unset Miner.10";
                                        Bukkit.dispatchCommand(console, command1);
                                    }
                                    String command1 = "jobs level " + p.getDisplayName() + " Miner set 10";
                                    Bukkit.dispatchCommand(console, command1);
                                    sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " MINER debugging level 10");
                                }
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }
                                if (args[1].equalsIgnoreCase("20")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("miner"))) {
                                        if (p.hasPermission("Miner.20")) {
                                            String command1 = "lp user " + u + " permission unset Miner.20";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Miner set 20";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " MINER debugging level 20");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("30")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("miner"))) {
                                        if (p.hasPermission("Miner.30")) {
                                            String command1 = "lp user " + u + " permission unset Miner.30";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Miner set 30";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " MINER debugging level 30");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("40")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("miner"))) {
                                        if (p.hasPermission("Miner.40")) {
                                            String command1 = "lp user " + u + " permission unset Miner.40";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Miner set 40";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " MINER debugging level 40");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("50")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("miner"))) {
                                        if (p.hasPermission("Miner.50")) {
                                            String command1 = "lp user " + u + " permission unset Miner.50";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Miner set 50";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " MINER debugging level 50");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("60")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("miner"))) {
                                        if (p.hasPermission("Miner.60")) {
                                            String command1 = "lp user " + u + " permission unset Miner.60";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Miner set 60";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " MINER debugging level 60");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("70")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("miner"))) {
                                        if (p.hasPermission("Miner.70")) {
                                            String command1 = "lp user " + u + " permission unset Miner.70";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Miner set 70";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " MINER debugging level 70");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("80")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("miner"))) {
                                        if (p.hasPermission("Miner.80")) {
                                            String command1 = "lp user " + u + " permission unset Miner.80";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Miner set 80";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " MINER debugging level 80");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("90")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("miner"))) {
                                        if (p.hasPermission("Miner.90")) {
                                            String command1 = "lp user " + u + " permission unset Miner.90";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Miner set 90";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " MINER debugging level 90");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("100")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("miner"))) {
                                        if (p.hasPermission("Miner.100")) {
                                            String command1 = "lp user " + u + " permission unset Miner.100";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Miner set 100";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " MINER debugging level 100");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                            }
                        if (args[0].equalsIgnoreCase("Hunter")) {
                            if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                                if (args[1].equalsIgnoreCase("10")) {
                                    if (p.hasPermission("Hunter.10")) {
                                        String command1 = "lp user " + u + " permission unset Hunter.10";
                                        Bukkit.dispatchCommand(console, command1);
                                    }
                                    String command1 = "jobs level " + p.getDisplayName() + " Hunter set 10";
                                    Bukkit.dispatchCommand(console, command1);
                                    sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " HUNTER debugging level 10");
                                }
                            }
                            else
                            {
                                p.sendMessage(ChatColor.RED + "You have to join the job first!");
                            }

                                if (args[1].equalsIgnoreCase("20")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                                        if (p.hasPermission("Hunter.20")) {
                                            String command1 = "lp user " + u + " permission unset Hunter.20";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Hunter set 20";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " HUNTER debugging level 20");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("30")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                                        if (p.hasPermission("Hunter.30")) {
                                            String command1 = "lp user " + u + " permission unset Hunter.30";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Hunter set 30";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " HUNTER debugging level 30");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("40")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                                        if (p.hasPermission("Hunter.40")) {
                                            String command1 = "lp user " + u + " permission unset Hunter.40";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Hunter set 40";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " HUNTER debugging level 40");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("50")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                                        if (p.hasPermission("Hunter.50")) {
                                            String command1 = "lp user " + u + " permission unset Hunter.50";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Hunter set 50";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " HUNTER debugging level 50");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("60")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                                        if (p.hasPermission("Hunter.60")) {
                                            String command1 = "lp user " + u + " permission unset Hunter.60";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Hunter set 60";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " HUNTER debugging level 60");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("70")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                                        if (p.hasPermission("Hunter.70")) {
                                            String command1 = "lp user " + u + " permission unset Hunter.70";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Hunter set 70";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " HUNTER debugging level 70");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("80")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                                        if (p.hasPermission("Hunter.80")) {
                                            String command1 = "lp user " + u + " permission unset Hunter.80";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Hunter set 80";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " HUNTER debugging level 80");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("90")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                                        if (p.hasPermission("Hunter.90")) {
                                            String command1 = "lp user " + u + " permission unset Hunter.90";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Hunter set 90";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " HUNTER debugging level 90");
                                    }
                                    p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                }
                                if (args[1].equalsIgnoreCase("100")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Hunter"))) {
                                        if (p.hasPermission("Hunter.100")) {
                                            String command1 = "lp user " + u + " permission unset Hunter.100";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Hunter set 100";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " HUNTER debugging level 100");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                            }
                        if (args[0].equalsIgnoreCase("Farmer")) {

                                if (args[1].equalsIgnoreCase("10")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                                        if (p.hasPermission("Farmer.10")) {
                                            String command1 = "lp user " + u + " permission unset Farmer.10";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Farmer set 10";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FARMER debugging level 10");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("20")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                                        if (p.hasPermission("Farmer.20")) {
                                            String command1 = "lp user " + u + " permission unset Farmer.20";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Farmer set 20";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FARMER debugging level 20");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("30")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                                        if (p.hasPermission("Farmer.30")) {
                                            String command1 = "lp user " + u + " permission unset Farmer.30";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Farmer set 30";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FARMER debugging level 30");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("40")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                                        if (p.hasPermission("Farmer.40")) {
                                            String command1 = "lp user " + u + " permission unset Farmer.40";
                                            Bukkit.dispatchCommand(console, command1);
                                        }

                                        String command1 = "jobs level " + p.getDisplayName() + " Farmer set 40";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FARMER debugging level 40");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("50")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                                        if (p.hasPermission("Farmer.50")) {
                                            String command1 = "lp user " + u + " permission unset Farmer.50";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Farmer set 50";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FARMER debugging level 50");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("60")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                                        if (p.hasPermission("Farmer.60")) {
                                            String command1 = "lp user " + u + " permission unset Farmer.60";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Farmer set 60";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FARMER debugging level 60");
                                    }
                                    p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                }
                                if (args[1].equalsIgnoreCase("70")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                                        if (p.hasPermission("Farmer.70")) {
                                            String command1 = "lp user " + u + " permission unset Farmer.70";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Farmer set 70";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FARMER debugging level 70");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("80")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                                        if (p.hasPermission("Farmer.80")) {
                                            String command1 = "lp user " + u + " permission unset Farmer.80";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Farmer set 80";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FARMER debugging level 80");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("90")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                                        if (p.hasPermission("Farmer.90")) {
                                            String command1 = "lp user " + u + " permission unset Farmer.90";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Farmer set 90";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FARMER debugging level 90");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                                if (args[1].equalsIgnoreCase("100")) {
                                    if (jobsPlayer.isInJob(Jobs.getJob("Farmer"))) {
                                        if (p.hasPermission("Farmer.100")) {
                                            String command1 = "lp user " + u + " permission unset Farmer.100";
                                            Bukkit.dispatchCommand(console, command1);
                                        }
                                        String command1 = "jobs level " + p.getDisplayName() + " Farmer set 100";
                                        Bukkit.dispatchCommand(console, command1);
                                        sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FARMER debugging level 100");
                                    }
                                    else
                                    {
                                        p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                    }
                                }
                            }
                            if (args[0].equalsIgnoreCase("Explorer")) {

                                    if (args[1].equalsIgnoreCase("10")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                                            if (p.hasPermission("Explorer.10")) {
                                                String command1 = "lp user " + u + " permission unset Explorer.10";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 10";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " EXPLORER debugging level 10");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("20")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                                            if (p.hasPermission("Explorer.20")) {
                                                String command1 = "lp user " + u + " permission unset Explorer.20";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 20";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " EXPLORER debugging level 20");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("30")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                                            if (p.hasPermission("Explorer.30")) {
                                                String command1 = "lp user " + u + " permission unset Explorer.30";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 30";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " EXPLORER debugging level 30");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("40")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                                            if (p.hasPermission("Explorer.40")) {
                                                String command1 = "lp user " + u + " permission unset Explorer.40";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 40";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " EXPLORER debugging level 40");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("50")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                                            if (p.hasPermission("Explorer.50")) {
                                                String command1 = "lp user " + u + " permission unset Explorer.50";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 50";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " EXPLORER debugging level 50");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("60")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                                            if (p.hasPermission("Explorer.60")) {
                                                String command1 = "lp user " + u + " permission unset Explorer.60";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 60";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " EXPLORER debugging level 60");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("70")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                                            if (p.hasPermission("Explorer.70")) {
                                                String command1 = "lp user " + u + " permission unset Explorer.70";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 70";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " EXPLORER debugging level 70");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("80")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                                            if (p.hasPermission("Explorer.80")) {
                                                String command1 = "lp user " + u + " permission unset Explorer.80";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 80";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " EXPLORER debugging level 80");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("90")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                                            if (p.hasPermission("Explorer.90")) {
                                                String command1 = "lp user " + u + " permission unset Explorer.90";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 90";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " EXPLORER debugging level 90");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("100")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Explorer"))) {
                                            if (p.hasPermission("Explorer.100")) {
                                                String command1 = "lp user " + u + " permission unset Explorer.100";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Explorer set 100";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " EXPLORER debugging level 100");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                }
                            if (args[0].equalsIgnoreCase("Builder")) {

                                    if (args[1].equalsIgnoreCase("10")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                                            if (p.hasPermission("Builder.10")) {
                                                String command1 = "lp user " + u + " permission unset Builder.10";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 10";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " BUILDER debugging level 10");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("20")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                                            if (p.hasPermission("Builder.20")) {
                                                String command1 = "lp user " + u + " permission unset Builder.20";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 20";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " BUILDER debugging level 20");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("30")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                                            if (p.hasPermission("Builder.30")) {
                                                String command1 = "lp user " + u + " permission unset Builder.30";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 30";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " BUILDER debugging level 30");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("40")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                                            if (p.hasPermission("Builder.40")) {
                                                String command1 = "lp user " + u + " permission unset Builder.40";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 40";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " BUILDER debugging level 40");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("50")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                                            if (p.hasPermission("Builder.50")) {
                                                String command1 = "lp user " + u + " permission unset Builder.50";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 50";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " BUILDER debugging level 50");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("60")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                                            if (p.hasPermission("Builder.60")) {
                                                String command1 = "lp user " + u + " permission unset Builder.60";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 60";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " BUILDER debugging level 60");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("70")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                                            if (p.hasPermission("Builder.70")) {
                                                String command1 = "lp user " + u + " permission unset Builder.70";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 70";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " BUILDER debugging level 70");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("80")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                                            if (p.hasPermission("Builder.80")) {
                                                String command1 = "lp user " + u + " permission unset Builder.80";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 80";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " BUILDER debugging level 80");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("90")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                                            if (p.hasPermission("Builder.90")) {
                                                String command1 = "lp user " + u + " permission unset Builder.90";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 90";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " BUILDER debugging level 90");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("100")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Builder"))) {
                                            if (p.hasPermission("Builder.100")) {
                                                String command1 = "lp user " + u + " permission unset Builder.100";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Builder set 100";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " BUILDER debugging level 100");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                }
                            if (args[0].equalsIgnoreCase("Fisherman")) {
                                    if (args[1].equalsIgnoreCase("10")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                                            if (p.hasPermission("Fisherman.10")) {
                                                String command1 = "lp user " + u + " permission unset Fisherman.10";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 10";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FISHERMAN debugging level 10");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("20")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                                            if (p.hasPermission("Fisherman.20")) {
                                                String command1 = "lp user " + u + " permission unset Fisherman.20";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 20";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FISHERMAN debugging level 20");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("30")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                                            if (p.hasPermission("Fisherman.30")) {
                                                String command1 = "lp user " + u + " permission unset Fisherman.30";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 30";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FISHERMAN debugging level 30");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("40")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                                            if (p.hasPermission("Fisherman.40")) {
                                                String command1 = "lp user " + u + " permission unset Fisherman.40";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 40";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FISHERMAN debugging level 40");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("50")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                                            if (p.hasPermission("Fisherman.50")) {
                                                String command1 = "lp user " + u + " permission unset Fisherman.50";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 50";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FISHERMAN debugging level 50");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("60")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                                            if (p.hasPermission("Fisherman.60")) {
                                                String command1 = "lp user " + u + " permission unset Fisherman.60";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 60";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FISHERMAN debugging level 60");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("70")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                                            if (p.hasPermission("Fisherman.70")) {
                                                String command1 = "lp user " + u + " permission unset Fisherman.70";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 70";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FISHERMAN debugging level 70");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("80")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                                            if (p.hasPermission("Fisherman.80")) {
                                                String command1 = "lp user " + u + " permission unset Fisherman.80";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 80";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FISHERMAN debugging level 80");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("90")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                                            if (p.hasPermission("Fisherman.90")) {
                                                String command1 = "lp user " + u + " permission unset Fisherman.90";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 90";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FISHERMAN debugging level 90");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                                    if (args[1].equalsIgnoreCase("100")) {
                                        if (jobsPlayer.isInJob(Jobs.getJob("Fisherman"))) {
                                            if (p.hasPermission("Fisherman.100")) {
                                                String command1 = "lp user " + u + " permission unset Fisherman.100";
                                                Bukkit.dispatchCommand(console, command1);
                                            }
                                            String command1 = "jobs level " + p.getDisplayName() + " Fisherman set 100";
                                            Bukkit.dispatchCommand(console, command1);
                                            sender.sendMessage(ChatColor.GOLD + "[NHdebug]" + ChatColor.GREEN + " FISHERMAN debugging level 100");
                                        }
                                        else
                                        {
                                            p.sendMessage(ChatColor.RED + "You have to join the job first!");
                                        }
                                    }
                            }
                        }
                    }
                }
                return false;
            }
        }
