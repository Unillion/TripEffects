package unilliondev.tripeffects.triplist;

import com.destroystokyo.paper.Title;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import unilliondev.tripeffects.trip.TripEffect;

public class ColoredScreenTrip implements TripEffect {

    private ChatColor tripColor;

    public ColoredScreenTrip() {
        this.tripColor = ChatColor.WHITE;
    }

    public void setColor(ChatColor color) {
        this.tripColor = color;
    }

    @Override
    public void sendTrip(Player player) {
        player.sendTitle(new Title(new TextComponent(tripColor + "a")));
    }

}
