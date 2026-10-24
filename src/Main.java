import Context. *;
import Strategy. *;

public class Main {
    public static void main(String[] args) {
        playRound(new PointGuard(new MidRangeShot()));
        playRound(new SmallForward(new MidRangeShot()));
        playRound(new Center(new MidRangeShot()));
    }

        private static void playRound(Player player) {
            System.out.println("----- " + player.getClass().getSimpleName() + " -----");
            player.takeShot(2);

            player.setShot(new ThreePointShot());
            player.takeShot(3);

            player.setShot(new LayupShot());
            player.takeShot(2);
        }
}