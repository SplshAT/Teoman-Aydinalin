package Kino;

public class Kino {

    public int getKinopreis(int alter) {
        if (alter < 0) {
            return 0;
        } else if (alter < 3) {
            return 0;
        } else if (alter < 13) {
            return 2;
        } else if (alter < 18) {
            return 5;
        } else if (alter < 65) {
            return 10;
        } else {
            return 6;
        }
    }

    }
