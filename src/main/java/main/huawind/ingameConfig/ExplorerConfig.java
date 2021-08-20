package main.huawind.ingameConfig;

import com.sk89q.worldguard.internal.flywaydb.core.internal.util.StringUtils;
import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import main.huawind.inventory.ExplorerInventoryConfig;
import main.huawind.inventory.ExplorerInventoryConfig;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class ExplorerConfig implements Listener {

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
    Map<UUID, Integer> cooldown100map = new HashMap<>();

    Map<UUID, Integer> distance10map = new HashMap<>();
    Map<UUID, Integer> distance20map = new HashMap<>();
    Map<UUID, Integer> distance30map = new HashMap<>();
    Map<UUID, Integer> distance40map = new HashMap<>();
    Map<UUID, Integer> distance50map = new HashMap<>();
    Map<UUID, Integer> distance60map = new HashMap<>();
    Map<UUID, Integer> distance70map = new HashMap<>();
    Map<UUID, Integer> distance80map = new HashMap<>();
    Map<UUID, Integer> distance90map = new HashMap<>();
    Map<UUID, Integer> distance100map = new HashMap<>();

    @EventHandler
    public void listening(AsyncPlayerChatEvent e)
    {
        ExplorerInventoryConfig explorer = new ExplorerInventoryConfig();
        Player p = e.getPlayer();
        if(cooldown10map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.abilitycooldown.lvl10", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown10map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
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
        if(cooldown20map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.abilitycooldown.lvl20", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown20map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
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
                Custom.get().set("Explorer.abilitycooldown.lvl30", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown30map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
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
                Custom.get().set("Explorer.abilitycooldown.lvl40", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown40map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
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
                Custom.get().set("Explorer.abilitycooldown.lvl50", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown50map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
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
                Custom.get().set("Explorer.abilitycooldown.lvl60", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown60map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
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
                Custom.get().set("Explorer.abilitycooldown.lvl70", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown70map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
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
                Custom.get().set("Explorer.abilitycooldown.lvl80", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown80map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
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
                Custom.get().set("Explorer.abilitycooldown.lvl90", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown90map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(cooldown100map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.abilitycooldown.lvl100", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown100map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if(distance10map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.distance.lvl10", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                distance10map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        
        if(distance20map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.distance.lvl20", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                distance20map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(distance30map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.distance.lvl30", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                distance30map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(distance40map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.distance.lvl40", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                distance40map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(distance50map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.distance.lvl50", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                distance50map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(distance60map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.distance.lvl60", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                distance60map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(distance70map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.distance.lvl70", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                distance70map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(distance80map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.distance.lvl80", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                distance80map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(distance90map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.distance.lvl90", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                distance90map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
        if(distance100map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Explorer.distance.lvl100", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();  
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                distance100map.remove(p.getUniqueId());
                new BukkitRunnable()
                {
                    public void run()
                    {
                        explorer.openGuiExplorer(p);
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
        if (e.getView().getTitle().equalsIgnoreCase("Explorer Config")) {
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 10")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                cooldown10map.put(p.getUniqueId(), 1);
                
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 20")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                cooldown20map.put(p.getUniqueId(), 1);
                
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 30")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                cooldown30map.put(p.getUniqueId(), 1);
                
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 40")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                cooldown40map.put(p.getUniqueId(), 1);
                
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 50")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                cooldown50map.put(p.getUniqueId(), 1);
                
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 60")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                cooldown60map.put(p.getUniqueId(), 1);
                
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 70")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                cooldown70map.put(p.getUniqueId(), 1);
                
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 80")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                cooldown80map.put(p.getUniqueId(), 1);
                
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 90")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                cooldown90map.put(p.getUniqueId(), 1);
                
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Cooldown Lvl 100")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                cooldown100map.put(p.getUniqueId(), 1);
                
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 10")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                distance10map.put(p.getUniqueId(), 1);

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 20")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                distance20map.put(p.getUniqueId(), 1);

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 30")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                distance30map.put(p.getUniqueId(), 1);

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 40")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                distance40map.put(p.getUniqueId(), 1);

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 50")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                distance50map.put(p.getUniqueId(), 1);

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 60")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                distance60map.put(p.getUniqueId(), 1);

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 70")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                distance70map.put(p.getUniqueId(), 1);

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 80")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                distance80map.put(p.getUniqueId(), 1);

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 90")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                distance90map.put(p.getUniqueId(), 1);

            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "Explorer Distance Lvl 100")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");
                distance100map.put(p.getUniqueId(), 1);
            }
        }
    }
}
