package Context;

import Strategy.ShotStrategy;

public abstract class Player {

    private ShotStrategy shot;

    public Player(ShotStrategy shot) {
        this.shot = shot;
    }

    public void setShot(ShotStrategy shot) {
        this.shot = shot;
    }

    public void takeShot(int point) {
        shot.shoot(point);
    }



}
