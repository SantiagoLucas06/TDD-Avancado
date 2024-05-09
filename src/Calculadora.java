public class Calculadora {

    private int adicionar(int a, int b) {
        return a + b;
    }

    private int subtrair(int a, int b) {
        return a - b;
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.testarAdicao();
        calculadora.testarSubtracao();
        calculadora.testarMultiplicacao();
        calculadora.testarDivisao();
    }

    private void testarAdicao() {
        int resultado = adicionar(5, 3);
        assert resultado == 8 : "Erro na adição";
    }

    private void testarSubtracao() {
        int resultado = subtrair(5, 3);
        assert resultado == 2 : "Erro na subtração";
    }

    private void testarMultiplicacao() {
        int resultado = multiplicar(5, 3);
        assert resultado == 15 : "Erro na multiplicação";
    }

    private void testarDivisao() {
        // Teste padrão
        int resultado = dividir(10, 2);
        assert resultado == 5 : "Erro na divisão padrão";

        // Teste de divisão por zero
        try {
            dividir(10, 0);
            assert false : "Erro: Divisão por zero não lançou exceção";
        } catch (IllegalArgumentException e) {
            // Esperado comportamento de lançamento de exceção
        }
    }
}
