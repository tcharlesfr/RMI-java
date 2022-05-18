import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClienteRMI {

	public static void main(String[] args) throws Exception {

		Scanner ler = new Scanner(System.in);
		String objName = "rmi://localhost:1099/Calc";
		int entrada1 = 0;
		int entrada2 = 0;

        ICalculadora calc = (ICalculadora) Naming.lookup(objName);

        System.out.println("Entre com o primeiro numero: ");
        entrada1 = ler.nextInt();
        System.out.println("Entre com o segundo numero: ");
        entrada2 = ler.nextInt();

		System.out.println("O Resultado da adicao é: " + calc.adicao(entrada1,entrada2));
		System.out.println("O Resultado da subtracao é: " + calc.subtracao(entrada1,entrada2));
		System.out.println("O Resultado da divisao é: " + calc.divisao(entrada1,entrada2));
		System.out.println("O Resultado da multiplicacao é: " + calc.multiplicacao(entrada1,entrada2));

	}

}