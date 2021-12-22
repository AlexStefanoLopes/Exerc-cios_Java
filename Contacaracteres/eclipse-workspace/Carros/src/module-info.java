module Carros {
}
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
	
	void imprimitr() {
		System.outr.print('O carro' +nome+ ' está a velodaide' +getVelocidade()+'k');
	}