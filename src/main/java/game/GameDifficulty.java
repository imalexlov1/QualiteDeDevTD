package game;

/**
 * @author Yassir Boulouiha Gnaoui & Alex Lovin
 */
public enum GameDifficulty {
    EASY, NORMAL, HARD;

    public GameProfile getProfile() {
        switch (this) {
            case EASY:
                return new GameProfile(400, 20, 250);
            case HARD:
                return new GameProfile(100, 5, 1000);
            case NORMAL:
            default:
                return new GameProfile(200, 10, 500);
        }
    }
}