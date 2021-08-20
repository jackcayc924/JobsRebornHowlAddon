package main.huawind.ingameConfig;

import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import main.huawind.inventory.FishermanInventoryConfig;
import main.huawind.jobs.Fisherman;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FishermanConfig implements Listener {

    public static boolean isDouble(String strNum) {
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    Map<UUID, Integer> chance10map = new HashMap<>();
    Map<UUID, Integer> chance20map = new HashMap<>();
    Map<UUID, Integer> chance30map = new HashMap<>();
    Map<UUID, Integer> chance40map = new HashMap<>();
    Map<UUID, Integer> chance50map = new HashMap<>();
    Map<UUID, Integer> chance60map = new HashMap<>();
    Map<UUID, Integer> chance70map = new HashMap<>();
    Map<UUID, Integer> chance80map = new HashMap<>();
    Map<UUID, Integer> chance90map = new HashMap<>();
    Map<UUID, Integer> chance100map = new HashMap<>();

    Map<UUID, Integer> fishMinMap10 = new HashMap<>();
    Map<UUID, Integer> fishMinMap20 = new HashMap<>();
    Map<UUID, Integer> fishMinMap30 = new HashMap<>();
    Map<UUID, Integer> fishMinMap40 = new HashMap<>();
    Map<UUID, Integer> fishMinMap50 = new HashMap<>();
    Map<UUID, Integer> fishMinMap60 = new HashMap<>();
    Map<UUID, Integer> fishMinMap70 = new HashMap<>();
    Map<UUID, Integer> fishMinMap80 = new HashMap<>();
    Map<UUID, Integer> fishMinMap90 = new HashMap<>();
    Map<UUID, Integer> fishMinMap100 = new HashMap<>();

    Map<UUID, Integer> fishMaxMap10 = new HashMap<>();
    Map<UUID, Integer> fishMaxMap20 = new HashMap<>();
    Map<UUID, Integer> fishMaxMap30 = new HashMap<>();
    Map<UUID, Integer> fishMaxMap40 = new HashMap<>();
    Map<UUID, Integer> fishMaxMap50 = new HashMap<>();
    Map<UUID, Integer> fishMaxMap60 = new HashMap<>();
    Map<UUID, Integer> fishMaxMap70 = new HashMap<>();
    Map<UUID, Integer> fishMaxMap80 = new HashMap<>();
    Map<UUID, Integer> fishMaxMap90 = new HashMap<>();
    Map<UUID, Integer> fishMaxMap100 = new HashMap<>();

    Map<UUID, Integer> fishNightMinMap50 = new HashMap<>();
    Map<UUID, Integer> fishNightMinMap60 = new HashMap<>();
    Map<UUID, Integer> fishNightMinMap70 = new HashMap<>();
    Map<UUID, Integer> fishNightMinMap80 = new HashMap<>();
    Map<UUID, Integer> fishNightMinMap90 = new HashMap<>();
    Map<UUID, Integer> fishNightMinMap100 = new HashMap<>();

    Map<UUID, Integer> fishNightMaxMap50 = new HashMap<>();
    Map<UUID, Integer> fishNightMaxMap60 = new HashMap<>();
    Map<UUID, Integer> fishNightMaxMap70 = new HashMap<>();
    Map<UUID, Integer> fishNightMaxMap80 = new HashMap<>();
    Map<UUID, Integer> fishNightMaxMap90 = new HashMap<>();
    Map<UUID, Integer> fishNightMaxMap100 = new HashMap<>();

    FishermanInventoryConfig Fisherman = new FishermanInventoryConfig();
    
    @EventHandler
    public void listening(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if (chance10map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Fisherman.chance.lvl10", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                chance10map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if (chance20map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Fisherman.chance.lvl20", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                chance20map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if (chance30map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Fisherman.chance.lvl30", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                chance30map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if (chance40map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Fisherman.chance.lvl40", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                chance40map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if (chance50map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Fisherman.chance.lvl50", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                chance50map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if (chance60map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Fisherman.chance.lvl60", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                chance60map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if (chance70map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Fisherman.chance.lvl70", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                chance70map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if (chance80map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Fisherman.chance.lvl80", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                chance80map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if (chance90map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Fisherman.chance.lvl90", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                chance90map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if (chance100map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Fisherman.chance.lvl100", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                chance100map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(fishMinMap10.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.minimum.lvl10", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMinMap10.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                        Custom.reload();
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMinMap20.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.minimum.lvl20", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMinMap20.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMinMap30.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.minimum.lvl30", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMinMap30.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMinMap40.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.minimum.lvl40", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMinMap40.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMinMap50.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.minimum.lvl50", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMinMap50.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMinMap60.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.minimum.lvl60", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMinMap60.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMinMap70.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.minimum.lvl70", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMinMap70.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMinMap80.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.minimum.lvl80", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMinMap80.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMinMap90.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.minimum.lvl90", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMinMap90.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMinMap100.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.minimum.lvl100", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMinMap100.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(fishMaxMap10.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.maxtime.lvl10", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMaxMap10.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                        Custom.reload();
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMaxMap20.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.maxtime.lvl20", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMaxMap20.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMaxMap30.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.maxtime.lvl30", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMaxMap30.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMaxMap40.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.maxtime.lvl40", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMaxMap40.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMaxMap50.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.maxtime.lvl50", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMaxMap50.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMaxMap60.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.maxtime.lvl60", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMaxMap60.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMaxMap70.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.maxtime.lvl70", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMaxMap70.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMaxMap80.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.maxtime.lvl80", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMaxMap80.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMaxMap90.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.maxtime.lvl90", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMaxMap90.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishMaxMap100.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.maxtime.lvl100", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishMaxMap100.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(fishNightMinMap50.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightminimum.lvl50", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMinMap50.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishNightMinMap60.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightminimum.lvl60", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMinMap60.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishNightMinMap70.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightminimum.lvl70", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMinMap70.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishNightMinMap80.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightminimum.lvl80", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMinMap80.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishNightMinMap90.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightminimum.lvl90", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMinMap90.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishNightMinMap100.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightminimum.lvl100", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMinMap100.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(fishNightMaxMap50.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightmaxtime.lvl50", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMaxMap50.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishNightMaxMap60.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightmaxtime.lvl60", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMaxMap60.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishNightMaxMap70.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightmaxtime.lvl70", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMaxMap70.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishNightMaxMap80.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightmaxtime.lvl80", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMaxMap80.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishNightMaxMap90.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightmaxtime.lvl90", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMaxMap90.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(fishNightMaxMap100.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Fisherman.nightmaxtime.lvl100", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                fishNightMaxMap100.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Fisherman.openGuiFisherman(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
    }

    @EventHandler
    public void configEvent(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase("Fisherman Config 2")) {
            if(e.getRawSlot() == 45)
            {
                p.closeInventory();
                Fisherman.openGuiFisherman(p);
            }
            if (e.getRawSlot() == 0) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMinMap50.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 1) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMinMap60.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 2) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMinMap70.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 3) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMinMap80.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 4) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMinMap90.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 5) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMinMap100.put(p.getUniqueId(), 1);
            }

            if (e.getRawSlot() == 18) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMaxMap50.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 19) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMaxMap60.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 20) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMaxMap70.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 21) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMaxMap80.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 22) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMaxMap90.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 23) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishNightMaxMap100.put(p.getUniqueId(), 1);
            }

        }
        if (e.getView().getTitle().equalsIgnoreCase("Fisherman Config")) {
            if (e.getRawSlot() == 0) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                chance10map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 1) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                chance20map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 2) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                chance30map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 3) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                chance40map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 4) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                chance50map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 5) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                chance60map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 6) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                chance70map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 7) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                chance80map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 8) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                chance90map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 9) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                chance100map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 18) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMinMap10.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 19) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMinMap20.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 20) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMinMap30.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 21) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMinMap40.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 22) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMinMap50.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 23) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMinMap60.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 24) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMinMap70.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 25) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMinMap80.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 26) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMinMap90.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 27) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMinMap100.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 36) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMaxMap10.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 37) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMaxMap20.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 38) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMaxMap30.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 39) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMaxMap40.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 40) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMaxMap50.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 41) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMaxMap60.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 42) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMaxMap70.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 43) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMaxMap80.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 44) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMaxMap90.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 45) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                fishMaxMap100.put(p.getUniqueId(), 1);
            }
            if(e.getRawSlot() == 53)
            {
                p.closeInventory();
                Fisherman.openGuiFisherman2(p);
            }
        }
    }
}
