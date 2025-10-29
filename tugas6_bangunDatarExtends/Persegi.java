/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6_bangunDatarExtends;

/**
 *
 * @author ACER
 */
public class Persegi extends BangunDatar{
    
    private float sisi;

    
    private float luas(){
        return sisi * sisi;
    }
    
    private float keliling(){
        return 4 * sisi;
    }

    public void setSisi(float sisi) {
        super.getluas();
        super.getkeliling();
        System.out.println(" persegi");
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    @Override
    public float getluas(){
        return luas();
    }
    
    @Override
    public float getkeliling(){
        return keliling();
    }
    
    
}
