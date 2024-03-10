package unilliondev.tripeffects;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import unilliondev.tripeffects.trip.TripManager;
import unilliondev.tripeffects.trip.Trips;

public final class TripEffects extends JavaPlugin implements Listener {

    private static TripEffects Instance;
    private static ProtocolManager ProtocolManager;

    @Override
    public void onEnable() {
        Instance = this;
        ProtocolManager = ProtocolLibrary.getProtocolManager();

        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
    }

    public static TripEffects getInstance() {
        return Instance;
    }

    public static ProtocolManager getProtocolManager() {
        return ProtocolManager;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        TripManager.sendTrip(event.getPlayer(), Trips.BELCH);
    }
}
