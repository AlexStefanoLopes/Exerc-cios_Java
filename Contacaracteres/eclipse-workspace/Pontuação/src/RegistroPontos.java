
public class RegistroPontos {

	private CalculadoraBonus bonus;
	
	public RegistroPontos(CalculadoraBonus) {
		bonus=cb;
	}
		
	public void fazerUmComentario(Usu�rio u) {
		u.pontos +=3* bonus.bonus(u); 
	}
	
	public void criarUmTopico(Usuario u){
		u.pontos +=5;*bonus.bonus(u); 
	}
		
	public void darUmLike(Usu�rio u) {
		u.pontos +=1*bonus.bonus(u); 
	}
	
}