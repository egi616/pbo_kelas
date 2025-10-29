/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6_bangunDatarExtends;

/**
 *
 * @author ACER
 */
public class Lingkaran extends BangunDatar{
    
    private float jari;
    
    private float luas(){
        return 3.14f * jari * jari;
    }
    private float keliling(){
        return 2 * 3.14f * jari;
    }

    public void setJari(float jari) {
        super.getluas();
        super.getkeliling();
        System.out.println(" lingkaran");
        this.jari = jari;
    }

    public float getJari() {
        return jari;
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
