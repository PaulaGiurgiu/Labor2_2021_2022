package com.uni;

public class Mannschaftssport implements Sport{
    /**
     * //die "kalkuliereZeit"-Methode aus der Interface "Sport" uberschreiben
     * @return die Zeit der "Mannschaftssport"-Aktivität zuruckgeben
     */
    @Override
    public double kalkuliereZeit() {
        Basketball bb = new Basketball();
        Fussball fb = new Fussball();

        return bb.kalkuliereZeit() + fb.kalkuliereZeit();       //die Zeit der allen Manschaftssportarten zuruckgeben
    }
}
