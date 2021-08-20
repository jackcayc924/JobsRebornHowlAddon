package main.huawind.commands;

import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.container.Job;
import com.gamingmesh.jobs.container.JobsPlayer;
import main.huawind.files.Custom;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class veinminer implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        List<String> list = Custom.get().getStringList("veinminer.players");
        JobsPlayer jobsPlayer = Jobs.getPlayerManager().getJobsPlayer(p);
        Job miner = Jobs.getJob("Miner");
        int minerlevel = jobsPlayer.getJobProgression(miner).getLevel();
        if (label.equalsIgnoreCase("veinminer")) {
            if(args.length == 0)
            {
                if (jobsPlayer.isInJob(Jobs.getJob("Miner")) && minerlevel >= 50) {
                    if (list.contains(p.getUniqueId().toString())) {
                        p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Veinminer: " + ChatColor.GREEN + "" + ChatColor.BOLD + "ON");
                        list.remove(p.getUniqueId().toString());
                    }
                    if (!list.contains(p.getUniqueId().toString())) {
                        p.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Veinminer: " + ChatColor.RED + "" + ChatColor.BOLD + "OFF");
                        list.add(p.getUniqueId().toString());
                    }
                }
                else
                {
                    p.sendMessage(ChatColor.RED + "You have to be at least a level 50 Miner to use this");
                }
            }
        }
        return false;
    }
}
