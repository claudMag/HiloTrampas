public class Hilo extends Thread{

    private int numero;
    public Hilo(int numero){
        this.numero = numero;
    }

    @Override
    public void run() {
        System.out.println("Hola soy el hilo numero "+numero);
    }
}
