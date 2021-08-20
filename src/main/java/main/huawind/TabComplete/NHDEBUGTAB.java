package main.huawind.TabComplete;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class NHDEBUGTAB implements TabCompleter {

    List<String> arguments = new ArrayList<String>();

    List<String> arguments1 = new ArrayList<String>();

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


        if(arguments1.isEmpty())
        {
            arguments1.add("10"); arguments1.add("20"); arguments1.add("30"); arguments1.add("40");
            arguments1.add("50"); arguments1.add("60"); arguments1.add("70"); arguments1.add("80");
            arguments1.add("90"); arguments1.add("100");
        }

        List<String> result1 = new ArrayList<String>();
        if(args.length == 2)
        {
            for(String a : arguments1)
            {
                if(a.toLowerCase().startsWith(args[1].toLowerCase()))
                {
                    result1.add(a);
                }
            }
            return result1;
        }

        return null;
    }
}
