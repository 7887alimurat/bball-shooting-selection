package Strategy;

public class LayupShot implements ShotStrategy {
    @Override
    public void shoot(int point) {
        System.out.println("Layup shot for " + point + " points!");
    }
}
