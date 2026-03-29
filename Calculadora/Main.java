public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Calculavel somar = new Soma();
        Calculavel multiplicar = new Multiplicacao();

        double resultadoSoma = calc.executarOperacao(somar, 4, 5);
        double resultadoMulti = calc.executarOperacao(multiplicar, 3, 2);

        System.out.println("A soma é: " + resultadoSoma);
        System.out.println("A multiplicação é: " + resultadoMulti);
    }
}