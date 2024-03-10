package unilliondev.tripeffects.triplist;

import com.comphenix.protocol.PacketType;

import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import unilliondev.tripeffects.TripEffects;
import unilliondev.tripeffects.trip.TripEffect;

public class MeowFishTrip implements TripEffect {

    @Override
    public void sendTrip(Player player) {
        TripEffects.getProtocolManager().addPacketListener(new PacketAdapter(TripEffects.getInstance(), PacketType.Play.Server.NAMED_SOUND_EFFECT) {
            @Override
            public void onPacketSending(PacketEvent event) {
                PacketContainer container = new PacketContainer(PacketType.Play.Server.NAMED_SOUND_EFFECT);

                container.getSoundEffects().write(0, Sound.ENTITY_CAT_PURREOW);
                container.getSoundCategories().write(0, event.getPacket().getSoundCategories().read(0));

                container.getIntegers().write(0, event.getPacket().getIntegers().read(0));
                container.getIntegers().write(1, event.getPacket().getIntegers().read(1));
                container.getIntegers().write(2, event.getPacket().getIntegers().read(2));

                container.getFloat().write(0, 0.5f);
                container.getFloat().write(1, 1f);
                container.getLongs().write(0, 1l);

                event.setPacket(container);
            }
        });
    }
}
