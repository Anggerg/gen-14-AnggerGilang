package projects.src.subclass;

import projects.src.superclass.Bidangdatar;

public class Lingkaran extends Bidangdatar {
    private double jarijari;

    //constructor
    public Lingkaran() {

    }
    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    //Setter
    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    //Getter
    public double getJarijari() {
        return this.jarijari;
    }

    //Menghitung luas
    @Override
    public String luas() {
        luas = Math.PI * jarijari * jarijari;
        return "Luas Lingkaran = " +luas+" cm";
    }

    //Menghitung keliling
    @Override
    public String keliling() {
        keliling = 2 * Math.PI * jarijari;
        return "Keliling Lingkaran = " +keliling+" cm";
    }
}
