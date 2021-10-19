package com.uni;

public class Leichtathletik implements Sport{
    /**
     * //die "kalkuliereZeit"-Methode aus der Interface "Sport" uberschreiben
     * @return die Zeit der "Leichtathletik"-Aktivität zuruckgeben
     */
    @Override
    public double kalkuliereZeit() {
        Hindernislauf hl = new Hindernislauf();
        Hochsprung hs = new Hochsprung();

        return hl.kalkuliereZeit() + hs.kalkuliereZeit();   //die Zeit der allen Leichtathletiksportarten zuruckgeben
    }
}
