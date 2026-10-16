package pertemuan3;

import java.io.*;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        
        //Menulis Sebuah Data ke dalam FILE.txt
        DataOutputStream output = new DataOutputStream(
            new FileOutputStream("mahasiswa.txt"));
        
        output.writeUTF("Indomie"); //String
        output.writeInt(5);         //Int
        
        output.close();
        
        //Membaca File.txt
        DataInputStream input = new DataInputStream(
        new FileInputStream("mahasiswa.txt"));
        
        String produk = input.readUTF();
        int jumlah = input.readInt();
        
        System.out.println("Nama Produk " + produk + " jumlah " + jumlah);
    }
            
}
