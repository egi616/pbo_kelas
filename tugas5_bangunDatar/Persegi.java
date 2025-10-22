/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_bangunDatar;

/**
 *
 * @author ACER
 */
public class Persegi extends BangunDatar{
    
    float sisi,luas, keliling;
    
    public Persegi(float sisi){
        this.sisi=sisi;
    }
    
    @Override
    public void luas(){
        System.out.println("Sisi: "+sisi);
        luas = sisi * sisi;
        System.out.println("Luas pesegi panjang dengan sisi "+sisi+" adalah "+luas);
    }
    
    @Override
    public void keliling(){
        System.out.println("Sisi: "+sisi);
        keliling = 4 * sisi;
        System.out.println("Keliling pesegi panjang dengan sisi "+sisi+" adalah "+keliling);
    }
}
