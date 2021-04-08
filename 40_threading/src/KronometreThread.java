public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("oluşturuluyor : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("çalıştırılıyor" + threadName);

        try {
            for (int i = 1; i < 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println("kesildi : " + threadName);
        }

        System.out.println("thread bitti : " + threadName);

    }
    public  void start(){
        System.out.println("thread nesnesi oluşuyor");
        if(thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
