/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8_asosiasi;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Pemilik {
    
    private String nama, alamat;
    int jumlahMobil;
    String[] noPlatMobil = new String[5]; //asosiasi nya disini

    public Pemilik(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahMobil = jumlahMobil;
    }

    //hapus no plat mobil
    void jualMobil(){
        System.out.print("Masukan no plat mobil yang ingin dijual: ");
        String plat = In.SCANNER.nextLine();
        
        boolean ditemukan = false;
        
        for(int i = 0; i<jumlahMobil;i++){
            if(noPlatMobil[i].equalsIgnoreCase(plat)){
                ditemukan = true;
                for(int j = i; j<jumlahMobil-1;j++){
                    noPlatMobil[j] = noPlatMobil[j+1];
                }
                noPlatMobil[jumlahMobil-1]= null;
                jumlahMobil--;
                break;
            }
        }
        if(!ditemukan){
            System.out.println("Plat no mobil tidak ditemukan");
        }
    }
    //tidak bisa beli mobil lebih dari lima
    void beliMobil(){
        if(jumlahMobil >= 5){
            System.out.println("Jumlah mobil sudah max");
        }
        System.out.println("\n=== Pembelian Mobil ===");
        System.out.print("Masukan merek : ");
        String mrk = In.SCANNER.nextLine();
        System.out.print("Masukan nomor plat mobil baru: ");
        String plat = In.SCANNER.nextLine();
        System.out.print("Masukan tahun keluaran: ");
        int tk = In.SCANNER.nextInt();
        In.SCANNER.nextLine();
        noPlatMobil[jumlahMobil]=plat;
        jumlahMobil++;
        
        System.out.println("\n===Data Mobil Baru===");
            System.out.println("Merk                : "+mrk);
            System.out.println("Plat                : "+plat);
            System.out.println("Tahun keluaran      : "+tk);
    }
    
    String getNama(){
        return nama;
    }
    
    String getAlamat(){
        return alamat;
    }
    
    int getJumlahMobil(){
        return jumlahMobil;
    }
    
    String getNoPlatMobil(){
        if(jumlahMobil == 0) return "-";

        String nplm = "";
        for(int i = 0; i < jumlahMobil; i++){
            nplm += "Mobil " + (i+1) + " : " + noPlatMobil[i] + "\n";
        }
        return nplm;
    }
    
}
