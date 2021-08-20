package main.huawind.ingameConfig;

import main.huawind.NaturesHowl;
import main.huawind.files.Custom;
import main.huawind.inventory.HunterInventoryConfig;
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

public class HunterConfig implements Listener {

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


    Map<UUID, Integer> abilityduration10map = new HashMap<>();
    Map<UUID, Integer> abilityduration20map = new HashMap<>();
    Map<UUID, Integer> abilityduration30map = new HashMap<>();
    Map<UUID, Integer> abilityduration40map = new HashMap<>();
    Map<UUID, Integer> abilityduration50map = new HashMap<>();
    Map<UUID, Integer> abilityduration60map = new HashMap<>();
    Map<UUID, Integer> abilityduration70map = new HashMap<>();
    Map<UUID, Integer> abilityduration80map = new HashMap<>();
    Map<UUID, Integer> abilityduration90map = new HashMap<>();
    Map<UUID, Integer> abilityduration100map = new HashMap<>();
    @EventHandler
    public void listening(AsyncPlayerChatEvent e) {
        HunterInventoryConfig Hunter = new HunterInventoryConfig();
        Player p = e.getPlayer();
        if (cooldown10map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.cooldown.lvl10", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown10map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (cooldown20map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.cooldown.lvl20", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                cooldown20map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (cooldown30map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.cooldown.lvl30", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown30map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (cooldown40map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.cooldown.lvl40", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown40map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (cooldown50map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.cooldown.lvl50", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown50map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (cooldown60map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.cooldown.lvl60", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown60map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (cooldown70map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.cooldown.lvl70", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown70map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (cooldown80map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.cooldown.lvl80", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown80map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (cooldown90map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.cooldown.lvl90", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown90map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (cooldown100map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.cooldown.lvl100", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                cooldown100map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (abilityduration10map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.abilityduration.lvl10", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                abilityduration10map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (abilityduration20map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.abilityduration.lvl20", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");
                e.setCancelled(true);
                abilityduration20map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (abilityduration30map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.abilityduration.lvl30", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                abilityduration30map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (abilityduration40map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.abilityduration.lvl40", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                abilityduration40map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (abilityduration50map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.abilityduration.lvl50", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                abilityduration50map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (abilityduration60map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.abilityduration.lvl60", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                abilityduration60map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (abilityduration70map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.abilityduration.lvl70", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                abilityduration70map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (abilityduration80map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.abilityduration.lvl80", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                abilityduration80map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (abilityduration90map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.abilityduration.lvl90", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                abilityduration90map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }

        if (abilityduration100map.containsKey(p.getUniqueId())) {
            if (isInteger(e.getMessage())) {
                Custom.get().set("Hunter.abilityduration.lvl100", Integer.parseInt(e.getMessage()));
                Custom.save();
                Custom.reload();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Success!");

                e.setCancelled(true);
                abilityduration100map.remove(p.getUniqueId());
                new BukkitRunnable() {
                    public void run() {
                        Hunter.openGuiHunter(p);
                    }
                }.runTaskLater(NaturesHowl.getPlugin(), 1L);
            } else {
                e.setCancelled(true);
                p.sendMessage(ChatColor.DARK_PURPLE + "[NHConfig]" + ChatColor.RED + " Please enter a whole value");
            }
        }
    }

    @EventHandler
    public void configEvent(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase("Hunter Config")) {
            if (e.getRawSlot() == 0) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown10map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 1) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown20map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 2) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown30map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 3) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown40map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 4) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown50map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 5) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown60map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 6) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown70map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 7) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown80map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 8) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown90map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 9) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                cooldown100map.put(p.getUniqueId(), 1);
            }

            if (e.getRawSlot() == 27) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                abilityduration10map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 28) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                abilityduration20map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 29) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                abilityduration30map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 30) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                abilityduration40map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 31) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                abilityduration50map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 32) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                abilityduration60map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 33) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                abilityduration70map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 34) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                abilityduration80map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 35) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                abilityduration90map.put(p.getUniqueId(), 1);
            }
            if (e.getRawSlot() == 36) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Please enter a value: ");
                p.sendMessage(" ");
                p.sendMessage(" ");

                abilityduration100map.put(p.getUniqueId(), 1);
            }
        }
    }
}
