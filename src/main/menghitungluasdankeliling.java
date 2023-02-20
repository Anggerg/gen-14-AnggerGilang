package projects.src.main;

import projects.src.subclass.BelahKetupat;
import projects.src.subclass.Lingkaran;
import projects.src.subclass.Persegi;
import projects.src.subclass.Segitiga;
import projects.src.superclass.Bidangdatar;

public class menghitungluasdankeliling {
    public static void main(String[] args) {

        System.out.println("\n");

        Segitiga segitiga = new Segitiga(10,24);
        Lingkaran lingkaran = new Lingkaran(14);
        Persegi persegi = new Persegi(12);
        BelahKetupat belahKetupat = new BelahKetupat(18,24);

        //menghitung luas
        Bidangdatar[] luasBidangDatar = {segitiga,lingkaran,persegi,belahKetupat};

        for (Bidangdatar i : luasBidangDatar) {
            System.out.println(i.luas());
        }

        System.out.println("\n");

        //menghitung keliling
        Bidangdatar[] kelilingBidangDatar = {segitiga,lingkaran,persegi,belahKetupat};

        for (Bidangdatar i : kelilingBidangDatar) {
            System.out.println(i.keliling());
        }
    }
}
