/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_bangunDatar;

/**
 *
 * @author ACER
 */
public class Segitiga extends PersegiPanjang {
    
    float alas, tinggi;
    
    public Segitiga(float alas, float tinggi){
       super(0,0);
       this.alas=alas;
       this.tinggi=tinggi;
    }
    
    public Segitiga(float alas){
       super(0,0);
       this.alas=alas;
    }
    
    @Override
    public void luas(){
        System.out.println("Alas: "+alas);
        System.out.println("Tinggi: "+tinggi);
        super.luas = 0.5f * alas * tinggi;
        System.out.println("Luas segitiga dengan alas "+alas+" dan tinggi "+tinggi+" adalah "+super.luas);
    }
    
    @Override
    public void keliling(){
        System.out.println("Alas: "+alas);
        super.keliling = 3 * alas;  //rumus segitiga sama sisi
        System.out.println("Keliling segitiga dengan panjang "+alas+" adalah "+super.keliling);
    }
}
