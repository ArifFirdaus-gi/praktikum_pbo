package pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BfReader {
    public static void main(String[] args) throws IOException {
        
        //DEFAULT == String
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
//        System.out.print("Masukkan Angka: ");
//        int angka = Integer.parseInt(br.readLine());
//        System.out.println(angka);
        
        System.out.print("Masukkan Pecahan: ");
        double pecahan = Double.parseDouble(br.readLine());
        System.out.println(pecahan);
        
        System.out.print("Masukkan Nama: ");
        String nama = br.readLine();
        System.out.println(nama);
        
        System.out.print("Masukkan Huruf: ");
        char huruf = br.readLine().charAt(0);
        System.out.println(huruf);
                
        System.out.print("Masukkan Status: ");
        boolean status = Boolean.parseBoolean(br.readLine());
        System.out.println(status);
        
        System.out.print("Masukkan pecahan: ");
        float pecahan2 = Float.parseFloat(br.readLine());
        System.out.println(pecahan2);
    }
}
