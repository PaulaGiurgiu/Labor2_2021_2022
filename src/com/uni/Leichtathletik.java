package com.uni;

public class Leichtathletik implements Sport{
    /* Nachbedingung: die Zeit der "Leichtathletik"-Aktivität zuruckgeben */
    @Override
    public double kalkuliereZeit() {                        //die "kalkuliereZeit"-Methode aus der Interface "Sport" uberschreiben
        Hindernislauf hl = new Hindernislauf();
        Hochsprung hs = new Hochsprung();

        return hl.kalkuliereZeit() + hs.kalkuliereZeit();   //die Zeit der allen Leichtathletiksportarten zuruckgeben
    }
}
