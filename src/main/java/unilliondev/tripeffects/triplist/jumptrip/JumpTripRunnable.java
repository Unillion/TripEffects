package unilliondev.tripeffects.triplist.jumptrip;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class JumpTripRunnable extends BukkitRunnable {

    private final Player player;
    private final int duration;
    private int counter = 0;

    public JumpTripRunnable(Player player, int duration) {
        this.duration = duration;
        this.player = player;
    }

    @Override
    public void run() {
        counter++;
        if (!player.isOnGround()) return;

        Vector v = player.getLocation().getDirection().multiply(1).setY(0.5);

        player.setVelocity(v);
        player.playSound(player.getLocation(), Sound.ENTITY_SLIME_JUMP, 1,1);

        if (counter >= duration) this.cancel();
    }
}
