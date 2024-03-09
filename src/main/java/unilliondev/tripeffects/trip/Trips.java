package unilliondev.tripeffects.trip;

public enum Trips {
    DARKNESS(new DarknessTrip()),
    GLOWING(new GlowingTrip()) 


    private TripEffect effect;

    Trips(TripEffect effect) {
        this.effect = effect;
    }

    public TripEffect getTripEffect() {
        return effect;
    }
}
