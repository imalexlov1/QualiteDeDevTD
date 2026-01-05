package game;

public class GameProfile {
    public int startMoney;
    public int startLives;
    public int winCondition;

    public GameProfile(int money, int lives, int win) {
        this.startMoney = money;
        this.startLives = lives;
        this.winCondition = win;
    }
}