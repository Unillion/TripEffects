package unilliondev.tripeffects.triplist.sniffersniff;

import org.bukkit.entity.Player;
import unilliondev.tripeffects.TripEffects;
import unilliondev.tripeffects.trip.TripEffect;

public class SnifferSniffTrip implements TripEffect {
    @Override
    public void sendTrip(Player player) {
        new SnifferSniffRunnable(player, 20).runTaskTimer(TripEffects.getInstance(), 1, 2 * 20);
    }
}
