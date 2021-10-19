package com.uni;

import java.util.List;

public class Benutzer {
    private String vorname;
    private String nachname;
    private List<Sport> sport;

    /**
     * //ein Objekt von Typ "Benutzer" erstellen
     * @param vorname ein String
     * @param nachname ein String
     * @param sport eine Liste von Sportarten
     */
    public Benutzer(String vorname, String nachname, List<Sport> sport)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.sport = sport;
    }

    /* Getters */
    /**
     * @return der aktuelle Vorname zuruckgeben
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * @return der aktuelle Nachname zuruckgeben
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * @return die aktuelle Liste von Sportarten zuruckgeben
     */
    public List<Sport> getSport() {
        return sport;
    }

    /* Setters */
    /**
     * //der alte Vorname wird mit dem gegebenen Vorname verandert
     * @param vorname ein neuer Vorname
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * //der alte Nachname wird mit dem gegebenen Nachname verandert
     * @param nachname ein neuer Nachname
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * //die alte Liste wird mit der gegebenen Liste verandert
     * @param sport eine Liste von Sportarten
     */
    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /* Methoden */
    /**
     * //die "kalkuliereZeit"-Methode rechnet die Zeit der allen gewahlten Sportarten
     * @return die Zeit der allen gegebenen Sportarten
     */
    public double kalkuliereZeit() {
        int sum = 0;
        for (Sport sp:sport) {
            sum += sp.kalkuliereZeit();
        }
        return sum;
    }

    /**
     * //die "kalkuliereZeit"-Methode rechnet die Zeit einer bestimten Sportart
     * @param s ein Objekt von Typ "Sport"
     * @return die Zeit der gegebenen Sportart
     */
    public double kalkuliereZeit(Sport s)
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

    /**
     * //die "kalkuliereDurschnittszeit"-Methode rechnet die Durchschnittzeit der allen gewahlten Sportarten
     * @return die Durchschnittzeit der allen Sportarten des Benutzers
     */
    public double kalkuliereDurschnittszeit()
    {
        return kalkuliereZeit()/sport.size();
    }
}
