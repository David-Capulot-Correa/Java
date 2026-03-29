public class Gato extends Mamifero {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: prrr- miau,miau!");
    }

    @Override
    public String getTipo() {
        return "Gato";
    }
}

