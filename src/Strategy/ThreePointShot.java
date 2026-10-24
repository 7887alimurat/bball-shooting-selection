package Strategy;

public class ThreePointShot implements ShotStrategy {
    @Override
    public void shoot(int point) {
        System.out.println("Three line shot for " + point + " points!");
    }
}
