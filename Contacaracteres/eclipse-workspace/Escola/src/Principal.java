
public class Principal {

	public static void main(String[] args) {
		Aluno guerra=new Aluno();
		guerra.bim1=70;
		guerra.bim1=60;
		guerra.bim1=80;
		guerra.bim1=70;
		
		System.out.println(VerificadoraNotas.mediaAluno(guerra));
		System.out.println(VerificadoraNotas.passoudeAno(guerra));
	}

}
