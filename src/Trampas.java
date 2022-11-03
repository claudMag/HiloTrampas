public class Trampas {
    public static void main(String[] args) {

       /*Escribe una clase llamada Trampas que cree tres hilos y fuerce que la escritura del
    segundo sea siempre anterior a la escritura por pantalla de los otros dos y la del tercero sea
    anterior a la del primero. Ejemplo de ejecución:
    Hola, soy el thread número 2
    Hola, soy el thread número 3
    Hola, soy el thread número 1*/

        Hilo hilo1 = new Hilo(1);
        Hilo hilo2 = new Hilo(2);
        Hilo hilo3 = new Hilo(3);

        //ha fatto 3 try e catch diversi
        try {
            hilo2.start();
            hilo2.join();
            hilo3.start();
            hilo3.join();
            hilo1.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}