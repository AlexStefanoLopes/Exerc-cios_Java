
public class Autenticador {
	
	public Usuário logar(String login, String senha) throws LoginException {
		if(login.equals("guerra") && senha.equals("senhaguerra"))
			return new Usuário();
	}
	trhow new LoginException("O usuário e a senha não batem"!, login)
		;
	
	}
	
}