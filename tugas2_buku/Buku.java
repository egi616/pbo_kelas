/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_buku;

/**
 *
 * @author ACER
 */
public class Buku {
        String judul;
        String pengarang;
        int tahun_terbit;
    
    public Buku(){       //kalo sudah gini nanti object yang dibuat dari Mhs punya npm dan nama
        judul= null;
        pengarang=null;
        tahun_terbit=0;
    }
    
    public Buku(String judul){       //kalo sudah gini nanti object yang dibuat dari Mhs punya npm dan nama
        this.judul= judul;
        pengarang=null;
        tahun_terbit=0;
    }
    
    public Buku(String judul, String pengarang){       //kalo sudah gini nanti object yang dibuat dari Mhs punya npm dan nama
        this.judul= judul;
        this.pengarang=pengarang;
        tahun_terbit=0;
    }

    public Buku(String judul, String pengarang, int tahun_terbit){       //kalo sudah gini nanti object yang dibuat dari Mhs punya npm dan nama
        this.judul= judul;
        this.pengarang=pengarang;
        this.tahun_terbit=tahun_terbit;
    }
    
    void tampil_data(){         //parameter deklarasikan sisini tapi inisalisasi pas di panggil
        //variabel lokal harus diinisialisasi
        System.out.println("judul: "+ judul);
        System.out.println("pengarang: "+ pengarang);
        System.out.println("tahun terit: "+ tahun_terbit);
    }
    
}
