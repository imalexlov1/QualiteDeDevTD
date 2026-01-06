package game;

import java.util.List;

/**
 * @author Yassir Boulouiha Gnaoui & Alex Lovin
 */
public class Missile extends Tower {

    public Missile(Coordinate pos) {
        ImageLoader loader = ImageLoader.getLoader();
        this.tower = loader.getImage("missile.png");
        this.position = pos;
        this.anchorX = -30;
        this.anchorY = -30;
        this.cost = 60;
        this.range = 20;
    }

    @Override
    public void interact(Game game, double deltaTime) {
        timeSinceLastFire += deltaTime;

        if (timeSinceLastFire < 1.5)
            return;

        List<Enemy> enemies = game.enemies;

        for (Enemy e : enemies) {
            Coordinate enemyPos = e.getPosition().getCoordinate();
            double dx, dy, dist;

            dx = enemyPos.x - position.x;
            dy = enemyPos.y - position.y;

            dist = Math.sqrt((dx * dx) + (dy * dy));

            if (dist < range) {
                // Pour l'instant, on simule un tir avec un effet s'il existait un MissileEffect
                // On peut réutiliser SunSpot ou StarDust pour la démo ou créer un nouvel effet
                // game.effects.add(new StarDust(new Coordinate(position.x, position.y), enemyPos));
                timeSinceLastFire = 0;
                return;
            }
        }
    }

}
