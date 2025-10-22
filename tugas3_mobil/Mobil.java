/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3_mobil;

/**
 *
 * @author ACER
 */
public class Mobil {

    String merk;
    String model;
    int tahun;
    
    public Mobil(String merk, String model) {
        this.merk=merk;
        this.model=model;
        this.tahun=2077;
        System.out.println("Objek dengan merk "+merk+" dan model "+model+" keluaran "+tahun+ " berhasil dibuat");
        
    }
    
        public Mobil(String merk, String model,int tahun) {
        this.merk=merk;
        this.model=model;
        this.tahun=tahun;
        System.out.println("Objek dengan merk "+merk+" dan model "+model+" keluaran "+tahun+ " berhasil dibuat");
        
    }
    
}
