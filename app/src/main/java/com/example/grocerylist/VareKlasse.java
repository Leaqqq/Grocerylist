package com.example.grocerylist;

public class VareKlasse {

    public String vareNavn;
    public boolean erStandardVare;
    public int antal;
    public String kommentar;

    //Constructor, only name and a bool to check whether or not the ware is standard is always necessary.
    public VareKlasse(String vareNavn, boolean erStandardVare) {
        this.vareNavn = vareNavn;
        this.erStandardVare = erStandardVare;
    }

    //Getters and Setters
    public void setVareNavn(String vareNavn) {
        this.vareNavn = vareNavn;
    }

    public String getName() {
        return this.vareNavn;
    }

    public boolean getErStandardVare() {
        return this.erStandardVare;
    }

    public void setErStandardVare(boolean erStandardVare) {
        this.erStandardVare = erStandardVare;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public int getAntal() {
        return this.antal;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public String getKommentar() {
        return kommentar;
    }
}