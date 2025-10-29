/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6_bangunDatarExtends;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        
        Persegi p = new Persegi();
        p.setSisi(2);
        System.out.println("Sisi: "+p.getSisi());
        System.out.println("Luas: "+p.getluas());
        System.out.println("Keliling: "+p.getkeliling());
        System.out.println();
        
        Lingkaran l = new Lingkaran();
        l.setJari(4);
        System.out.println("Jari-jari: "+l.getJari());
        System.out.println("luas: "+l.getluas());
        System.out.println("Keliling: "+l.getkeliling());
        System.out.println();
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(3);
        pp.setLebar(5);
        System.out.println("Panjang :"+pp.getPanjang());
        System.out.println("Lebar: "+pp.getLebar());
        System.out.println("Luas: "+pp.getluas());
        System.out.println("Keliling: "+pp.getkeliling());
        System.out.println();
        
        Segitiga s = new Segitiga();
        s.setAlas(6);
        s.setTinggi(2);
        System.out.println("Alas: "+s.getAlas());
        System.out.println("Tinggi: "+s.getTinggi());
        System.out.println("Luas: "+s.getluas());
        System.out.println("Keliling: "+s.getkeliling());
    }
}
