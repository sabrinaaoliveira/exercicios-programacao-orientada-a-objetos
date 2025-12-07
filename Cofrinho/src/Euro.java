public class Euro extends Moeda {//classe para conversão do dólar (cotação de 6.00)
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Euro - Valor: " + valor);
    }

    @Override
    public double converter() {
        return valor * 6.00; 
    }
}
