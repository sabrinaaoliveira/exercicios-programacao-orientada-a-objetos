import java.util.ArrayList;

public class Cofrinho {

    ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda m) {
        listaMoedas.add(m);
    }

    public void remover(Moeda m) {
        listaMoedas.remove(m);
    }

    public void listarMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("Cofrinho vazio!");//caso cofrinho esteja vazio
            return;
        }

        for (Moeda m : listaMoedas) {
            m.info();
        }
    }

    public double totalConvertido() {
        double total = 0;
        for (Moeda m : listaMoedas) {
            total += m.converter();
        }
        return total;
    }
}
