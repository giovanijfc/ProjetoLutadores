package UeC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.function.Consumer;


public class MLutador {
	
	private static  List<Lutador> lutadores = new ArrayList<>();
	public static void main(String[] args) {			
		lutadores.add(new Lutador("Pretty boy", "França"  , 31 , 1.75f , 68.9f , 11 , 2 , 1));		
		lutadores.add(new Lutador("Putscript" , "Brasil" , 29 , 1.68f , 57.8f , 14 , 2 , 3));
		lutadores.add(new Lutador("Snapshadow" , "EUA" , 35 , 1.65f , 80.9f , 12 , 2 , 1));
		lutadores.add(new Lutador("Dead Code" , "Australia" , 28 , 1.93f , 81.6f , 13 , 0 , 2));
		lutadores.add(new Lutador("UFOCobol" , "Brasil" , 37 , 1.70f , 119.3f , 5 , 4 , 3));
		lutadores.add(new Lutador("Nerdaart" , "EUA" , 30 , 1.81f , 105.7f ,12 , 2 , 4));
		menuLutador();
	}
		

	public static void menuLutador() {
		Scanner tec = new Scanner(System.in);	
		for(;;) {
			System.out.print("Voce deseja ver status e informações  ou marcar luta  de algum lutador? *INFORMAÇÕES DE LUTADORES(1)* | *MARCAR LUTA (2)* ");
			Integer opc = tec.nextInt();
			if(opc.equals(1)) {
				System.out.println("=======================================================");
				StringJoiner str = new StringJoiner("\n");			
				lutadores.forEach(conta -> str.add( "N°: " + lutadores.indexOf(conta) + " - Nome: " + conta.getNome()));
				System.out.println(str.toString());
				System.out.print("\nDigite o número do lutador que você quer se informar: ");
				Lutador lutaSelecionado = lutadores.get(tec.nextInt());	
					lutaSelecionado.apresentar();
					lutaSelecionado.status();
					System.out.println(" ");
			}else if(opc.equals(2)){
				StringJoiner str = new StringJoiner("\n");	
				lutadores.forEach(conta -> str.add( "N°: " + lutadores.indexOf(conta) + " - Nome: " + conta.getNome()));
				System.out.println(str.toString());
				System.out.print("\nDigite o numero de lutadores que vocês querem que lutem: ");
				System.out.print("Desafiante: ");
				Lutador desafiante = lutadores.get(tec.nextInt());	
				System.out.print("Desafiado: ");
				Lutador desafiado = lutadores.get(tec.nextInt());
				Luta luta1 = new Luta();
				luta1.marcarLuta(desafiante, desafiado);
				
			}
		}
	}
}


		


