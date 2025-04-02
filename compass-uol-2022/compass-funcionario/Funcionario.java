import java.util.Scanner;

public class Funcionario{
	public static void main (String [] args){
		int funcionarios;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o numero de funcionarios que deseja cadastrar: ");
		funcionarios = entrada.nextInt();
		
		String[] nomes = new String[funcionarios];
		double[] salarios = new double[funcionarios];
		double bonus = 0;
		
		for (int contador = 0; contador < funcionarios; contador++){
			
			System.out.println("Insira o nome do funcionario: ");
			nomes[contador] = entrada.next();
			
			System.out.println("Insira o valor do salario: ");
			salarios[contador] = entrada.nextDouble();
					
		}	
			
		entrada.close();
	
		for (int contador = 0; contador < funcionarios; contador++){
			if (salarios[contador] == 1000)
				bonus = salarios[contador]*0.20;
				
			 else if (salarios[contador] >= 1000 && salarios[contador] < 2000) 
				bonus = salarios[contador]*0.10;
				
			 else if (salarios[contador] >= 2000)
				//bonus -= salarios[contador]*0.10; 
				bonus = -salarios[contador]*0.10; 
                
			System.out.println("Funcionario: " + nomes[contador]);
			System.out.println("Salario: " + salarios[contador]);
			System.out.println("Bonus/Desconto: " + bonus);	
			System.out.println("Salario liquido: " + (salarios[contador] + bonus));
} 
}
}

