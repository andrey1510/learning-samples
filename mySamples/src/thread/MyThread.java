package thread;

public class MyThread extends Thread {
    public MyThread(String name) {
        this.setName(name);

    }
    public static void main(String[] args) {
        try {sleep(10000);} catch (Exception ex) {}
        MyThread t = new MyThread("tennis");
        t.start();
        try {sleep(5000);} catch (Exception ex) {}
        MyThread t1 = new MyThread("ping-pong");
        t1.start();
    }
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "..");
        }
        play();
    }
    private void play() {
        System.out.println(getName());
    }
}

