/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_bangunDatar;

/**
 *
 * @author ACER
 */
public class Lingkaran extends Persegi{
    
    float r;
    
    public Lingkaran(float r){
        super(0); //tidak dipakai
        this.r=r;
    }
    
    @Override
    public void luas(){
        System.out.println("Jari-jari(r): "+r);
        super.luas = 3.14f * r * r ;
        System.out.println("Luas lingkaran dengan jari jari "+r+" adalah "+super.luas);
    }
    
    @Override
    public void keliling(){
        System.out.println("Jari-jari(r): "+r);
        super.keliling = 2 * 3.14f * r;
        System.out.println("Keliling lingkaran jari-jari "+r+" adalah "+super.keliling);
    }

}
