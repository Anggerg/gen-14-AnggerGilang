package projects.src.main;

import projects.src.subclass.BelahKetupat;
import projects.src.subclass.Lingkaran;
import projects.src.subclass.Persegi;
import projects.src.subclass.Segitiga;
import projects.src.superclass.Bidangdatar;

public class menghitungluasdankeliling {
    public static void main(String[] args) {

        System.out.println("\n");

        Segitiga segitiga = new Segitiga(9,12);
        Lingkaran lingkaran = new Lingkaran(14);
        Persegi persegi = new Persegi(12);
        BelahKetupat belahKetupat = new BelahKetupat(18,24);

        //menampilkan luas
        Bidangdatar[] luasBidangDatar = {segitiga,lingkaran,persegi,belahKetupat};

        Bidangdatar bidangdatar;
        for (int i = 0; i < luasBidangDatar.length; i++) {
            bidangdatar = luasBidangDatar[i];
            System.out.println(bidangdatar.luas());
        }

        System.out.println("\n");

        //menampilkan keliling
        Bidangdatar[] kelilingBidangDatar = {segitiga,lingkaran,persegi,belahKetupat};

        for (int i = 0; i < kelilingBidangDatar.length; i++) {
            bidangdatar = kelilingBidangDatar[i];
            System.out.println(bidangdatar.keliling());
        }
    }
}
