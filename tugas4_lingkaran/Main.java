/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4_lingkaran;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
            //tugas 3 pa lalan lingkaran overload
        Lingkaran l1 = new Lingkaran();  //default
        System.out.println("Jari-jari: "+l1.jari_jari+" hasil luas: "+l1.hitungLuas());
        System.out.println();
        
        Lingkaran l2 = new Lingkaran(7.0);  //jari jari positif
        System.out.println("Jari-jari: "+l2.jari_jari+" hasil luas: "+l2.hitungLuas());
        System.out.println();
        
        Lingkaran l3 = new Lingkaran(0);  //nol jari jari nya
        System.out.println("Jari-jari: "+l3.jari_jari+" hasil luas: "+l3.hitungLuas());
        System.out.println();
        
        Lingkaran l4 = new Lingkaran(-3);  //negatif
        System.out.println("Jari-jari: "+l4.jari_jari+" hasil luas: "+l4.hitungLuas());
        System.out.println();
    }
}
