package projects.src.proyek;

import projects.src.Model.BelahKetupat;
import projects.src.Model.Lingkaran;
import projects.src.Model.Persegi;
import projects.src.Model.Segitiga;

import java.util.Arrays;

public class menghitungluasdankeliling {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("Program Menghitung Luas dan Keliling Bidang Datar");
        System.out.println("\n");

        //Luas dan Keliling Segitiga
        int alassegitiga = 10;
        int tinggisegitiga = 24;

        Segitiga s = new Segitiga();
        s.setLuasSegitiga(10,24);
        s.setKelilingSegitiga(10,24);
        System.out.println("Sebuah segitiga siku-siku dengan alas = "+alassegitiga+" dan tinggi = "+tinggisegitiga);
        System.out.println("Memiliki Luas = "+s.getLuasSegitiga()+" dan Keliling = "+s.getKelilingSegitiga());

        System.out.println("\n");

        //Luas dan Keliling Lingkaran
        int radius = 14;

        Lingkaran l = new Lingkaran();
        l.setLuasLingkaran(14);
        l.setKelilingLingkaran(14);
        System.out.println("Sebuah lingkaran dengan jari-jari = "+radius);
        System.out.println("Memiliki Luas = "+l.getLuasLingkaran()+" dan Keliling = "+l.getKelilingLingkaran());

        System.out.println("\n");

        //Luas dan Keliling Persegi
        int sisi = 7;

        Persegi p = new Persegi();
        p.setLuasPersegi(7);
        p.setKelilingPersegi(7);
        System.out.println("Sebuah persegi dengan sisi = "+sisi);
        System.out.println("Memiliki Luas = "+p.getLuasPersegi()+" dan Keliling = "+p.getKelilingPersegi());

        System.out.println("\n");

        //Luas dan Keliling Belah Ketupat
        int diag1 = 18;
        int diag2 = 24;

        BelahKetupat b = new BelahKetupat();
        b.setLuasBelahKetupat(18,24);
        b.setKelilingBelahKetupat(18,24);
        System.out.println("Sebuah belah ketupat dengan diagonal 1 = "+diag1+" dan diagonal 2 = "+diag2);
        System.out.println("Memiliki Luas = "+b.getLuasBelahKetupat()+" dan Keliling = "+b.getKelilingBelahKetupat());

        System.out.println("\n");

        System.out.println("Daftar Luas dari Bidang Datar di atas");
        System.out.println("[ Luas segitiga, Luas lingkaran, Luas persegi, Luas belah ketupat ]");
        double[] daftarLuas = new double[4];
        daftarLuas[0] = s.getLuasSegitiga();
        daftarLuas[1] = l.getLuasLingkaran();
        daftarLuas[2] = p.getLuasPersegi();
        daftarLuas[3] = b.getLuasBelahKetupat();

        System.out.println(Arrays.toString(daftarLuas));
    }
}
