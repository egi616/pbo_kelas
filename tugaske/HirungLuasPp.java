package tugasjv;

import java.util.Scanner;
public class HirungLuasPp {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        float panjang = input.nextFloat();

        System.out.print("Masukkan lebar: ");
        float lebar = input.nextFloat();
        
        float luas = panjang * lebar;
        System.out.println("Luas persegi panjang = " + luas);
    }
}
