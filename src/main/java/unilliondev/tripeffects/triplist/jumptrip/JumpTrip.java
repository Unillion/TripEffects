package unilliondev.tripeffects.triplist.jumptrip;

import org.bukkit.entity.Player;
import unilliondev.tripeffects.TripEffects;
import unilliondev.tripeffects.trip.TripEffect;

public class JumpTrip implements TripEffect {

    @Override
    public void sendTrip(Player player) {
        new JumpTripRunnable(player, 30).runTaskTimer(TripEffects.getInstance(), 1, 5 * 20);
    }
}
