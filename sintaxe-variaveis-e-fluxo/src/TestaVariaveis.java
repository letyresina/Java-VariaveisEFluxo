//Para subir no GitHub.
public class TestaVariaveis {
	
	public static void main(String[] args) {
		
		System.out.println("Seja bem vindo ao programa de testes de Idade!");
		int idade;
		idade = 18;
		
		System.out.println("A idade é " + idade);
		
		/*Alguns testes com operadores aritmético*/
		
		int novaIdade = idade + 10;
		
		System.out.println("A nova idade é " + novaIdade + ". Obrigada!");
		
		//Testando pontos flutuantes.
		
		double salario = 1250.70;
		
		System.out.println("Seu salário é ", salario);
		
		//Double tem como você armazenar números inteiros também!
		
		double valorInteiro = 30;
		
		System.out.println("O valor inteiro definido foi " + valorInteiro);
		
		/*Alguns testes com operadores aritmético*/
		
		double divisao = salario / valorInteiro;
		
		System.out.println("O valor da divisão entre os dois números é de " + divisao);
		
		double novaDivisao = 5 / 2;
		
		System.out.println(novaDivisao);
		
		double novaTentativaDivisao = 5.0 / 2;
		
		System.out.println(novaTentativaDivisao);
	}
	
}
