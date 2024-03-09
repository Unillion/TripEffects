package unilliondev.tripeffects.trip;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public interface TripEffect {
    void sendTrip(Player player);
    void init(JavaPlugin main);
}
