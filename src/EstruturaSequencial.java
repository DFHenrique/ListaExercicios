import java.text.*;

public class EstruturaSequencial {
	public void ex1() {
		//Fa�a um programa que mostre a mensagem "Alo Mundo!" na tela.
		System.out.println("L1-1) Al� Mundo!");
	}
	
	public void ex2(int n) {
		//Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem: "O n�mero informado foi [n�mero]".
		System.out.println("L1-2) O n�mero informado foi " + n + ".");
	}
	

	public void ex3(int x, int y) {
		//Fa�a um Programa que pe�a dois n�meros e imprima a soma.
		System.out.println("L1-3) Primeiro Numero � " + x + "." + " Segundo Numero � " + y + "." + " Soma dos Numeros � " + (x+y) + ".");
	}
	
	public void ex4(double b1, double b2, double b3, double b4) {
		//Fa�a um programa que imprima quatro notas bimestrais e mostre a m�dia.
		DecimalFormat formato = new DecimalFormat("#.00");
		
		System.out.println("L1-4) Nota B1 " + b1 + "." + " Nota B2 " + b2 + "." + " Nota B3 " + b3 + "." + " Nota B4 " + b4 + "." + " Media Final " + formato.format((b1+b2+b3+b4)/4) + ".");
	}
	
	public void ex5(double m) {
		//Fa�a um programa que converta metros para cent�metros.
		
		DecimalFormat formato = new DecimalFormat("#,###");
		double c = m*1000;
		
		System.out.println("L1-5) Convertendo " + m + " metros, temos " + formato.format(c) + " cent�metros.");
	}
	
	public void ex6(double r) {
		//Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double a = (3.14*(r*r));
		
		System.out.println("L1-6) A �rea de um c�rculo de raio " + formato.format(r) + " � igual a " + formato.format(a) + ".");
	}
	
	public void ex7(double l) {
		//Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double a = l*l;
		
		System.out.println("L1-7) A �rea de um quadrado de lado " + formato.format(l) + " � igual a " + formato.format(a) + " e o dobro desta �rea � " + formato.format(2*a) + ".");
	}
	
	public void ex8(double v, int t) {
		//Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
		
		DecimalFormat formato = new DecimalFormat("#,###.00");
		double s = v*t;
		
		System.out.println("L1-8) O sal�rio do referido m�s � de R$ " + formato.format(s) + ".");
	}
	
	public void ex9(double F) {
		//Fa�a um Programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		
		DecimalFormat formato = new DecimalFormat("#.0");
		double C = 5*((F-32)/9);
		
		System.out.println("L1-9) A temperatura em �C para " + formato.format(F) + " �F" + ", � " +  formato.format(C) + ".");
	}
	
	public void ex10(double C) {
		//Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e mostre a temperatura em graus Farenheit.
		
		DecimalFormat formato = new DecimalFormat("#.0");
		double F = (C*1.8)+32;
		
		System.out.println("L1-10) A temperatura em �F para " + formato.format(C) + " �C" + ", � " +  formato.format(F) + ".");
	}
	
	public void ex11(int x, int y, int z) {
	    //Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre:
		//a) O produto do dobro do primeiro com metade do segundo. 
		//b) A soma do triplo do primeiro com o terceiro. 
		//c) O terceiro elevado ao cubo.
		
		DecimalFormat formato = new DecimalFormat("#");
		double x2 = ((2*x)*(y/2)), y2 = ((3*x)+z), z2 = (z*z*z);
		
		System.out.println("L1-11)a) O produto do dobro de x com metade de y � igual a " + formato.format(x2) + ".");
		System.out.println("b) A soma do triplo de x com z � igual a " + formato.format(y2) + ".");
		System.out.println("c) Z ao cubo � igual a " + formato.format(z2) + ".");
	}
	
	public void ex12(double a) {
	    //Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal
		//usando a seguinte f�rmula: (72.7*altura) - 58
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double P = (a*72.7)-58;
		
		System.out.println("L1-12) O peso ideal para alguem com altura " + formato.format(a) + " m, � " + formato.format(P) + " kg.");
	}
	
	public void ex13(double h) {
	    //Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as f�rmulas:
		//Homens: (72.7*h) - 58 b) Mulheres: (62.1*h) - 44.7
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double PH = (h*72.7)-58, PM = (62.1*h)-44.7;
		
		System.out.println("L1-13) O peso ideal para alguem com altura " + formato.format(h) + " m, � " + formato.format(PH) + " kg para homens e " + formato.format(PM) + " kg para mulheres.");
	}
	
	public void ex14(double peso) {
	    //Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
		//Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de S�o Paulo (50 quilos) 
		//deve pagar uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um programa que leia a vari�vel peso (peso de peixes) 
		//e calcule o excesso. Gravar na vari�vel excesso a quantidade de quilos al�m do limite e na vari�vel multa o valor da 
		//multa que Jo�o dever� pagar. Imprima os dados do programa com as mensagens adequadas.
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double excesso = peso-50, multa = excesso*4.00;
		
		System.out.println("L1-14) Para um peixe de " + formato.format(peso) + " kg, o excesso de peso � de " + formato.format(excesso) + " kg e a multa a ser paga � de R$ " + formato.format(multa) + ".");
	}
	
	public void ex15(double v, int t) {
		//Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		//Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 
		//8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
		//sal�rio bruto.
		//quanto pagou ao INSS.
		//quanto pagou ao sindicato.
		//o sal�rio l�quido.
		//calcule os descontos e o sal�rio l�quido,
		
		DecimalFormat formato = new DecimalFormat("#,###.00");
		double sB = v*t; 
		double iR = sB*0.11, inss = sB*0.08, sind = sB*0.05;
		double desc = (iR+inss+sind) , sL = sB-desc; 
		
		System.out.println("L1-15) Para um salario bruto de R$ " + formato.format(sB) + ", s�o descontados:");
		System.out.println("a) R$ " + formato.format(iR) + " pelo imposto de renda.");
		System.out.println("b) R$ " + formato.format(inss) + " pelo INSS.");
		System.out.println("c) R$ " + formato.format(sind) + " pelo sindicato.");
		System.out.println("d) Totalizando um desconto de R$ " + formato.format(desc) + ".");
		System.out.println("e) Resultando em um sal�rio l�quido de R$ " + formato.format(sL) + ".");
	}
	
	public void ex16(double t) {
		//Fa�a um programa para uma loja de tintas. O programa dever� pedir o tamanho em metros quadrados da �rea a 
		//ser pintada. Considere que a cobertura da tinta � de 1 litro para cada 3 metros quadrados e que a tinta � 
		//vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usu�rio a quantidades de latas de tinta a 
		//serem compradas e o pre�o total.
		
		DecimalFormat formato = new DecimalFormat("#.00");
		double a = t*t, cb = 1*(3*a);
		int l = (int)cb/18;
		double c = (double)l*80.00;
		
		System.out.println("L1-16)a) Para uma �rea de " + formato.format(a) + "m, s�o necess�rias " + l + " latas de tinta.");
		System.out.println("b) O total gasto ser� de R$ " + formato.format(c) + ".");
	}
	
	public void ex17(double t) {
		//Fa�a um Programa para uma loja de tintas. O programa dever� pedir o tamanho em metros quadrados da �rea a ser 
		//pintada. Considere que a cobertura da tinta � de 1 litro para cada 6 metros quadrados e que a tinta � vendida em 
		//latas de 18 litros, que custam R$ 80,00 ou em gal�es de 3,6 litros, que custam R$ 25,00.
		//Informe ao usu�rio as quantidades de tinta a serem compradas e os respectivos pre�os em 3 situa��es:
		//comprar apenas latas de 18 litros;
		//comprar apenas gal�es de 3,6 litros;
		//misturar latas e gal�es, de forma que o desperd�cio de tinta seja menor. 
		//Acrescente 10% de folga e sempre arredonde os valores para cima, isto �, considere latas cheias.
		
		DecimalFormat formato = new DecimalFormat("#,###.00");
		double a = t*t, cb = 1*(6*a);
		int l = (int)cb/18;
		int gl = (int) (cb/3.6);
		double cl = (double)l*80.00; 
		double cg = (double)gl*25.00;
		
		System.out.println("L1-17)a) Para uma �rea de " + formato.format(a) + " m, s�o necess�rias " + l + " latas de tinta.");
		System.out.println("b) Para uma �rea de " + formato.format(a) + " m, s�o necess�rias " + gl + " gal�es de tinta.");
		System.out.println("c) O total gasto ser� de R$ " + formato.format(cl) + " em latas, ou ent�o, R$ " + formato.format(cg) + " em gal�es.");
	}
	
	public void ex18(double t, double v) {
		//Fa�a um programa que pe�a o tamanho de um arquivo para download (em MB) 
		//e a velocidade de um link de Internet (em Mbps), 
		//calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
			
		DecimalFormat formato = new DecimalFormat("#.0");
		int tempo = (int)t/(int)v;
			
		System.out.println("L1-18) Um arquivo de " + formato.format(t) + " mb ser� baixado em " + tempo + " minutos, sob a velocidade de " + formato.format(v) + " mb/s.");
	}
}
