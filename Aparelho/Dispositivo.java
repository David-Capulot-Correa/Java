public class Dispositivo {
    protected String nome;

    Dispositivo(String n) {
        this.nome = n;
    }

    void status() {
        System.out.print("Dispositivo: " + this.nome);
    }
}
