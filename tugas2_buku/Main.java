/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_buku;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
                //tidak tahu apapun
        Buku b1 = new Buku();
        b1.tampil_data();
        System.out.println();
        
        //hanya tau judul
        Buku b2 = new Buku("The song of ice and fire");
        b2.tampil_data();
        System.out.println();
        
        //tau judul dan pengarang
        Buku b3 = new Buku("Misery","Stephen King");
        b3.tampil_data();
        System.out.println();
        
        //tau semua
        Buku b4 = new Buku("Bumi","Tere liye",2011);
        b4.tampil_data();
    }
}
