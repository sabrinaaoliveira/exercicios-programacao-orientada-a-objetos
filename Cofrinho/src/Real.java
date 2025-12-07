public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Real - Valor: " + valor);
    }

    @Override
    public double converter() {
        return valor; 
    }
}
