package live;

import music.playable;
import music.string.veena;
import music.wind.saxophone;

public class test {

    public static void main(String[] args) {

        veena v = new veena();
        v.play();

        saxophone s = new saxophone();
        s.play();

        playable p;

        p = new veena();
        p.play();

        p = new saxophone();
        p.play();
    }
}