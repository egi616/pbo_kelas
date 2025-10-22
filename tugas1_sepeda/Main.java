/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_sepeda;

import java.util.Scanner; 
/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
      
        int pilihan;
        
        System.out.print("Masukkan Object Merk Sepeda: ");
        String merk = input.nextLine();
        
        Sepeda spd = new Sepeda(merk);
        
        do{
            System.out.println("Menu:");
            System.out.println("Bergerak maju(1)");
            System.out.println("Bergerak mundur(2)");
            System.out.println("Berhenti(3)");
            System.out.println("Exit(0)");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    spd.bergerak_maju();
                    break;
                case 2:
                    spd.bergerak_mundur();
                    break;
                case 3:
                    spd.berhenti();
                    break;
                case 0:
                    System.out.println("-Keluar program");
                    System.out.println("-Terima kasih sudah meggunakan program ini");
                    break;
                default:
                    System.out.println("Pilihan invalid");
                    break;
            }
        }while(pilihan != 0);
    }
    
}
