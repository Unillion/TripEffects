package unilliondev.tripeffects.triplist.sniffersniff;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class SnifferSniffRunnable extends BukkitRunnable {

    private final int duration;
    private int counter = 0;
    private final Player player;

    public SnifferSniffRunnable(Player player, int duration) {
        this.player = player;
        this.duration = duration;
    }

    @Override
    public void run() {
        counter++;

        if (counter % 2 == 0) player.playSound(player.getLocation(), Sound.ENTITY_SNIFFER_SNIFFING, 10f,1);

        if (counter >= duration) this.cancel();
    }
}
