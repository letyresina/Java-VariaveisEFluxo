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
		
		double novaDivisao = 5 / 2; /*quando ee retorna, retorna um número inteiro por não haver
		um flutuante (double). Por isso, o retorno é 2! */
		
		System.out.println(novaDivisao);
		
		double novaTentativaDivisao = 5.0 / 2; /*Aqui nesse caso, é diferente. Ele retorna em 
		flutuante (double) por haver o .0 depois do 5, portanto retorna 2.5*/
		
		System.out.println(novaTentativaDivisao);
		
		//Testando Conversões.
		
		int valor = (int) salario; //Aqui, converti para int o valor em double, declarado lá em cima.
		
		System.out.println("Retornando o valor de salário somente em inteiro " + valor);
		
		//Outras variáveis númericas no Java.
		
		long numeroGrande = 3232333233445l; //para declarar numeros MUITO grandes depois de 200000.
		
		System.out.println(numeroGrande);
		
		short numeroPequeno = 2131; //números MUITOS pequenos
		
		System.out.println(numeroPequeno);
		
		byte numeroByte = 127; 
		
		System.out.println(numeroByte);
		
		//AVISO: normalmente, salários não são utilizados em flutuante (double).
		
	}
	
}
