package com.uni;

public class Fussball extends Mannschaftssport{
    /**
     * @return die Zeit der "Fussball"-Aktivität zuruckgeben
     */
    @Override
    public double kalkuliereZeit() {                //die "kalkuliereZeit"-Methode aus der Interface "Sport" uberschreiben
        return 65;
    }
}
