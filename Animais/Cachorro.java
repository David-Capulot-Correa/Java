public class Cachorro extends Mamifero {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: au au au");
    }

    @Override
    public String getTipo() {
        return "Cachorro";
    }
    
}
