package com.example.grocerylist;

public class VareKlasse {

    public long id;
    public String vareNavn;
    public int erStandardVare;
    public int antal;
    public String kommentar;

    //Constructor, only name and a bool to check whether or not the ware is standard is always necessary.
    public VareKlasse(String vareNavn,int antal,int erStandardVare,String kommentar){
    this(-1,vareNavn,antal,erStandardVare,kommentar);
    }
    public VareKlasse(long id,String vareNavn, int antal,int erStandardVare,String kommentar) {
        this.id=id;
        this.vareNavn = vareNavn;
        this.antal=antal;
        this.erStandardVare = erStandardVare;
        this.kommentar=kommentar;
    }

    //Getters and Setters
    public void setVareNavn(String vareNavn) {
        this.vareNavn = vareNavn;
    }

    public String getName() {
        return this.vareNavn;
    }

    public int getErStandardVare() {
        return this.erStandardVare;
    }

    public void setErStandardVare(int erStandardVare) {
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
    @Override
    public String toString(){
        return this.antal+" Stk "+this.vareNavn;
    }
}