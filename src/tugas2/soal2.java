package projects.src.tugas2;

import java.util.Scanner;

public class soal2 {
    public static void main (String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {           //baris
            for (int j = 0; j < n; j++) {       //kolom
                if (i == j) {                   //kondisi jika indeks baris dan kolom sama, maka cetak *
                    System.out.print("* ");
                } else if (i + j == n - 1) {    //kondisi jika indeks baris+kolom = (jumlah input - 1), maka cetak *
                    System.out.print("* ");
                } else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
