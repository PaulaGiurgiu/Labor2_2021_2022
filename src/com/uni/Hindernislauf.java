package com.uni;

public class Hindernislauf extends Leichtathletik{
    /* Nachbedingung: die Zeit der "Hindernislauf"-Aktivität zuruckgeben */
    @Override
    public double kalkuliereZeit() {               //die "kalkuliereZeit"-Methode aus der Interface "Sport" uberschreiben
        return 30;
    }
}
