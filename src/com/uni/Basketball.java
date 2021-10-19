package com.uni;

public class Basketball extends Mannschaftssport{
    /**
     * @return die Zeit der "Basketball`"-Aktivität zuruckgeben
     */
    @Override
    public double kalkuliereZeit() {                //die "kalkuliereZeit"-Methode aus der Interface "Sport" uberschreiben
        return 55;
    }
}
