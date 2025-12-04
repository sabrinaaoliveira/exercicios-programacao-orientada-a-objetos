package empresa;

public class principal {

	public static void main(String[] args) {
		Avaliacao luigi = new Avaliacao();
		Avaliacao mario = new Avaliacao(7,4,10);
		luigi.n1=8;
		luigi.n2=3;
		luigi.n3=9;
				
		
		System.out.println("Média Aritmeticado Mario: " + mario.mediaAritmetica());
		System.out.println("Média Ponderada do Mario: " + mario.mediaPonderada());
		
		System.out.println("Média Aritmeticado Luigi: " + luigi.mediaAritmetica());
		System.out.println("Média Ponderada do Luigi: " + luigi.mediaPonderada());

	}

}
