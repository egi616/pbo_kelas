/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas7_bangunDatarInterface;

import java.util.Scanner;


/**
 *
 * @author ACER
 */

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        Persegi p = new Persegi();
        System.out.print("Masukan sisi: ");
        float si = in.nextFloat();
        p.setSisi(si);
        System.out.println("Luas persegi : "+p.getluas());
        System.out.println("Keliling persegi : "+p.getkeliling()); 
        System.out.println();
        
        Lingkaran l = new Lingkaran();
        System.out.print("Masukan jari-jari : ");
        float j = in.nextFloat();
        l.setJari(j);
        System.out.println("Luas Lingkaran : "+l.getluas());
        System.out.println("Keliling Lingkaran : "+l.getkeliling());
        System.out.println();
        
        PersegiPanjang pp = new PersegiPanjang();
        System.out.print("Masukan panjang : ");
        float pa = in.nextFloat();
        System.out.print("Masukan lebar : ");
        float le = in.nextFloat();
        pp.setPanjang(pa);
        pp.setLebar(le);
        System.out.println("Luas persegi panjang : "+pp.getluas());
        System.out.println("Keliling persegi panjang : "+pp.getkeliling());
        System.out.println();

        Segitiga s = new Segitiga();
        System.out.print("Masukan alas : ");
        float a =in.nextFloat();
        System.out.print("Masukan tinggi : ");
        float t =in.nextFloat();
        s.setAlas(a);
        s.setTinggi(t);
        System.out.println("Luas segitiga : "+s.getluas());
        System.out.println("Keliling segitiga : "+s.getkeliling());    
    }
}

public interface BangunDatar {
    float luas();
    float keliling();
}

class Persegi implements BangunDatar{
    
    private float sisi;

    @Override
    public float luas() {
        return sisi * sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }
    
    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }
    
    public float getluas(){
        return luas();
    }
    
    public float getkeliling(){
        return keliling();
    }
}

class Lingkaran implements BangunDatar{

    private float jari;
    
    @Override
    public float luas() {
        return 3.14f * jari * jari;
    }

    @Override
    public float keliling() {
        return 2 * 3.14f * jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }
    
    public float getluas(){
        return luas();
    }
    
    public float getkeliling(){
        return keliling();
    }   
}

class PersegiPanjang implements BangunDatar{

    private float panjang, lebar;
    
    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 *  (panjang + lebar);
    }
    
    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }
    
    public float getluas(){
        return luas();
    }
    
    public float getkeliling(){
        return keliling();
    }

   
}

class Segitiga implements BangunDatar{

     private float alas, tinggi;
    
    @Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    public float keliling() {
        return 3 * alas; //untuk segitiga sama sisi
    }
    
    public void setAlas(float alas) {
        this.alas = alas;
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
    
    public float getluas(){
        return luas();
    }
   
    public float getkeliling(){
        return keliling();
    }
    
}