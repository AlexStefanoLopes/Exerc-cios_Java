import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	public void pontosCriarTopico() {
		Usuario u= new Usuario();
		u.nome="Guerra";
		CalculadoraBonus cb=new CalculadoraBonus();
		RegistroPontos rp= new RegistroPontos()
		rp.criarUmtopico(u);
		assertEquals(u.pontos, 5);
	
	}

}
