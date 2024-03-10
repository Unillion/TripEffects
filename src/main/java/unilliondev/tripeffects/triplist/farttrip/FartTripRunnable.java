package unilliondev.tripeffects.triplist.farttrip;

import com.destroystokyo.paper.ParticleBuilder;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class FartTripRunnable extends BukkitRunnable {

    private final Player player;
    private final int duration;
    private int counter = 0;

    public FartTripRunnable(Player player, int duration) {
        this.duration = duration;
        this.player = player;
    }

    @Override
    public void run() {
        counter++;

        player.playSound(player.getLocation(), Sound.ENTITY_WARDEN_AMBIENT, 1f, 2f);
        new ParticleBuilder(Particle.REDSTONE)
                .location(player.getLocation().add(0,1,0))
                .count(5)
                .offset(0.5, 0 ,0.5)
                .color(Color.GREEN, 1)
                .spawn();


        if (counter >= duration) this.cancel();
    }
}
