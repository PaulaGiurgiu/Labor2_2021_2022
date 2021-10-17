package com.uni;

import java.util.List;

public class Benutzer {
    private String vorname;
    private String nachname;
    private List<Sport> sport;

    /*  Vorbedingung: zwei Strings und eine Liste von Sportarten*/
    /*  Nachbedingung: ein Objekt von Typ "Benutzer" */
    public Benutzer(String vorname, String nachname, List<Sport> sport)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.sport = sport;
    }

    /* Getters */
    /*  Nachbedingung: der aktuelle Vorname zuruckgeben */
    public String getVorname() {
        return vorname;
    }

    /*  Nachbedingung: der aktuelle Nachname zuruckgeben */
    public String getNachname() {
        return nachname;
    }

    /*  Nachbedingung: die aktuelle Liste von Sportarten zuruckgeben */
    public List<Sport> getSport() {
        return sport;
    }

    /* Setters */
    /*  Vorbedingung: ein neuer Vorname */
    /*  Nachbedingung: der alte Vorname wird mit dem gegebenen Vorname verandert */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /*  Vorbedingung: ein neuer Nachname */
    /*  Nachbedingung: der alte Nachname wird mit dem gegebenen Nachname verandert */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /*  Vorbedingung: eine Liste von Sportarten*/
    /*  Nachbedingung: die alte Liste wird mit der gegebenen Liste verandert*/
    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /* Methoden */
    /*  Nachbedingung: die Zeit der allen gegebenen Sportarten*/
    public double kalkuliereZeit() {                                //die "kalkuliereZeit"-Methode rechnet die Zeit der allen gewahlten Sportarten
        int sum = 0;
        for (Sport sp:sport) {
            sum += sp.kalkuliereZeit();
        }
        return sum;
    }

    /*  Vorbedingung: ein Objekt von Typ "Sport" */
    /*  Nachbedingung: die Zeit der gegebenen Sportart */
    public double kalkuliereZeit(Sport s)                           //die "kalkuliereZeit"-Methode rechnet die Zeit einer bestimten Sportart
    {
        int count = 0;
        for (int i = 0; i < sport.size(); i++) {                    //wir laufen die gegebene Liste durch, die Anzahl der Sportarten "s" zu finden
            if (sport.get(i) == s)
            {
                count++;
            }
            else if (sport.get(i) instanceof Mannschaftssport && s instanceof Basketball && !(s instanceof Fussball) && !(sport.get(i) instanceof Fussball))
            {
                count++;
            }
            else if (sport.get(i) instanceof Mannschaftssport && s instanceof Fussball && !(s instanceof Basketball) && !(sport.get(i) instanceof Basketball))
            {
                count++;
            }
            else if (sport.get(i) instanceof Leichtathletik && s instanceof Hindernislauf && !(s instanceof Hochsprung) && !(sport.get(i) instanceof Hochsprung))
            {
                count++;
            }
            else if (sport.get(i) instanceof Leichtathletik && s instanceof Hochsprung && !(s instanceof Hindernislauf) && !(sport.get(i) instanceof Hindernislauf))
            {
                count++;

            }
        }

        if (count == 0)
            count = 1;

        return count * s.kalkuliereZeit();
    }

    /*  Nachbedingung: die Durchschnittzeit der allen Sportarten des Benutzers */
    public double kalkuliereDurschnittszeit()                       //die "kalkuliereDurschnittszeit"-Methode rechnet die Durchschnittzeit der allen gewahlten Sportarten
    {
        return kalkuliereZeit()/sport.size();
    }
}
