package Strategy;

public class MidRangeShot implements ShotStrategy {
    @Override
    public void shoot(int point) {
        System.out.println("Mid-range shot for " + point + " points!");
    }
}
