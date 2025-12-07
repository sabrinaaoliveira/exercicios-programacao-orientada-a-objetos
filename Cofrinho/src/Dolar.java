public class Dolar extends Moeda {//classe para conversão do dólar (cotação de 5.50)

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dólar - Valor: " + valor);
    }

    @Override
    public double converter() {
        return valor * 5.50; 
    }
}
