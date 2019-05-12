package pbo11;
import java.util.Scanner;
public class Pbo11 {
   
    static String merk, nama, wujud, warna, fungsi, manfaat,j_kes, jenis, man;
    static int jumlah, alat, dimensi;
    static double harga;
    static Scanner input = new Scanner(System.in); 
    static AlatMandi adus = new AlatMandi();
    static AlatTulis nulis= new AlatTulis();
    static AlatKesehatan sehat = new AlatKesehatan();
    public static void main(String[] args) {
        input();
    }
    public static void input() {
        System.out.print("Masukkan Jumlah Alat : ");
        jumlah = input.nextInt();
        for (int i = 1; i < jumlah; i++) {
            System.out.println("Alat ke~ "+(i++));
            System.out.print("Jenis Alat : ");
            alat = input.nextInt();
            if (alat == 1) {
                System.out.println("Alat Mandi");
                nama = adus.nama(nama);
                merk = adus.merk(merk);
                harga = adus.hargaBeli(harga);
                wujud = adus.wujud(wujud);
                warna = adus.warna(warna);
            }
            if (alat == 2) {
                System.out.println("Alat Tulis");
                nama = nulis.nama(nama);
                merk = nulis.merk(merk);
                harga = nulis.hargaBeli(harga);
                fungsi= nulis.fungsi(fungsi);
                dimensi = nulis.dimensi(dimensi);
            }
            if (alat == 3) {
                System.out.println("AlatKesehatan");
                nama = sehat.nama(nama);
                merk = sehat.merk(merk);
                harga = sehat.hargaBeli(harga);
                j_kes = sehat.jenis(j_kes);
                man = sehat.manfaat(man);
            }
        }    
    }
}

   
