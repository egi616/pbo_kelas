package tugasjv;

import java.util.Scanner;

public class HitungL {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float jari, keliling, luas;
        final float PI = 3.14f; // konstanta PI
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        jari = input.nextFloat();
        
        luas = PI * jari * jari;
        keliling = 2 * PI * jari;
        
        System.out.println("Luas lingkaran = " + luas);
        System.out.println("Keliling lingkaran = " + keliling);
    }
}
