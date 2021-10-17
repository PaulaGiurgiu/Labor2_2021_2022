package com.uni;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportTest {

    @Test
    void kalkuliereZeit() {
        Mannschaftssport ma = new Mannschaftssport();
        assertEquals(ma.kalkuliereZeit(), 120);

        Leichtathletik la = new Leichtathletik();
        assertEquals(la.kalkuliereZeit(), 50);

        Basketball bb = new Basketball();
        assertEquals(bb.kalkuliereZeit(), 55);

        Fussball fb = new Fussball();
        assertEquals(fb.kalkuliereZeit(), 65);

        Hindernislauf hl = new Hindernislauf();
        assertEquals(hl.kalkuliereZeit(), 30);

        Hochsprung hs = new Hochsprung();
        assertEquals(hs.kalkuliereZeit(), 20);
    }
}