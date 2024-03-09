package unilliondev.tripeffects.triplist;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import unilliondev.tripeffects.trip.TripEffect;

public class DarknessTrip implements TripEffect {

    @Override
    public void sendTrip(Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.DARKNESS,15*20,1));
    }

    @Override
    public void init(JavaPlugin main) {

    }
}
