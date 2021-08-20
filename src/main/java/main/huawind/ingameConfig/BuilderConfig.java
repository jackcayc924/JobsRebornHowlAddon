package main.huawind.ingameConfig;

import main.huawind.NaturesHowl;
import main.huawind.commands.NHconfig;
import main.huawind.files.Custom;
import main.huawind.inventory.BuilderInventoryConfig;
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

public class BuilderConfig implements Listener {

    public static boolean isDouble(String strNum) {
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    Map<UUID, Integer> refund10map = new HashMap<>();
    Map<UUID, Integer> refund20map = new HashMap<>();
    Map<UUID, Integer> refund30map = new HashMap<>();
    Map<UUID, Integer> refund40map = new HashMap<>();
    Map<UUID, Integer> refund50map = new HashMap<>();
    Map<UUID, Integer> refund60map = new HashMap<>();
    Map<UUID, Integer> refund70map = new HashMap<>();
    Map<UUID, Integer> refund80map = new HashMap<>();
    Map<UUID, Integer> refund90map = new HashMap<>();
    Map<UUID, Integer> refund100map = new HashMap<>();

    Map<UUID, Integer> doubleItem10map = new HashMap<>();
    Map<UUID, Integer> doubleItem20map = new HashMap<>();
    Map<UUID, Integer> doubleItem30map = new HashMap<>();
    Map<UUID, Integer> doubleItem40map = new HashMap<>();
    Map<UUID, Integer> doubleItem50map = new HashMap<>();
    Map<UUID, Integer> doubleItem60map = new HashMap<>();
    Map<UUID, Integer> doubleItem70map = new HashMap<>();
    Map<UUID, Integer> doubleItem80map = new HashMap<>();
    Map<UUID, Integer> doubleItem90map = new HashMap<>();
    Map<UUID, Integer> doubleItem100map = new HashMap<>();

    @EventHandler
    public void listening(AsyncPlayerChatEvent e)
    {
        BuilderInventoryConfig builder = new BuilderInventoryConfig();
        Player p = e.getPlayer();
        if(refund10map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.refund.lvl10", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();                
                    p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                    e.setCancelled(true);
                    refund10map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(refund20map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.refund.lvl20", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                refund20map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(refund30map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.refund.lvl30", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                
                e.setCancelled(true);
                refund30map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(refund40map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.refund.lvl40", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                
                e.setCancelled(true);
                refund40map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(refund50map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.refund.lvl50", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                
                e.setCancelled(true);
                refund50map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(refund60map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.refund.lvl60", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                
                e.setCancelled(true);
                refund60map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(refund70map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.refund.lvl70", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                
                e.setCancelled(true);
                refund70map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(refund80map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.refund.lvl80", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                
                e.setCancelled(true);
                refund80map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(refund90map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.refund.lvl90", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                
                e.setCancelled(true);
                refund90map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(refund100map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.refund.lvl100", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                
                e.setCancelled(true);
                refund100map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(doubleItem10map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.doubleitem.lvl10", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                doubleItem10map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(doubleItem20map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.doubleitem.lvl20", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                doubleItem20map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(doubleItem30map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.doubleitem.lvl30", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                doubleItem30map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(doubleItem40map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.doubleitem.lvl40", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                doubleItem40map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(doubleItem50map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.doubleitem.lvl50", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                doubleItem50map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(doubleItem60map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.doubleitem.lvl60", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                doubleItem60map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(doubleItem70map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.doubleitem.lvl70", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                doubleItem70map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(doubleItem80map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.doubleitem.lvl80", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                doubleItem80map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(doubleItem90map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.doubleitem.lvl90", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                doubleItem90map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

        if(doubleItem100map.containsKey(p.getUniqueId())) {
            if (isDouble(e.getMessage())) {
                Custom.get().set("Builder.doubleitem.lvl100", Double.parseDouble(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                doubleItem100map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        builder.openGuiBuilder(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a decimal value");
            }
        }

    }

    @EventHandler
    public void configEvent(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase("Builder Config")) {
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 10")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                refund10map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 20")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                refund20map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 30")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                refund30map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 40")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                refund40map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 50")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                refund50map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 60")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                refund60map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 70")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                refund70map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 80")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                refund80map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 90")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                refund90map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder Refund Lvl 100")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                refund100map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 10")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                doubleItem10map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 20")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                doubleItem20map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 30")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                doubleItem30map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 40")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                doubleItem40map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 50")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                doubleItem50map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 60")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                doubleItem60map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 70")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                doubleItem70map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 80")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                doubleItem80map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 90")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                doubleItem90map.put(p.getUniqueId(), 1);
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Builder DoubleItem Lvl 100")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                
                doubleItem100map.put(p.getUniqueId(), 1);
            }
        }
    }
}
