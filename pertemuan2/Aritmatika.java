package pertemuan2;

public class Aritmatika {
    public static void main(String[] args) {

        //deklarasi variabel
        int ang1 = 7;
        String kalimat = "Thank you";
        System.out.println(kalimat.charAt(0));

        
        char[] arr = "haloo".toCharArray();
        
        long ang2 = 10000000;
        double ang3 = 10.5; // 3.33333
        float ang4 = 90.5f; // 3.33
        
        String itos = String.valueOf(ang1);
        int stoi = Integer.parseInt(itos);
        System.out.println("Kalkulasi " + (ang3+ang1));
        char chr1 = 'm';
        
        
        //char menerima angka sebagai kode asci
        char chr2 = 32;

//        System.out.println("Char 1: " + chr1);
//        System.out.println("Char 2: " + chr2);

        boolean bool1 = true;
        
        //OPERATOR: yang melakukan operasi
        //OPERAND: yang dioperasikan
        
        //Aritmatika + - * / %
        int a = 3, b = 8;
        
        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A * B = " + (a * b));
        System.out.println("A / B = " + (a / b));
        
        //Penugasan += -= *= /= %=
        int z = 10;
            z += 2;
            System.out.println("z = " + z);
            
        int x = 0;
        ++x;
        System.out.println(x);
        
        //perbanding < > <= >= == != 
        
        
//        Logika && || ! ^
            boolean o =true;
            boolean p = false;
            
            System.out.println("&& " + (o && p));
            System.out.println("|| " + (o || p));
            System.out.println("^" + (o ^ p));
    }
}