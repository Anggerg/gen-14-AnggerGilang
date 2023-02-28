package projects.src.tugas3;

import java.util.Scanner;

public class BarangMahal {
    public static void main(String[] args) {
        int uang;
        int Oreo = 6000;
        int Tango = 5000;
        int Buavita = 7000;
        int Aqua = 3000;

        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah uang yang dimiliki: ");
        uang = input.nextInt();

        System.out.println("Produk Oreo, harga : "+Oreo);
        System.out.println("Produk Tango, harga : "+Tango);
        System.out.println("Produk Buavita, harga : "+Buavita);
        System.out.println("Produk Aqua, harga : "+Aqua);

        System.out.println("Rekomendasi barang paling mahal yang bisa dibeli" +
                " dengan uang sebesar " + uang + " adalah : ");

        if (uang < Aqua){
            System.out.println("Uang tidak cukup");
        }

        while (uang > 3000){
            if (uang - Buavita >= 0) {
                uang -= Buavita;
                System.out.println("Buavita");
            } else if (uang - Oreo >= 0) {
                uang -= Oreo;
                System.out.println("Oreo");
            } else if (uang - Tango >= 0){
                uang -= Tango;
                System.out.println("Tango");
            } else {
                uang -= Aqua;
                System.out.println("Aqua");
            }
        }

        System.out.println("Sisa uang sebesar: " + uang);
    }
}
