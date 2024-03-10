package unilliondev.tripeffects.trip;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import unilliondev.tripeffects.triplist.ColoredScreenTrip;

public class TripManager {

    public static TripEffect getTripEffect(Trips trip) {
        return trip.getTripEffect();
    }

    public static void sendTrip(Player player, Trips trip) {
        getTripEffect(trip).sendTrip(player);
    }

    public static void sendTrip(Player player, Trips trip, ChatColor color) {
        TripEffect tripEffect = trip.getTripEffect();

        if (tripEffect instanceof ColoredScreenTrip) {
            ((ColoredScreenTrip) tripEffect).setColor(color);
        }

        tripEffect.sendTrip(player);
    }
}
