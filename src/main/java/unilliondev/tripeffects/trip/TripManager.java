package unilliondev.tripeffects.trip;

import org.bukkit.entity.Player;
import unilliondev.tripeffects.TripEffects;
import unilliondev.tripeffects.triplist.DarknessTrip;
import unilliondev.tripeffects.triplist.GlowingTrip;

import java.util.HashMap;

public class TripManager {

    public static TripEffect getTripEffect(Trips trip) {
        return trip.getTripEffect();
    }

    public static void sendTrip(Player player, Trips trip) {
        getTripEffect(trip).sendTrip(player);
    }

    public static void initTrips() {
        for (TripEffect effect : effects.values()) {
            effect.init(TripEffects.getInstance());
        }
    }
}
