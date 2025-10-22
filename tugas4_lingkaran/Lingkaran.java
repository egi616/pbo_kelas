/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4_lingkaran;

/**
 *
 * @author ACER
 */
public class Lingkaran {
    double phi, jari_jari;
  
    public Lingkaran(){     //construk untuk nilai def
        this.phi=3.14;
        this.jari_jari=1.0;
    }
    
    public Lingkaran(double jari_jari){
        this.phi=3.14;
        if(jari_jari <=0){
            System.out.println("nilai jari_jari <= 0 diberikan nilai def: 1.0");
            this.jari_jari=1.0;
        }else{
            this.jari_jari=jari_jari;
        }
    }
    
    double hitungLuas(){
        return phi * jari_jari * jari_jari;
    }
}

