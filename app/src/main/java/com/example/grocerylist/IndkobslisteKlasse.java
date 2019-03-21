package com.example.grocerylist;

public class IndkobslisteKlasse {

    public String navn;
    public VareKlasse[] vareKlasseListe;

    //Constructor, only name and a bool to check whether or not the ware is standard is always necessary.
    public IndkobslisteKlasse(String navn, VareKlasse[] vareKlasseListe) {
        this.navn = navn;
        this.vareKlasseListe = vareKlasseListe;
    }

    //Getters and Setters
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return this.navn;
    }

    public void setVareKlasseListe(VareKlasse[] vk) { this.vareKlasseListe = vk; }

    public VareKlasse[] getVareKlasseListe() { return this.vareKlasseListe; }
}