import java.text.*;

public class EstruturaSequencial {
	public void ex1() {
		//Faça um programa que mostre a mensagem "Alo Mundo!" na tela.
		System.out.println("L1-1) Alô Mundo!");
	}
	
	public void ex2(int n) {
		//Faça um programa que peça um número e então mostre a mensagem: "O número informado foi [número]".
		System.out.println("L1-2) O número informado foi " + n + ".");
	}
	

	public void ex3(int x, int y) {
		//Faça um Programa que peça dois números e imprima a soma.
		System.out.println("L1-3) Primeiro Numero é " + x + "." + " Segundo Numero é " + y + "." + " Soma dos Numeros é " + (x+y) + ".");
	}
	
	public void ex4(double b1, double b2, double b3, double b4) {
		//Faça um programa que imprima quatro notas bimestrais e mostre a média.
		DecimalFormat formato = new DecimalFormat("#.00");
		
		System.out.println("L1-4) Nota B1 " + b1 + "." + " Nota B2 " + b2 + "." + " Nota B3 " + b3 + "." + " Nota B4 " + b4 + "." + " Media Final " + formato.format((b1+b2+b3+b4)/4) + ".");
	}
	
	public void ex5(double m) {
		//Faça um programa que converta metros para centímetros.
		
		DecimalFormat formato = new DecimalFormat("#,###");
		double c = m*1000;
		
		System.out.println("L1-5) Convertendo " + m + " metros, temos " + formato.format(c) + " centímetros.");
	}
	
	public void ex6(double r) {
		//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double a = (3.14*(r*r));
		
		System.out.println("L1-6) A área de um círculo de raio " + formato.format(r) + " é igual a " + formato.format(a) + ".");
	}
	
	public void ex7(double l) {
		//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double a = l*l;
		
		System.out.println("L1-7) A área de um quadrado de lado " + formato.format(l) + " é igual a " + formato.format(a) + " e o dobro desta área é " + formato.format(2*a) + ".");
	}
	
	public void ex8(double v, int t) {
		//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		
		DecimalFormat formato = new DecimalFormat("#,###.00");
		double s = v*t;
		
		System.out.println("L1-8) O salário do referido mês é de R$ " + formato.format(s) + ".");
	}
	
	public void ex9(double F) {
		//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		
		DecimalFormat formato = new DecimalFormat("#.0");
		double C = 5*((F-32)/9);
		
		System.out.println("L1-9) A temperatura em ºC para " + formato.format(F) + " ºF" + ", é " +  formato.format(C) + ".");
	}
	
	public void ex10(double C) {
		//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre a temperatura em graus Farenheit.
		
		DecimalFormat formato = new DecimalFormat("#.0");
		double F = (C*1.8)+32;
		
		System.out.println("L1-10) A temperatura em ºF para " + formato.format(C) + " ºC" + ", é " +  formato.format(F) + ".");
	}
	
	public void ex11(int x, int y, int z) {
	    //Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
		//a) O produto do dobro do primeiro com metade do segundo. 
		//b) A soma do triplo do primeiro com o terceiro. 
		//c) O terceiro elevado ao cubo.
		
		DecimalFormat formato = new DecimalFormat("#");
		double x2 = ((2*x)*(y/2)), y2 = ((3*x)+z), z2 = (z*z*z);
		
		System.out.println("L1-11)a) O produto do dobro de x com metade de y é igual a " + formato.format(x2) + ".");
		System.out.println("b) A soma do triplo de x com z é igual a " + formato.format(y2) + ".");
		System.out.println("c) Z ao cubo é igual a " + formato.format(z2) + ".");
	}
	
	public void ex12(double a) {
	    //Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal
		//usando a seguinte fórmula: (72.7*altura) - 58
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double P = (a*72.7)-58;
		
		System.out.println("L1-12) O peso ideal para alguem com altura " + formato.format(a) + " m, é " + formato.format(P) + " kg.");
	}
	
	public void ex13(double h) {
	    //Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as fórmulas:
		//Homens: (72.7*h) - 58 b) Mulheres: (62.1*h) - 44.7
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double PH = (h*72.7)-58, PM = (62.1*h)-44.7;
		
		System.out.println("L1-13) O peso ideal para alguem com altura " + formato.format(h) + " m, é " + formato.format(PH) + " kg para homens e " + formato.format(PM) + " kg para mulheres.");
	}
	
	public void ex14(double peso) {
	    //João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
		//Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
		//deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) 
		//e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da 
		//multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double excesso = peso-50, multa = excesso*4.00;
		
		System.out.println("L1-14) Para um peixe de " + formato.format(peso) + " kg, o excesso de peso é de " + formato.format(excesso) + " kg e a multa a ser paga é de R$ " + formato.format(multa) + ".");
	}
	
	public void ex15(double v, int t) {
		//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		//Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
		//8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
		//salário bruto.
		//quanto pagou ao INSS.
		//quanto pagou ao sindicato.
		//o salário líquido.
		//calcule os descontos e o salário líquido,
		
		DecimalFormat formato = new DecimalFormat("#,###.00");
		double sB = v*t; 
		double iR = sB*0.11, inss = sB*0.08, sind = sB*0.05;
		double desc = (iR+inss+sind) , sL = sB-desc; 
		
		System.out.println("L1-15) Para um salario bruto de R$ " + formato.format(sB) + ", são descontados:");
		System.out.println("a) R$ " + formato.format(iR) + " pelo imposto de renda.");
		System.out.println("b) R$ " + formato.format(inss) + " pelo INSS.");
		System.out.println("c) R$ " + formato.format(sind) + " pelo sindicato.");
		System.out.println("d) Totalizando um desconto de R$ " + formato.format(desc) + ".");
		System.out.println("e) Resultando em um salário líquido de R$ " + formato.format(sL) + ".");
	}
	
	public void ex16(double t) {
		//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a 
		//ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é 
		//vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a 
		//serem compradas e o preço total.
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double a = t*t, cb = 1*(3*a);
		int l = (int)cb/18;
		double c = (double)l*80.00;
		
		System.out.println("L1-16)a) Para uma área de " + formato.format(a) + "m, são necessárias " + l + " latas de tinta.");
		System.out.println("b) O total gasto será de R$ " + formato.format(c) + ".");
	}
	
	public void ex17(double t) {
		//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser 
		//pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em 
		//latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
		//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
		//comprar apenas latas de 18 litros;
		//comprar apenas galões de 3,6 litros;
		//misturar latas e galões, de forma que o desperdício de tinta seja menor. 
		//Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
		
		DecimalFormat formato = new DecimalFormat("#,###.00");
		double a = t*t, cb = 1*(6*a);
		int l = (int)cb/18;
		int gl = (int) (cb/3.6);
		double cl = (double)l*80.00; 
		double cg = (double)gl*25.00;
		
		System.out.println("L1-17)a) Para uma área de " + formato.format(a) + " m, são necessárias " + l + " latas de tinta.");
		System.out.println("b) Para uma área de " + formato.format(a) + " m, são necessárias " + gl + " galões de tinta.");
		System.out.println("c) O total gasto será de R$ " + formato.format(cl) + " em latas, ou então, R$ " + formato.format(cg) + " em galões.");
	}
	
	public void ex18(double t, double v) {
		//Faça um programa que peça o tamanho de um arquivo para download (em MB) 
		//e a velocidade de um link de Internet (em Mbps), 
		//calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
			
		DecimalFormat formato = new DecimalFormat("#.0");
		int tempo = (int)t/(int)v;
			
		System.out.println("L1-18) Um arquivo de " + formato.format(t) + " mb será baixado em " + tempo + " minutos, sob a velocidade de " + formato.format(v) + " mb/s.");
	}
}
