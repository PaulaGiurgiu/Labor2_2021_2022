package com.uni;

public class Hochsprung extends Leichtathletik{
    /* Nachbedingung: die Zeit der "Hochsprung"-Aktivität zuruckgeben */
    @Override
    public double kalkuliereZeit() {               //die "kalkuliereZeit"-Methode aus der Interface "Sport" uberschreiben
        return 20;
    }
}
