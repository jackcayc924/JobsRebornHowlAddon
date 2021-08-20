package main.huawind.ingameConfig;

import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import main.huawind.inventory.FarmerInventoryConfig;
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

public class FarmerConfig implements Listener {

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

    Map<UUID, Integer> cooldown10map = new HashMap<>();
    Map<UUID, Integer> cooldown20map = new HashMap<>();
    Map<UUID, Integer> cooldown30map = new HashMap<>();
    Map<UUID, Integer> cooldown40map = new HashMap<>();
    Map<UUID, Integer> cooldown50map = new HashMap<>();
    Map<UUID, Integer> cooldown60map = new HashMap<>();
    Map<UUID, Integer> cooldown70map = new HashMap<>();
    Map<UUID, Integer> cooldown80map = new HashMap<>();
    Map<UUID, Integer> cooldown90map = new HashMap<>();

    Map<UUID, Integer> drops10map = new HashMap<>();
    Map<UUID, Integer> drops20map = new HashMap<>();
    Map<UUID, Integer> drops30map = new HashMap<>();
    Map<UUID, Integer> drops40map = new HashMap<>();
    Map<UUID, Integer> drops50map = new HashMap<>();
    Map<UUID, Integer> drops60map = new HashMap<>();
    Map<UUID, Integer> drops70map = new HashMap<>();
    Map<UUID, Integer> drops80map = new HashMap<>();
    Map<UUID, Integer> drops90map = new HashMap<>();
    Map<UUID, Integer> drops100map = new HashMap<>();

    Map<UUID, Integer> dropsAmount10map = new HashMap<>();
    Map<UUID, Integer> dropsAmount20map = new HashMap<>();
    Map<UUID, Integer> dropsAmount30map = new HashMap<>();
    Map<UUID, Integer> dropsAmount40map = new HashMap<>();
    Map<UUID, Integer> dropsAmount50map = new HashMap<>();
    Map<UUID, Integer> dropsAmount60map = new HashMap<>();
    Map<UUID, Integer> dropsAmount70map = new HashMap<>();
    Map<UUID, Integer> dropsAmount80map = new HashMap<>();
    Map<UUID, Integer> dropsAmount90map = new HashMap<>();
    Map<UUID, Integer> dropsAmount100map = new HashMap<>();

    @EventHandler
    public void listening(AsyncPlayerChatEvent e)
    {
        FarmerInventoryConfig Farmer = new FarmerInventoryConfig();
        Player p = e.getPlayer();
        if(cooldown10map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.cooldown.lvl10", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown10map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(cooldown20map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.cooldown.lvl20", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown20map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(cooldown30map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.cooldown.lvl30", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown30map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(cooldown40map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.cooldown.lvl40", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown40map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(cooldown50map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.cooldown.lvl50", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown50map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(cooldown60map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.cooldown.lvl60", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown60map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(cooldown70map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.cooldown.lvl70", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown70map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(cooldown80map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.cooldown.lvl80", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown80map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(cooldown90map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.cooldown.lvl90", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown90map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(drops10map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Farmer.drops.lvl10", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                drops10map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(drops20map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Farmer.drops.lvl20", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                drops20map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(drops30map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Farmer.drops.lvl30", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                drops30map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(drops40map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Farmer.drops.lvl40", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                drops40map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(drops50map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Farmer.drops.lvl50", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                drops50map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(drops60map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Farmer.drops.lvl60", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                drops60map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(drops70map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Farmer.drops.lvl70", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                drops70map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(drops80map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Farmer.drops.lvl80", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                drops80map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(drops90map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Farmer.drops.lvl90", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                drops90map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(drops100map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Farmer.drops.lvl100", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                drops100map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(dropsAmount10map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.dropamount.lvl10", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                dropsAmount10map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(dropsAmount20map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.dropamount.lvl20", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                dropsAmount20map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(dropsAmount30map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.dropamount.lvl30", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                dropsAmount30map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(dropsAmount40map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.dropamount.lvl40", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                dropsAmount40map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(dropsAmount50map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.dropamount.lvl50", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                dropsAmount50map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(dropsAmount60map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.dropamount.lvl60", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                dropsAmount60map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(dropsAmount70map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.dropamount.lvl70", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                dropsAmount70map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(dropsAmount80map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.dropamount.lvl80", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                dropsAmount80map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(dropsAmount90map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.dropamount.lvl90", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                dropsAmount90map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(dropsAmount100map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Farmer.dropamount.lvl100", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                dropsAmount100map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        Farmer.openGuiFarmer(p);
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
        if (e.getView().getTitle().equalsIgnoreCase("Farmer Config")) {
            if (e.getRawSlot() == 0) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown10map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 20")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown20map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 30")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown30map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 40")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown40map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 50")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown50map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 60")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown60map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 70")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown70map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 80")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown80map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Cooldown Lvl 90")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown90map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 10")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                drops10map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 20")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                drops20map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 30")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                drops30map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 40")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                drops40map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 50")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                drops50map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 60")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                drops60map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 70")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                drops70map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 80")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                drops80map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 90")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                drops90map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Lvl 100")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                drops100map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 10")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                dropsAmount10map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 20")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                dropsAmount20map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 30")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                dropsAmount30map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 40")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                dropsAmount40map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 50")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                dropsAmount50map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 60")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                dropsAmount60map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 70")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                dropsAmount70map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 80")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                dropsAmount80map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 90")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                dropsAmount90map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Farmer Drops Amount Lvl 100")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                dropsAmount100map.put(p.getUniqueId(), 1);
            }
        }
    }

}
