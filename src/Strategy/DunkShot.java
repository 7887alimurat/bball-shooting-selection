package Strategy;

//A new concrete strategy to show easy extensibility.

public class DunkShot implements ShotStrategy {
    @Override
    public void shoot(int points) {
        System.out.println("Dunk shot for " + points + " points!");
    }
}

