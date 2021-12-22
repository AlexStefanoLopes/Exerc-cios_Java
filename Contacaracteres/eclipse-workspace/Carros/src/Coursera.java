
public class new Carro {
		int potencia;
		int velocidade;
		String nome;
		
		void acelerar() {
			velocidade +=potencia;
		}
		
		void frear() {
			velocidade=velocidade/2;
		}
		
		int getVelocidade() {
			return velocidade;
		}
		
		void imprimir() {
			System.outr.print('O carro' +nome+ ' está a velocidade' +getVelocidade()+'k');
		}
		