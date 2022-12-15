package Spendenaktion;

public class Spendenaktion {

    public int berechneSpende(int n) {
        if (n < 0) {
            return 0;
        }

        int Spende = n;

        if (Spende >= 1) {
            Spende *= 2;
        }

        if (Spende > 10) {
            Spende += 10;
        }

        return Spende;
    }

}
