package pertemuan3;

public class Quiz_customer {
    String nama;
    int jumlah, produk;
    
    void HitungTotal(){
        int total = jumlah * produk;
        
        System.out.println("Hasil Pesanan: ");
        System.out.println("Nama Produk  : " + nama);
        System.out.println("Harga Produk : " + produk);
        System.out.println("Jumlah       : " + jumlah);
        System.out.println("Total Harga  : " + total);
                
    }
    
}
