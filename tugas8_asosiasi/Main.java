/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8_asosiasi;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {

        Pemilik p = new Pemilik("Budi", "Jl. Merdeka No.10");
        Mobil m1 = new Mobil("BMW","F 123 WY",2010);
        Mobil m2 = new Mobil("Toyota","F 126 WY",2010);
        Mobil m3 = new Mobil("Merci","F 124 WY",2010);
        
        p.noPlatMobil[0] = m1.getnoPlat();
        p.noPlatMobil[1] = m2.getnoPlat();
        p.noPlatMobil[2] = m3.getnoPlat();
        p.jumlahMobil = 3;

        System.out.println("\n=== Pemilik Mobil ===");
        System.out.println("nama           : " + p.getNama());
        System.out.println("Alamat         : " + p.getAlamat());
        System.out.println("Data Mobil: ");
        System.out.println("Merk            : "+ m1.getMerek());
        System.out.println("Plat Mobil      : " + m1.getnoPlat());
        System.out.println("Tahun Keluaran  : "+m1.gettahunKeluaran());
        System.out.println("====================================");
        System.out.println("Merk            : "+ m2.getMerek());
        System.out.println("Plat Mobil      : " + m2.getnoPlat());
        System.out.println("Tahun Keluaran  : "+m2.gettahunKeluaran());
        System.out.println("====================================");
        System.out.println("Merk            : "+ m3.getMerek());
        System.out.println("Plat Mobil      : " + m3.getnoPlat());
        System.out.println("Tahun Keluaran  : "+m3.gettahunKeluaran());
        
        
        // DEMONSTRASI BELI MOBIL
//        p.beliMobil();
//        p.beliMobil();
        
        // DEMONSTRASI JUAL MOBIL
        System.out.println("\n=== Penjualan Mobil ===");
        p.jualMobil();

        // TAMPILKAN LAGI SETELAH JUAL
        System.out.println("\n=== Setelah Jual ===");
        System.out.println("Jumlah Mobil   : " + p.getJumlahMobil());
        System.out.println("Plat Mobil     : \n" + p.getNoPlatMobil());
    }
}
