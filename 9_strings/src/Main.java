import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

     /*   System.out.println("eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4)); //istenilen elemanı bul
        System.out.println(mesaj.concat(" Yaşasın!")); //birleştirme
        System.out.println(mesaj.startsWith("B")); //başlangıç harfini sorgular
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,4, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("e")); //aramaya en sağdan başlar */

        String yeniMesaj = mesaj.replace(' ', '-'); //kelime veya karakter değiştirmek için
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2)); //2 den itibaren yazıyı yazar
        System.out.println(mesaj.substring(2,5)); ////substring 2 den 5. indexe kadar olan harfleri yazmak için kullanılır. 2 den başla 5e kadar oku anlamında kullanılır.
        // split : karakter dizisini ayırır
        for (String kelime : mesaj.split(" ")) {
            System.out.println(yeniMesaj);
        }
        System.out.println(mesaj.toLowerCase()); //harfleri küçültür
        System.out.println(mesaj.toUpperCase()); //harfleri büyütür
    }
}
