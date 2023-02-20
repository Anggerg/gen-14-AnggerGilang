package projects.src.subclass;

import projects.src.superclass.Bidangdatar;

//Menghitung luas dan keliling segitiga siku-siku
public class Segitiga extends Bidangdatar {
    private double alas, tinggi;

    //constructor
    public Segitiga() {

    }
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //Setter
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    //Getter
    public double getAlas() {
        return this.alas;
    }
    public double getTinggi() {
        return this.tinggi;
    }

    //Menghitung luas

    @Override
    public String luas() {
        luas = 0.5*(alas*tinggi);
        return "Luas Segitiga = " +luas+" cm";
    }

    //Menghitung keliling


    @Override
    public String keliling() {
        keliling = alas + tinggi + Math.sqrt((alas*alas)+(tinggi*tinggi));
        return "Keliling Segitiga = " +keliling+" cm";
    }
}
