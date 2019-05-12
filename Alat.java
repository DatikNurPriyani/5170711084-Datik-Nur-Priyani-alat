package pbo11;
import java.util.Scanner;
public class Alat {
    Scanner input = new Scanner(System.in);
    public String nama(String nm){
        System.out.println("Nama Alat = ");
        nm = input.next();
        return nm;
    }
       
    public String merk(String mrk){
        System.out.println("Merk = ");
        mrk = input.next();
        return mrk;
    }
    
     public double hargaBeli(double harga){
         System.out.println("Harga = ");
         harga = input.nextDouble();
        return harga;
    }
}
