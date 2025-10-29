package tugasjv;

import java.util.Scanner;

public class Jam {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jam, menit, detik, totDet;

        // Input dari pengguna
        System.out.print("Masukkan jam   : ");
        jam = input.nextInt();

        System.out.print("Masukkan menit : ");
        menit = input.nextInt();

        System.out.print("Masukkan detik : ");
        detik = input.nextInt();

        // Proses perhitungan total detik
        totDet = (jam * 3600) + (menit * 60) + detik;

        // Output hasil
        System.out.println("Total detik = " + totDet);
    }
}
