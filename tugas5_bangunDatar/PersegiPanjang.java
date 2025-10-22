/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_bangunDatar;

/**
 *
 * @author ACER
 */
public class PersegiPanjang extends Lingkaran{
    
    float panjang, lebar;
    
    public PersegiPanjang(float panjang, float lebar){
        super(0);
        this.panjang= panjang;
        this.lebar=lebar;
    }
    
    @Override
    public void luas(){
        System.out.println("Panjang: "+panjang);
        System.out.println("Lebar: "+lebar);
        super.luas = panjang * lebar;
        System.out.println("Luas persegi panjnag dengan panjang "+panjang+" dan lebar "+lebar+" adalah "+super.luas);
    }
    
    @Override
    public void keliling(){
        System.out.println("Panjang: "+panjang);
        System.out.println("Lebar: "+lebar);
        super.keliling =2 * (panjang + lebar);
        System.out.println("Keliling persegi panjnag dengan panjang "+panjang+" dan lebar "+lebar+" adalah "+super.keliling);
    }
}
