
public class Somador {

	String nome;
	ins valorInstancia=0;
	static int valorEstatica=0;
	
	void somar() {
		valorInstancia++;
		valorEstatica++;
	}
	
	void imprimir() {
		System.out.println("O Somador "+nome+": instancia"
				="+valorInstancia+" e estatica="+valorEstatica);
	}
	
}

