package pertemuan2;

class Segitiga {
    int tinggi;
    int luas;
    int alas;
    
    void cariAlas(){
        alas = luas * 2 / tinggi;
        
        System.out.println("Tinggi Segitiga : " + tinggi);
        System.out.println("Luas Segitiga : " + luas);
        System.out.println("Alas Segitiga : " + alas);
    }
}

    