import java.text.DecimalFormat;

public class EstruturaDecisao {
	public void ex1(int n1, int n2) {
		//Faça um Programa que peça dois números e imprima o maior deles.
		 String condicao;
									 		   
		 if (n1>n2) condicao = "O primeiro numero (" + n1 + ") é o maior" + ".";
		 else if (n2>n1) condicao = "O segundo numero (" + n2 + ") é o maior" + ".";
		 else condicao = "Os números são iguais.";
		 
		 String r = "L2-1) " + condicao;
		 System.out.println(r);
	}
	
	public void ex2(int n) {
		//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		 String condicao;
		 		   
		 if (n>0) condicao = "O numero " + n + " é positivo" + ".";
		 else if (n<0) condicao = "O numero " + n + " é negativo" + ".";
		 else condicao = "O numero é zero" + ".";
		 
		 String r = "L2-2) " + condicao;
		 System.out.println(r);
	}
	
	public void ex3(String g) {
		//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		 String condicao;
		 
		 if (g.toLowerCase()=="f") condicao = "F - Feminino" + ".";
		 else if (g.toLowerCase()=="m") condicao = "M - Masculino" + ".";
		 else condicao = "Opção inválida" + ".";
		 
		 String r = "L2-3) " + condicao;
		 System.out.println(r);
	}
	
	public void ex4(String l) {
		//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
		 String v = "'a','e','i','o','u'";
		 String c = "'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'";
		 String condicao;
		 
		 
		 if(v.contains("" + l.toLowerCase())) condicao = l + " é uma vogal" + ".";
		 else if(c.contains("" + l.toLowerCase())) condicao = l + " é uma consoante" + ".";
		 else condicao = l + " não é uma letra" + ".";
		 
		 String r = "L2-4) " + condicao;
		 System.out.println(r);
	}
	
	public void ex5(double b1, double b2) {
		//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar
		//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		//A mensagem "Reprovado", se a média for menor do que sete;
		//A mensagem "Aprovado com Distinção", se a média for igual a dez.
		
		 double mF = (b1+b2)/2;
		 String condicao;
													  
		 if (mF==10) condicao = "Com média " + mF + " o(a) aluno(a) foi Aprovado(a) com Distinção" + ".";
		 else if (mF>=7 && mF<=9.9) condicao = "Com média " + mF + " o(a) aluno(a) foi Aprovado(a)" + ".";
		 else condicao = "Com média " + mF + " o(a) aluno(a) foi Reprovado(a)" + ".";
													  
		 String r = "L2-5) " + condicao;
		 System.out.println(r);
    }
	
	public void ex6(int n1, int n2, int n3) {
		//Faça um Programa que leia três números e mostre o maior deles.
		 String condicao;
		 
		 if (n1 > n2 && n1 > n3) condicao = "O primeiro numero (" + n1 + ") é o maior" + ".";
		 else if (n2 > n1 && n2 > n3) condicao = "O segundo numero (" + n2 + ") é o maior" + ".";
		 else if (n3 > n1 && n3 > n2) condicao = "O terceiro numero (" + n3 + ") é o maior" + ".";
		 else condicao = "Os números são iguais.";
													  
		 String r = "L2-6) " + condicao;
		 System.out.println(r);
   }
	
	public void ex7(int n1, int n2, int n3) {
		//Faça um Programa que leia três números e mostre o maior e o menor deles.
		 String condicao = "";
		 
		 if ((n1 >= n2 && n1 > n3) || (n1 > n2 && n1 >= n3)) condicao += "O primeiro numero (" + n1 + ") é o maior";
		 else if (n2 > n1 && n2 >= n3) condicao += "O segundo numero (" + n2 + ") é o maior";
		 else if (n3 > n1 && n3 > n2) condicao += "O terceiro numero (" + n3 + ") é o maior";
		 
		 if (n1 < n2 && n1 < n3) condicao += " e o primeiro numero (" + n1 + ") é o menor" + ".";
		 else if (n2 < n1 && n2 < n3) condicao += " e o segundo numero (" + n2 + ") é o menor" + ".";
		 else if (n3 < n1 && n3 < n2) condicao += " e o terceiro numero (" + n3 + ") é o menor" + ".";
		 
		 else condicao = "Os números são iguais.";
		 
		 String r = "L2-7) " + condicao;
		 System.out.println(r);
  }
	
	public void ex8(double p1, double p2, double p3) {	
		//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
		 
		 String condicao = "";
		 
		 DecimalFormat formato = new DecimalFormat("#.00");
		 
		 if ((p1 <= p2 && p1 < p3) || (p1 < p2 && p1 <= p3)) condicao = "Compre o primeiro produto. Custa R$ " + formato.format(p1) + ".";
		 else if (p2 < p1 && p2 <= p3) condicao = "Compre o segundo produto. Custa R$ " + formato.format(p2) + ".";
		 else if (p3 > p1 && p3 > p2) condicao = "Compre o terceiro produto. Custa R$ " + formato.format(p3) + ".";
		 else condicao = "Os preços são iguais.";
		 
		 String r = "L2-8) " + condicao;
		 System.out.println(r);
 }
	public void ex9(int n1, int n2, int n3) {
		//Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
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
			
		condicao += " Sua ordem decrescente é: " + n1 + ", " + n2 + " e " + n3 + ".";
		
		String r = "L2-9) " + condicao;
		System.out.println(r);
 }
	
	public void ex10(String t) {
		//Faça um Programa que pergunte em que turno você estuda. 
		//Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
		//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
		
		String condicao;
		
		if(t.toLowerCase().equals("m")) condicao = "Bom Dia!!";
		else if(t.toLowerCase().equals("v")) condicao = "Boa Tarde!!";
		else if(t.toLowerCase().equals("n")) condicao = "Boa Noite!!";
		
		else condicao = "Valor Inválido!";
		
		String r = "L2-10) " + condicao;
		System.out.println(r);
 }
	
	public void ex11(double s) {
		//As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes, seguindo:
		//Salários até R$ 280,00: aumento de 20%.
		//Salários entre R$ 280,01 e R$ 700,00 : aumento de 15%.
		//Salários entre R$ 700,01 e R$ 1500,00 : aumento de 10%.
		//Salários de R$ 1500,01 em diante : aumento de 5%.
		//Faça um programa que receba o salário e informe na tela:
		//O salário antes do reajuste.
		//O percentual de aumento aplicado.
		//O valor do aumento.
		//O novo salário, após o aumento.
		
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
		
		condicao = "Um salário de R$ " + formato.format(s) + " receberá um aumento de " + pR + "%, no valor de R$ " + formato.format(rS) + " totalizando R$ " + formato.format(sF) + ".";
		
		String r = "L2-11) " + condicao;
		System.out.println(r);
 }
	public void ex12(int t, double v) {
		//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são o Imposto de Renda, 
		//que depende do salário bruto, o INSS que corresponde a 10% do salário bruto e o FGTS que corresponde a 11% do salário bruto, 
		//mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
		//O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
		//Desconto do IR:
		//Salário Bruto até 900 (inclusive) - isento
		//Salário Bruto até 1500 (inclusive) - desconto de 5%
		//Salário Bruto até 2500 (inclusive) - desconto de 10%
		//Salário Bruto acima de 2500 - desconto de 20%
		
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
		condicao += "Salário Liquido\t\t\t\tR$ " + formato.format(sL) + "\n";
		String r = "L2-12)\n\n" + condicao;
		System.out.println(r);
 }
	public void ex13(int d) {
		//Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
		
		String condicao;
		
		switch(d) {
		
		case 1:
			condicao = "Domingo";
			break;
			
		case 2:
			condicao = "Segunda-Feira";
			break;
					   
		case 3:
			condicao = "Terça-Feira";
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
			condicao = "Inválido";
			break;
		}
		
		String r = "L2-13) " + condicao;
		System.out.println(r);
 }
	public void ex14(double b1, double b2) {
		//Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. 
		//O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
		
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
		
		condicao = "Com notas " + b1 + " e " + b2 + ", e média " + mF + " o aluno(a) foi classificado(a) na categoria " + G + " e, portanto, está " + resultado;
		
		System.out.println("L2-14) " + condicao + ".");
	}
}
