import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();

		sayilar.add(1);
		sayilar.add(12);
		sayilar.add("ankara");
		System.out.println(sayilar.size()); //kaç index olduğunu söyler
		System.out.println(sayilar.get(2)); //indexi okur
		sayilar.set(0,100); //arraylistteki indexi değiştirmek için kulllanılır.
		sayilar.remove(0); //indexi siler
		sayilar.clear(); //tüm elemanları siler

		for(Object i : sayilar){ //hem int hem string tuttuğu için object türünde tutar ve
			System.out.println(i);
		}
    }
}
