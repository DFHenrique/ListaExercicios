public class EstruturaDecisao {
	public void ex1(int n1, int n2) {
		 String condicao;
									 		   
		 if (n1>n2) condicao = "O primeiro numero (" + n1 + ") é o maior" + ".";
		 else if (n2>n1) condicao = "O segundo numero (" + n2 + ") é o maior" + ".";
		 else condicao = "Os números são iguais.";
		 
		 String r = "L2-1) " + condicao;
		 System.out.println(r);
	}
	
	public void ex2(int n) {
		 String condicao;
		 		   
		 if (n>0) condicao = "O numero " + n + " é positivo" + ".";
		 else if (n<0) condicao = "O numero " + n + " é negativo" + ".";
		 else condicao = "O numero é zero" + ".";
		 
		 String r = "L2-2) " + condicao;
		 System.out.println(r);
	}
	
	public void ex3(String g) {
		 String condicao;
		 
		 if (g.toLowerCase()=="f") condicao = "F - Feminino" + ".";
		 else if (g.toLowerCase()=="m") condicao = "M - Masculino" + ".";
		 else condicao = "Opção inválida" + ".";
		 
		 String r = "L2-3) " + condicao;
		 System.out.println(r);
	}
	
	public void ex4(String l) {
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
		 double mF = (b1+b2)/2;
		 String condicao;
													  
		 if (mF==10) condicao = "Com média " + mF + " o(a) aluno(a) foi Aprovado(a) com Distinção" + ".";
		 else if (mF>=7 && mF<=9.9) condicao = "Com média " + mF + " o(a) aluno(a) foi Aprovado(a)" + ".";
		 else condicao = "Com média " + mF + " o(a) aluno(a) foi Reprovado(a)" + ".";
													  
		 String r = "L2-5) " + condicao;
		 System.out.println(r);
    }
	
	public void ex6(int n1, int n2, int n3) {				  
		 String condicao;
		 
		 if (n1 > n2 && n1 > n3) condicao = "O primeiro numero (" + n1 + ") é o maior" + ".";
		 else if (n2 > n1 && n2 > n3) condicao = "O segundo numero (" + n2 + ") é o maior" + ".";
		 else if (n3 > n1 && n3 > n2) condicao = "O terceiro numero (" + n3 + ") é o maior" + ".";
		 else condicao = "Os números são iguais.";
													  
		 String r = "L2-6) " + condicao;
		 System.out.println(r);
   }
	
	public void ex7(int n1, int n2, int n3) {				  
		 String condicao = "";
		 
		 if ((n1 >= n2 && n1 > n3) || (n1 > n2 && n1 >= n3)) { 
			 condicao += "O primeiro numero (" + n1 + ") é o maior";
		 }
		 else if (n2 > n1 && n2 >= n3) { 
			 condicao += "O segundo numero (" + n2 + ") é o maior";
		 }
		 else if (n3 > n1 && n3 > n2) {
			 condicao += "O terceiro numero (" + n3 + ") é o maior";
		 }
		 
		 if (n1 < n2 && n1 < n3) {
			 condicao += " e o primeiro numero (" + n1 + ") é o menor" + ".";
		 }
		 else if (n2 < n1 && n2 < n3) {
			 condicao += " e o segundo numero (" + n2 + ") é o menor" + ".";
		 }
		 else if (n3 < n1 && n3 < n2) {
			 condicao += " e o terceiro numero (" + n3 + ") é o menor" + ".";
		 }
		 
		 else {
			   condicao = "Os números são iguais.";
		 	  }
		 
		 String r = "L2-7) " + condicao;
		 System.out.println(r);
  }
	
	
	
}
