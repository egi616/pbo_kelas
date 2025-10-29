/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6_bangunDatarExtends;

/**
 *
 * @author ACER
 */
public class PersegiPanjang extends BangunDatar{
    
    private float panjang, lebar;

    public void setPanjang(float panjang) {
        this.panjang = panjang;
        super.getluas();
        super.getkeliling();
        System.out.println(" persegi panjang");
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
    
    @Override
    public float getluas(){
        return panjang * lebar;
    }
    
    @Override
    public float getkeliling(){
        return 2*  (panjang + lebar);
    }
    
 
}
