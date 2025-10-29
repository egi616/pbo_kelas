/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6_bangunDatarExtends;

/**
 *
 * @author ACER
 */
public class Segitiga extends BangunDatar {
    
    private float alas, tinggi;

    public void setAlas(float alas) {
        this.alas = alas;
        super.getluas();
        super.getkeliling();
        System.out.println(" segitiga");
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }
    
    @Override
    public float getluas(){
        return 0.5f * alas * tinggi;
    }
   
    @Override
    public float getkeliling(){
        return 3 * alas; //untuk segitiga sama sisi
    }
}
