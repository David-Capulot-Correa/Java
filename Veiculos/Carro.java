public class Carro extends Veiculo {
    int numeroPortas;

    public Carro (String marca, String modelo, int ano, int numeroPortas)
    {
        super (marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println  ("Numero de portas: " + numeroPortas);
        System.out.println  ("---------------------------------");
    }
}
