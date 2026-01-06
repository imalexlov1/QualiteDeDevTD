package game;

/**
 * @author Yassir Boulouiha Gnaoui & Alex Lovin
 */
public class MissileEffect extends Effect {
    public MissileEffect(Coordinate pos, Coordinate target) {
        ImageLoader loader = ImageLoader.getLoader();
        this.picture = loader.getImage("sun_spot.png");
        
        this.posX = pos.x;
        this.posY = pos.y;
        
        // Calcul du vecteur vers la cible
        this.velocityX = target.x - this.posX;
        this.velocityY = target.y - this.posY;
        
        this.ageInSeconds = 0;
    }
}
