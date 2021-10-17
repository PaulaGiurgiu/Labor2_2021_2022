package com.uni;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Basketball bb = new Basketball();
        Fussball fb = new Fussball();
        Hindernislauf hl = new Hindernislauf();
        Hochsprung hs = new Hochsprung();
        Leichtathletik la = new Leichtathletik();
        Mannschaftssport ma = new Mannschaftssport();

        Benutzer b1 = new Benutzer("Lilly", "Hart", Arrays.asList(bb, fb, hl, hs, la, ma));
        System.out.print(b1.getVorname());
        System.out.print("\n");
        System.out.print(b1.getNachname());
        System.out.print("\n");
        System.out.print(b1.kalkuliereZeit());
        System.out.print("\n");
        System.out.println(b1.kalkuliereZeit(bb));
        System.out.println(b1.kalkuliereZeit(fb));
        System.out.println(b1.kalkuliereZeit(hl));
        System.out.println(b1.kalkuliereZeit(hs));
        System.out.println(b1.kalkuliereDurschnittszeit());

    }
}
