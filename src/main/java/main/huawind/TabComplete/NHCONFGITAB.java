package main.huawind.TabComplete;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class NHCONFGITAB implements TabCompleter {

    List<String> arguments = new ArrayList<String>();

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {

        if(arguments.isEmpty())
        {
            arguments.add("builder"); arguments.add("explorer"); arguments.add("farmer");
            arguments.add("fisherman"); arguments.add("hunter"); arguments.add("miner"); arguments.add("woodcutter");
        }

        List<String> result = new ArrayList<String>();
        if(args.length == 1)
        {
            for(String a : arguments)
            {
                if(a.toLowerCase().startsWith(args[0].toLowerCase()))
                {
                    result.add(a);
                }
            }
            return result;
        }
        return null;
    }
}
