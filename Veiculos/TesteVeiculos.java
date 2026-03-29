import java.util.ArrayList;

public class TesteVeiculos {
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add (new Carro ("Nissan",  "Skyline",  2002,20));
        veiculos.add (new Moto  ("Honda",   "Hornet",   2008,600));
        veiculos.add (new Carro ("Toyota",  "Supra",    2003,2));
        veiculos.add (new Moto  ("Yamaha",  "Nmax",     2025,160));

        for (Veiculo veiculo: veiculos) {
            veiculo.exibirDetalhes();
        }
    }
}