package unilliondev.tripeffects;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import unilliondev.tripeffects.trip.TripManager;
import unilliondev.tripeffects.trip.Trips;

public final class TripEffects extends JavaPlugin implements Listener {

    private static TripEffects Instance;

    @Override
    public void onEnable() {
        Instance = this;

        TripManager.initTrips();

        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
    }

    public static TripEffects getInstance() {
        return Instance;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        TripManager.sendTrip(event.getPlayer(), Trips.GLOWING);
    }
}
