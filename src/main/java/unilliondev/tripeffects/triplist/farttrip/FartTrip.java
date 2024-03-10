package unilliondev.tripeffects.triplist.farttrip;

import org.bukkit.entity.Player;
import unilliondev.tripeffects.TripEffects;
import unilliondev.tripeffects.trip.TripEffect;

public class FartTrip implements TripEffect {

    @Override
    public void sendTrip(Player player) {
        new FartTripRunnable(player, 25).runTaskTimer(TripEffects.getInstance(), 1, 2 * 20);
    }
}
