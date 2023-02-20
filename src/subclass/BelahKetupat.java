package projects.src.subclass;

import projects.src.superclass.Bidangdatar;

public class BelahKetupat extends Bidangdatar {
    private double diagonal1, diagonal2;

    //constructor
    public BelahKetupat() {

    }
    public BelahKetupat(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    //Setter
    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }
    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    //Getter
    public double getDiagonal1() {
        return this.diagonal1;
    }
    public double getDiagonal2() {
        return this.diagonal2;
    }

    //Menghitung luas
    @Override
    public String luas() {
        luas = 0.5*(diagonal1 * diagonal2);
        return "Luas Belah Ketupat = " +luas+" cm";
    }

    //Menghitung keliling
    @Override
    public String keliling() {
        keliling = 4 * (Math.sqrt(((0.5 * diagonal1)*(0.5 * diagonal1))
                + ((0.5 * diagonal2)*(0.5 * diagonal2))));
        return "Keliling Belah Ketupat = " +keliling+" cm";
    }
}
