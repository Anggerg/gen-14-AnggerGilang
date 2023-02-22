package projects.src.tugas2;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {               //baris
            for (int j = 0; j < n; j++) {           //kolom
                if (i == j) {                       //kondisi jika indeks baris dan kolom sama
                    System.out.print(i+j+1);
                } else if (i + j == n - 1) {        //kondisi jika indeks baris+kolom = (jumlah input - 1)
                    System.out.print(2*j+1);
                } else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
