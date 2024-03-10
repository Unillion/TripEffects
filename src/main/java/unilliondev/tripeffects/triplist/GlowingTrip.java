package unilliondev.tripeffects.triplist;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import unilliondev.tripeffects.trip.TripEffect;

public class GlowingTrip implements TripEffect {

    @Override
    public void sendTrip(Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 156 * 20,1, false, false));
    }
}
