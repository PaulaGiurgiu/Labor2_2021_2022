package com.uni;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BenutzerTest {

    @Test
    void getVorname() {
        Benutzer b1 = new Benutzer("Tom", "Hart", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals("Tom", b1.getVorname());
    }

    @Test
    void getNachname() {
        Benutzer b1 = new Benutzer("Tom", "Hart", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals("Hart", b1.getNachname());
    }

    @Test
    void getSport() {
        Benutzer b1 = new Benutzer("Tom", "Hart", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals(b1.getSport().get(0).getClass(), Basketball.class);
        assertEquals(b1.getSport().get(1).getClass(), Fussball.class);
        assertEquals(b1.getSport().get(2).getClass(), Hochsprung.class);
        assertEquals(b1.getSport().get(3).getClass(), Hindernislauf.class);
    }

    @Test
    void setVorname() {
        Benutzer b1 = new Benutzer("Tom", "Hart", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        b1.setVorname("John");
        assertEquals("John", b1.getVorname());
    }

    @Test
    void setNachname() {
        Benutzer b1 = new Benutzer("Tom", "Hart", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        b1.setNachname("John");
        assertEquals("John", b1.getNachname());
    }

    @Test
    void setSport() {
        Benutzer b1 = new Benutzer("Tom", "Hart", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        b1.setSport(Arrays.asList(new Hindernislauf(), new Hochsprung(), new Fussball(), new Basketball()));
        assertEquals(b1.getSport().get(3).getClass(), Basketball.class);
        assertEquals(b1.getSport().get(2).getClass(), Fussball.class);
        assertEquals(b1.getSport().get(1).getClass(), Hochsprung.class);
        assertEquals(b1.getSport().get(0).getClass(), Hindernislauf.class);
    }

    @Test
    void kalkuliereZeit() {
        Benutzer b1 = new Benutzer("Tom", "Hart", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals(170, b1.kalkuliereZeit());
    }

    @Test
    void testKalkuliereZeit() {
        Basketball bb = new Basketball();
        Fussball fb = new Fussball();
        Hochsprung hs = new Hochsprung();
        Hindernislauf hl = new Hindernislauf();
        Mannschaftssport ms = new Mannschaftssport();
        Leichtathletik la = new Leichtathletik();

        Benutzer b1 = new Benutzer("Tom", "Hart", Arrays.asList(bb, fb, hs, hl));
        assertEquals(55, b1.kalkuliereZeit(bb));
        assertEquals(65, b1.kalkuliereZeit(fb));
        assertEquals(30, b1.kalkuliereZeit(hl));
        assertEquals(20, b1.kalkuliereZeit(hs));

        Benutzer b2 = new Benutzer("Zoe", "Hart", Arrays.asList(bb, bb, bb, fb, fb, hs, hl, hl, hl, hl, ms, la));
        assertEquals(220, b2.kalkuliereZeit(bb));
        assertEquals(195, b2.kalkuliereZeit(fb));
        assertEquals(150, b2.kalkuliereZeit(hl));
        assertEquals(40, b2.kalkuliereZeit(hs));

    }

    @Test
    void kalkuliereDurschnittszeit() {
        Benutzer b1 = new Benutzer("Tom", "Hart", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals(42.5, b1.kalkuliereDurschnittszeit());
    }
}