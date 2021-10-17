package com.uni;

public class Mannschaftssport implements Sport{
    /* Nachbedingung: die Zeit der "Mannschaftssport"-Aktivität zuruckgeben */
    @Override
    public double kalkuliereZeit() {                            //die "kalkuliereZeit"-Methode aus der Interface "Sport" uberschreiben
        Basketball bb = new Basketball();
        Fussball fb = new Fussball();

        return bb.kalkuliereZeit() + fb.kalkuliereZeit();       //die Zeit der allen Manschaftssportarten zuruckgeben
    }
}
