public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("iPhone 16",false);

        System.out.println();
        iphone.ligar();
        iphone.status();

        System.out.println();
        iphone.desligar();
        iphone.status();
    }
}