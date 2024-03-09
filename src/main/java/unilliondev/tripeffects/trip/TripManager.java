package unilliondev.tripeffects.trip;

import org.bukkit.entity.Player;
import unilliondev.tripeffects.TripEffects;
import unilliondev.tripeffects.triplist.DarknessTrip;
import unilliondev.tripeffects.triplist.GlowingTrip;

import java.util.HashMap;

public class TripManager {

    public static HashMap<Trips, TripEffect> effects = new HashMap<>();
    static {
        effects.put(Trips.DARKNESS, new DarknessTrip());
        effects.put(Trips.GLOWING, new GlowingTrip());
    }

    public static TripEffect getTripEffect(Trips trip) {
        return effects.get(trip);
    }

    public static void sendTrip(Player player, Trips trip) {
        try {
            getTripEffect(trip).sendTrip(player);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public static void initTrips() {
        for (TripEffect effect : effects.values()) {
            effect.init(TripEffects.getInstance());
        }
    }
}
