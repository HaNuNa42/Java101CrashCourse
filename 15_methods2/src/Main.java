public class Main {

    public static void main(String[] args) {
        String mesaj = "bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0, 2); //substring 0 dan 2. indexe kadar olan harfleri yazmak için kullanılır.
        String yeniMesaj2 = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        System.out.println(sayi);
        int toplam = topla2(2, 3, 4, 5, 6, 10);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("guncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {
        //noktalar bir nevi dizi olduğunu belirtir. birden fazla parametre olacağını belirtir.
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "ankara";
    }
}
