package nl.thedutchruben.minigames.core.Minigames.framework.minigame;

import nl.thedutchruben.minigames.core.Minigames.framework.addon.Addon;

/**
 * Minigame extends {@link Addon}
 */
public abstract class Minigame extends Addon {
    private String name;
    private String authur;
    private double version;

    public Minigame(String name, String authur, double version) {
        this.name = name;
        this.authur = authur;
        this.version = version;
    }
}
