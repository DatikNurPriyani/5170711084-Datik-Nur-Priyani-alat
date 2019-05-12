package pbo11;
import java.util.Scanner;
public class AlatKesehatan extends Alat {

        Scanner input = new Scanner(System.in);
         String jenis(String j_kes) {
             System.out.print("Masukkan Jenis Alat : ");
             j_kes = input.next();
            return j_kes;
         }
    
         String manfaat(String man) {
             System.out.print("Manfaat : ");
             man = input.next();
            return man; 
    }
}
