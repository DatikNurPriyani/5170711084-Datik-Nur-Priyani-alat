package pbo11;
import java.util.Scanner;
public class AlatTulis extends Alat {
        
    Scanner input = new Scanner(System.in);
    String fungsi (String fungsi){
        System.out.print("Masukkan Fungsi : ");
        fungsi = input.next();
        return fungsi;
    } 
    int dimensi(int dimensi) {
        System.out.println("Masukkan Dimensi : ");
        int p, l;
        p = input.nextInt();
        l = input.nextInt();
        return dimensi;
    }       
}