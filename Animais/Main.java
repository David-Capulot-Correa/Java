import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        Cachorro dog = new Cachorro("Bobo");
        Gato cat = new Gato("Pipo");

        dog.emitirSom();
        System.out.println(dog.nome + " é um " + dog.getTipo() + "\n");

        cat.emitirSom();
        System.out.println(cat.nome + " é um " + cat.getTipo() + "\n");

        animais.add(new Cachorro("Pluto"));
        animais.add(new Cachorro("Pateta"));
        animais.add(new Cachorro("Coragem"));
        animais.add(new Gato("Tom"));
        animais.add(new Gato("Mel"));
        animais.add(new Gato("Botas"));

        for (Animal a : animais) {
            a.emitirSom();
            System.out.println("É um " + a.getTipo() + "\n");
        }

    }
}