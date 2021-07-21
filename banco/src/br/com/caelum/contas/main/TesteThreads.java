package br.com.caelum.contas.main;

public class TesteThreads implements Runnable {
    private int id;
    public static void main(String[] args) {

        TesteThreads p1 = new TesteThreads();
        p1.setId(1);

        Thread t1 = new Thread(p1);
        t1.start();

        TesteThreads p2 = new TesteThreads();
        p2.setId(2);

        Thread t2 = new Thread(p2);
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Programa " + id + " valor: " + i);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
