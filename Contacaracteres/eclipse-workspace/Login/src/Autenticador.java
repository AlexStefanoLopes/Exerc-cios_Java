
public class Autenticador {
	
	public Usu�rio logar(String login, String senha) throws LoginException {
		if(login.equals("guerra") && senha.equals("senhaguerra"))
			return new Usu�rio();
	}
	trhow new LoginException("O usu�rio e a senha n�o batem"!, login)
		;
	
	}
	
}