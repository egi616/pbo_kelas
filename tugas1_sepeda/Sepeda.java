/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1_sepeda;

/**
 *
 * @author ACER
 */
public class Sepeda {
    
    String merk;
    int jarak_tempuh;
    
    
    public Sepeda(String merk){         //construktor
        this.merk=merk;
        this.jarak_tempuh=0;
        System.out.println("-Object " + merk +" dibuat,jarak tempuh awal "+ jarak_tempuh +" km" );
    }
    
    void bergerak_maju(){
        jarak_tempuh += 10;
        System.out.println("-Bergerak maju 10 km");
        System.out.println("-Object sepeda " + merk +"jarak tempuh "+ jarak_tempuh +" km");
    }
    
    void bergerak_mundur(){
        jarak_tempuh -= 5;
        System.out.println("-Bergerak mundur 5 km");
        System.out.println("-Object sepeda " + merk +"jarak tempuh "+ jarak_tempuh +" km");
    }
    
    void berhenti(){
        System.out.println("-Sepeda berhenti");
        System.out.println("-Object sepeda " + merk +"jarak tempuh akhir "+ jarak_tempuh +" km");
    }
}
