package unilliondev.tripeffects.triplist.belchtrip;

import com.destroystokyo.paper.ParticleBuilder;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class BelchTripRunnable extends BukkitRunnable {

    private final Player player;
    private final int duration;
    private int counter = 0;

    public BelchTripRunnable(Player player, int duration) {
        this.duration = duration;
        this.player = player;
    }

    @Override
    public void run() {
        counter++;

        player.playSound(player.getLocation(), Sound.ENTITY_LLAMA_AMBIENT, 1f, 2f);
        new ParticleBuilder(Particle.REDSTONE)
                .location(player.getEyeLocation())
                .count(5)
                .color(Color.GREEN, 1)
                .spawn();


        if (counter >= duration) this.cancel();
    }
}
