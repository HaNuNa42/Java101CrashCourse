public class Main {

    public static void main(String[] args) {
        mesajVer();
        parametreliFonksiyon(5);
    }

    public static void mesajVer() { //void işi yapmasını isteğimizde yazılır. emir kipi gibi
        System.out.println("mesaj");
    }
    public static void parametreliFonksiyon(int parametre) {

        System.out.println("mesaj" + parametre);
    }
}
