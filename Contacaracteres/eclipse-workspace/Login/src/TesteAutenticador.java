import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAutenticador {

	@Test
	public void loginComSucesso(){
		Autenticador a= new Autenticador();
		Usu�rio u=a.logar("guerra", "senhadoguerra");
		assertEquals("guerra", u.getlogin());
	}

}
