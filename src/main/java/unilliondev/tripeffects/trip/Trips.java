package unilliondev.tripeffects.trip;

import unilliondev.tripeffects.triplist.DarknessTrip;
import unilliondev.tripeffects.triplist.GlowingTrip;
import unilliondev.tripeffects.triplist.MeowFishTrip;
import unilliondev.tripeffects.triplist.ColoredScreenTrip;
import unilliondev.tripeffects.triplist.belchtrip.BelchTrip;
import unilliondev.tripeffects.triplist.farttrip.FartTrip;
import unilliondev.tripeffects.triplist.jumptrip.JumpTrip;
import unilliondev.tripeffects.triplist.sniffersniff.SnifferSniffTrip;

public enum Trips {
    DARKNESS(new DarknessTrip()),
    COLORED_SCREEN(new ColoredScreenTrip()),
    GLOWING(new GlowingTrip()),
    SNIFFING(new SnifferSniffTrip()),
    JUMP(new JumpTrip()),
    FART(new FartTrip()),
    BELCH(new BelchTrip()),
    MEOW(new MeowFishTrip());

    private final TripEffect effect;

    Trips(TripEffect effect) {
        this.effect = effect;
    }

    public TripEffect getTripEffect() {
        return effect;
    }
}
