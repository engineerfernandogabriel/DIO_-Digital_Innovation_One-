import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {

			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = scan.nextInt();
	
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = scan.nextInt();
			
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		} catch (InputMismatchException e) {
            System.out.println("Parametro inválido, informe somente números inteiros.");
        }
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois )
		throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro");
		
		int contagem = parametroDois - parametroUm;

		for(int i = 1; i <= contagem; i++) {
			System.out.printf("Imprimindo o número %d\n", i);
		}
	}
}