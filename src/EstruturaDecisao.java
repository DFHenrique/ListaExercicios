import java.text.DecimalFormat;

public class EstruturaDecisao {
	public void ex1(int n1, int n2) {
		//Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		 String condicao;
									 		   
		 if (n1>n2) condicao = "O primeiro numero (" + n1 + ") � o maior" + ".";
		 else if (n2>n1) condicao = "O segundo numero (" + n2 + ") � o maior" + ".";
		 else condicao = "Os n�meros s�o iguais.";
		 
		 String r = "L2-1) " + condicao;
		 System.out.println(r);
	}
	
	public void ex2(int n) {
		//Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
		 String condicao;
		 		   
		 if (n>0) condicao = "O numero " + n + " � positivo" + ".";
		 else if (n<0) condicao = "O numero " + n + " � negativo" + ".";
		 else condicao = "O numero � zero" + ".";
		 
		 String r = "L2-2) " + condicao;
		 System.out.println(r);
	}
	
	public void ex3(String g) {
		//Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.
		 String condicao;
		 
		 if (g.toLowerCase()=="f") condicao = "F - Feminino" + ".";
		 else if (g.toLowerCase()=="m") condicao = "M - Masculino" + ".";
		 else condicao = "Op��o inv�lida" + ".";
		 
		 String r = "L2-3) " + condicao;
		 System.out.println(r);
	}
	
	public void ex4(String l) {
		//Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante.
		 String v = "'a','e','i','o','u'";
		 String c = "'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'";
		 String condicao;
		 
		 
		 if(v.contains("" + l.toLowerCase())) condicao = l + " � uma vogal" + ".";
		 else if(c.contains("" + l.toLowerCase())) condicao = l + " � uma consoante" + ".";
		 else condicao = l + " n�o � uma letra" + ".";
		 
		 String r = "L2-4) " + condicao;
		 System.out.println(r);
	}
	
	public void ex5(double b1, double b2) {
		//Fa�a um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a m�dia alcan�ada por aluno e apresentar
		//A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
		//A mensagem "Reprovado", se a m�dia for menor do que sete;
		//A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
		
		 double mF = (b1+b2)/2;
		 String condicao;
													  
		 if (mF==10) condicao = "Com m�dia " + mF + " o(a) aluno(a) foi Aprovado(a) com Distin��o" + ".";
		 else if (mF>=7 && mF<=9.9) condicao = "Com m�dia " + mF + " o(a) aluno(a) foi Aprovado(a)" + ".";
		 else condicao = "Com m�dia " + mF + " o(a) aluno(a) foi Reprovado(a)" + ".";
													  
		 String r = "L2-5) " + condicao;
		 System.out.println(r);
    }
	
	public void ex6(int n1, int n2, int n3) {
		//Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
		 String condicao;
		 
		 if (n1 > n2 && n1 > n3) condicao = "O primeiro numero (" + n1 + ") � o maior" + ".";
		 else if (n2 > n1 && n2 > n3) condicao = "O segundo numero (" + n2 + ") � o maior" + ".";
		 else if (n3 > n1 && n3 > n2) condicao = "O terceiro numero (" + n3 + ") � o maior" + ".";
		 else condicao = "Os n�meros s�o iguais.";
													  
		 String r = "L2-6) " + condicao;
		 System.out.println(r);
   }
	
	public void ex7(int n1, int n2, int n3) {
		//Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
		 String condicao = "";
		 
		 if ((n1 >= n2 && n1 > n3) || (n1 > n2 && n1 >= n3)) condicao += "O primeiro numero (" + n1 + ") � o maior";
		 else if (n2 > n1 && n2 >= n3) condicao += "O segundo numero (" + n2 + ") � o maior";
		 else if (n3 > n1 && n3 > n2) condicao += "O terceiro numero (" + n3 + ") � o maior";
		 
		 if (n1 < n2 && n1 < n3) condicao += " e o primeiro numero (" + n1 + ") � o menor" + ".";
		 else if (n2 < n1 && n2 < n3) condicao += " e o segundo numero (" + n2 + ") � o menor" + ".";
		 else if (n3 < n1 && n3 < n2) condicao += " e o terceiro numero (" + n3 + ") � o menor" + ".";
		 
		 else condicao = "Os n�meros s�o iguais.";
		 
		 String r = "L2-7) " + condicao;
		 System.out.println(r);
  }
	
	public void ex8(double p1, double p2, double p3) {	
		//Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
		 
		 String condicao = "";
		 
		 DecimalFormat formato = new DecimalFormat("#.00");
		 
		 if ((p1 <= p2 && p1 < p3) || (p1 < p2 && p1 <= p3)) condicao = "Compre o primeiro produto. Custa R$ " + formato.format(p1) + ".";
		 else if (p2 < p1 && p2 <= p3) condicao = "Compre o segundo produto. Custa R$ " + formato.format(p2) + ".";
		 else if (p3 > p1 && p3 > p2) condicao = "Compre o terceiro produto. Custa R$ " + formato.format(p3) + ".";
		 else condicao = "Os pre�os s�o iguais.";
		 
		 String r = "L2-8) " + condicao;
		 System.out.println(r);
 }
	public void ex9(int n1, int n2, int n3) {
		//Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente.
		
		String condicao = "Os numeros digitados foram: " + n1 + ", " + n2 + " e " + n3 + ".";
		
		int x;
		
		if (n3>n2) { x = n3; 
					 n3 = n2; 
					 n2 = x;
		 }
		else if (n2>n1) {
					x = n2; 
					n2 = n1; 
					n1 = x;
	     }
		else if (n3>n2) {
						x = n3; 
						n3 = n2; 
						n2 = x;
		}
			
		condicao += " Sua ordem decrescente �: " + n1 + ", " + n2 + " e " + n3 + ".";
		
		String r = "L2-9) " + condicao;
		System.out.println(r);
 }
	
	public void ex10(String t) {
		//Fa�a um Programa que pergunte em que turno voc� estuda. 
		//Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. 
		//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso.
		
		String condicao;
		
		if(t.toLowerCase().equals("m")) condicao = "Bom Dia!!";
		else if(t.toLowerCase().equals("v")) condicao = "Boa Tarde!!";
		else if(t.toLowerCase().equals("n")) condicao = "Boa Noite!!";
		
		else condicao = "Valor Inv�lido!";
		
		String r = "L2-10) " + condicao;
		System.out.println(r);
 }
	
	public void ex11(double s) {
		//As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe contraram para desenvolver o programa que calcular� os reajustes, seguindo:
		//Sal�rios at� R$ 280,00: aumento de 20%.
		//Sal�rios entre R$ 280,01 e R$ 700,00 : aumento de 15%.
		//Sal�rios entre R$ 700,01 e R$ 1500,00 : aumento de 10%.
		//Sal�rios de R$ 1500,01 em diante : aumento de 5%.
		//Fa�a um programa que receba o sal�rio e informe na tela:
		//O sal�rio antes do reajuste.
		//O percentual de aumento aplicado.
		//O valor do aumento.
		//O novo sal�rio, ap�s o aumento.
		
		DecimalFormat formato = new DecimalFormat("#.00");
		
		String condicao;
		
		int pR; 
		double rS, sF;
		
		if(s<=280.00) pR=20;
		else if(s>=280.01 && s<=700.00) pR=15;
		else if(s>=700.01 && s<=1500.00) pR=10;
		else pR=5;
		
		rS = s*((double)pR*0.1);
		sF = s + rS;
		
		condicao = "Um sal�rio de R$ " + formato.format(s) + " receber� um aumento de " + pR + "%, no valor de R$ " + formato.format(rS) + " totalizando R$ " + formato.format(sF) + ".";
		
		String r = "L2-11) " + condicao;
		System.out.println(r);
 }
	public void ex12(int t, double v) {
		//Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o o Imposto de Renda, 
		//que depende do sal�rio bruto, o INSS que corresponde a 10% do sal�rio bruto e o FGTS que corresponde a 11% do sal�rio bruto, 
		//mas n�o � descontado (� a empresa que deposita). O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos. 
		//O programa dever� pedir ao usu�rio o valor da sua hora e a quantidade de horas trabalhadas no m�s.
		//Desconto do IR:
		//Sal�rio Bruto at� 900 (inclusive) - isento
		//Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
		//Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
		//Sal�rio Bruto acima de 2500 - desconto de 20%
		
		DecimalFormat formato = new DecimalFormat("#.00");
		
		String condicao;
		
		int iR;
		double sB, sL, vIR, INSS, FGTS, Desc;
		
		sB = t*v;
		
		if(sB<=900.00) iR=0;
		else if(sB>=900.01 && sB<=1500.00) iR=5;
		else if(sB>=1500.01 && sB<=2500.00) iR=10;
		else iR=20;
		
		INSS = sB*0.10;
		FGTS = sB*0.11;
		vIR = sB*((double)iR/100);
		Desc = INSS + vIR;
		sL = sB-Desc;
		
		condicao = "Salario Bruto (" + t + " * " + formato.format(v) + ")\t\tR$ " + formato.format(sB) + "\n";
		condicao += "(-) IR (" + iR + "%)\t\t\t\tR$ " + formato.format(vIR) + "\n";
		condicao += "(-) INSS (10%)\t\t\t\tR$ " + formato.format(INSS) + "\n";
		condicao += "FGTS (11%)\t\t\t\tR$ " + formato.format(FGTS) + "\n";
		condicao += "Total de Descontos\t\t\tR$ " + formato.format(Desc) + "\n";
		condicao += "Sal�rio Liquido\t\t\t\tR$ " + formato.format(sL) + "\n";
		String r = "L2-12)\n\n" + condicao;
		System.out.println(r);
 }
	public void ex13(int d) {
		//Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inv�lido.
		
		String condicao;
		
		switch(d) {
		
		case 1:
			condicao = "Domingo";
			break;
			
		case 2:
			condicao = "Segunda-Feira";
			break;
					   
		case 3:
			condicao = "Ter�a-Feira";
			break;
					   
		case 4:
			condicao = "Quarta-Feira";
			break;
					   
		case 5:
			condicao = "Quinta-Feira";
			break;
					   
		case 6:
			condicao = "Sexta-Feira";
			break;
					   
		case 7:
			condicao = "Sabado";
			break;
				
		default:
			condicao = "Inv�lido";
			break;
		}
		
		String r = "L2-13) " + condicao;
		System.out.println(r);
 }
	public void ex14(double b1, double b2) {
		//Fa�a um programa que l� as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua m�dia. 
		//O algoritmo deve mostrar na tela as notas, a m�dia, o conceito correspondente e a mensagem �APROVADO� se o conceito for A, B ou C ou �REPROVADO� se o conceito for D ou E.
		
		String condicao, resultado = "";
		
		double mF;
		char G = 'Z';
		
		mF = (b1+b2)/2;
		
		if(mF>=0.0 && mF<=4.0) G = 'E';
		else if (mF>=4.1 && mF<=6.0) G = 'D';
		else if (mF>=6.1 && mF<=7.5) G = 'C';
		else if (mF>=7.6 && mF<=9.0) G = 'B';
		else if (mF>=9.1 && mF<=10.0) G = 'A';
		
		switch (G) {
					case 'E': resultado = "Reprovado";
					case 'D': resultado = "Reprovado";
					case 'C': resultado = "Aprovado";
					case 'B': resultado = "Aprovado";
					case 'A': resultado = "Aprovado";
				   }
		
		condicao = "Com notas " + b1 + " e " + b2 + ", e m�dia " + mF + " o aluno(a) foi classificado(a) na categoria " + G + " e, portanto, est� " + resultado;
		
		System.out.println("L2-14) " + condicao + ".");
	}
}
