public abstract class Moeda {//classe para conversão das moedas (menos o real)

    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void info();
    public abstract double converter();
}
