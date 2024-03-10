package unilliondev.tripeffects.triplist.belchtrip;

import org.bukkit.entity.Player;
import unilliondev.tripeffects.TripEffects;
import unilliondev.tripeffects.trip.TripEffect;

public class BelchTrip implements TripEffect {
    @Override
    public void sendTrip(Player player) {
        new BelchTripRunnable(player, 25 * 20).runTaskTimer(TripEffects.getInstance(), 1, 2 * 20);
    }
}
