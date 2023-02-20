package projects.src.subclass;

import projects.src.superclass.Bidangdatar;

public class Persegi extends Bidangdatar {
    private double sisi;

    //constructor
    public Persegi() {

    }
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    //Setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    //Getter
    public double getSisi() {
        return this.sisi;
    }

    //Menghitung luas
    @Override
    public String luas() {
        luas = sisi * sisi;
        return "Luas Persegi = " +luas+" cm";
    }

    //Menghitung keliling
    @Override
    public String keliling() {
        keliling = 4 * sisi;
        return "Keliling Persegi = " +keliling+" cm";
    }
}
