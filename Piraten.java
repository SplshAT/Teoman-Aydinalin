package Piraten;

public class Piraten {

    public int berechneKapitänsAnteil(int Dublonen, int anzahlPiraten) {
        int anteilFürJedenPiraten = Dublonen / anzahlPiraten;
        int überschüssigerAnteil = Dublonen % anzahlPiraten;

        return überschüssigerAnteil;


    }
}
