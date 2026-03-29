public class Smartphone extends Dispositivo implements Ligavel, Desligavel{
    protected boolean statusSmartphone;

    Smartphone(String n, boolean s) {
      super(n);
      this.statusSmartphone = s;
    }

    @Override
    public void ligar() {
        this.statusSmartphone = true;
        System.out.println("O Smartphone " + this.nome + " foi ligado!");
    }

    @Override
    public void desligar() {
        this.statusSmartphone = false;
        System.out.println("O Smartphone " + this.nome + " foi desligado!");
    }

    @Override
    public void status() {
        super.status();

        if (statusSmartphone) {
            System.out.println(" | " + "Status: Ligado");
        }
        else {
            System.out.println(" | " + "Status: Desligado");
        }
    }
}
