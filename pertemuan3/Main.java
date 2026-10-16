package pertemuan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Masukan Angka: ");
//        int angka = input.nextInt();
//        System.out.println(angka);
//        
//        System.out.print("Masukkan Nilai: ");
//        double nilai = input.nextDouble();
//        System.out.println(nilai);
//        
//        
//        System.out.print("Masukan Angka 2: ");
//        long angka2 = input.nextLong();
//        System.out.println(angka2);
//        
//        System.out.print("Masukkan Pecahan: ");
//        float pecahan = input.nextFloat();
//        System.out.println(pecahan);
//        
//        System.out.print("Masukkan Huruf: ");
//        char huruf = input.next().charAt(0);
//        System.out.println(huruf);
//        
//        System.out.print("Masukkan Nama: ");
//        String kata = input.nextLine();
//        System.out.println(kata);
//        
//        System.out.print("Masukkan Status: ");
//        boolean status = input.nextBoolean();
//        System.out.println(status);


        Quiz_customer customer1 = new Quiz_customer();
        System.out.print("Masukkan Nama Produk     : ");
        customer1.nama = input.nextLine();
        
        System.out.print("Masukkan Harga Produk    : ");
        customer1.produk = input.nextInt();
        
        System.out.print("Jumlah Produk yang dibeli: ");
        customer1.jumlah = input.nextInt();
        System.out.println("");
        
        customer1.HitungTotal();
    }
 
}
