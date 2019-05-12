package pbo11;
import java.util.Scanner;
public class AlatMandi extends Alat{
        
    Scanner input = new Scanner(System.in);
    public String wujud(String warna){
        System.out.print("Masukkan Warna : ");
        warna = input.next();
        return warna;
    }

    public String warna(String wujud) {
        System.out.println("Masukkan wujud");
        wujud = input.next();
        return wujud;
    }
}