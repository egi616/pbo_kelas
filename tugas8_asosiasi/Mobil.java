/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8_asosiasi;

/**
 *
 * @author ACER
 */
public class Mobil {
    private String merek, noPlat;
    private long tahunKeluaran;

    public Mobil(String merek, String noPlat, long tahunKeluaran){
        this.merek = merek;
        this.noPlat = noPlat;
        this.tahunKeluaran = tahunKeluaran;
    }
    
    String getMerek(){
        return merek;
    }
    
    String getnoPlat(){
        return noPlat;
    }
    
    long gettahunKeluaran(){
        return tahunKeluaran;
    }
}
