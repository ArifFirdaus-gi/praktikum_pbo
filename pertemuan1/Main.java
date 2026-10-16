package pertemuan1;

public class Main {
    public static void main(String[] args) { 
        System.out.println("Hello World");
        
        //instasiasi (pembuatan objek)
        // Class variabel = new Class()
        Barang br1 = new Barang();
        
        br1.nama = "Spidol Snowman";
        System.out.println(br1.nama);
        
        br1.Bersuara();
    }
}