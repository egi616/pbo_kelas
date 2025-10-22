/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_bangunDatar;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Persegi pl = new Persegi(4);
        Persegi pk = new Persegi(2);
        Lingkaran ll = new Lingkaran(4);
        Lingkaran lk = new Lingkaran(2);
        PersegiPanjang ppl = new PersegiPanjang(5, 5);
        PersegiPanjang ppk = new PersegiPanjang(5, 5);
        Segitiga sl = new Segitiga(6, 4);
        Segitiga sk = new Segitiga(6);
        
        System.out.println("Persegi");
        pl.luas();
        pk.keliling();
        System.out.println();
        
        System.out.println("Lingkaran");
        ll.luas();
        lk.keliling();
        System.out.println();
       
        System.out.println("Persegi panjang");
        ppl.luas();
        ppk.keliling();
        System.out.println();
        
        System.out.println("Segitiga");
        sl.luas();
        sk.keliling();
        
    }
}
