package UeC;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Luta {
		private	Lutador desafiado;
		private	Lutador desafiante;
		private	Integer rounds;
		private 	Boolean aprovada;
		private Integer resultadoFinalL1;
		private Integer resultadoFinalL2;
		
		public  void marcarLuta(Lutador desafiante , Lutador desafiado ) {
			setDesafiado(desafiado);
			setDesafiante(desafiante);
			if((desafiado.getCategoria() == desafiante.getCategoria()) && (desafiante.getNome() != desafiado.getNome())) {
				setAprovada(true);
				System.out.println(" ");
				System.out.println("*************************************************************************************************");
				System.out.println("Luta marcada entre "+desafiante.getNome()+" e "+desafiado.getNome()+".");
				System.out.println("*************************************************************************************************");
				System.out.println(" ");
				lutar(null, desafiante, desafiado);
			}else {
				setAprovada(false);
				desafiado = null;
				desafiante = null;
				System.out.println("ERROR!!! Os lutadores tem que ser de categorias iguais e nao podem ser iguais!");
			}
			
		}
		public void lutar(Integer rounds,Lutador 	desafiante , Lutador desafiado) {
			Integer resultadoFinalL1 = null;
			Integer resultadoFinalL2 = null;
			Integer[] resL1 = {0,0,0};
			Integer[] resL2 = {0,0,0};
			desafiante.apresentar();
			desafiante.status();
			System.out.println("---------------------------------------------------------VERSOS---------------------------------------------------------");
			desafiado.apresentar();
			desafiado.status();
			Scanner tec  = new Scanner(System.in);	
			setDesafiante(desafiante);
			setDesafiado(desafiado);
			Random gerador = new Random();
			Integer r = 3;
			Integer c = 1;
			Integer v = 0;
			setRounds(rounds);
			System.out.println(" ");
			System.out.print("Para começar a luta digite: *lutar* ");
			String s = tec.nextLine();
			if(this.aprovada == true)
							
				for(Integer contador  = 0;  contador < r ; contador++) {		
				System.out.println("===============================================");
				System.out.println("A luta vai começar!!!");
				System.out.println("Round "+c);
				resL1[v] = gerador.nextInt(30);
				resL2[v] = gerador .nextInt(30);
				System.out.println("Resultado Lutador " +desafiante.getNome()+ " | pontos: "+resL1[v]+" | round: "+c);
				System.out.println("Resultado Lutador "+desafiado.getNome()+ " | pontos: "+resL2[v]+" | round: "+c);											
				c++;
				v++;
				
			}
			resultadoFinalL1 = resL1[0] + resL1[1] + resL1[2];
			resultadoFinalL2 = resL2[0] + resL2[1]	+ resL2 [2] ;			
		if(resultadoFinalL1 > resultadoFinalL2) {
			System.out.println("**************************************************************");
			System.out.println("O lutador "+desafiante.getNome()+" ganhou a luta!!! | Com um total de  "+resultadoFinalL1+" pontos.");
			System.out.println("****************************FIM******************************");
			System.out.println("");
			desafiante.getVitorias();
			desafiado.perderLuta();
		}else if(resultadoFinalL2 > resultadoFinalL1) {
			System.out.println("**************************************************************");
			System.out.println("O lutador "+desafiado.getNome()+" ganhou a luta!!! | Com um total de "+resultadoFinalL2+" pontos.");
			System.out.println("****************************FIM******************************");
			System.out.println("");
			desafiado.ganharLuta();
			desafiante.perderLuta();
		}else if(resultadoFinalL1.equals(resultadoFinalL2)) {	
			System.out.println("**************************************************************");
			System.out.println("A luta empatou!!! | Com o "+desafiante.getNome()+" com "+resultadoFinalL1+" pontos | Eo"+desafiado.getNome()+" com "+resultadoFinalL2+" pontos.");
			System.out.println("****************************FIM******************************");
			System.out.println("");
			desafiado.empatarLuta();
			desafiante.empatarLuta();
		}
	}  
		
			
																				
		
		public Lutador getDesafiado() {
			return desafiado;
		}
		public void setDesafiado(Lutador desafiado) {
			this.desafiado = desafiado;
		}
		public Lutador getDesafiante() {
			return desafiante;
		}
		public void setDesafiante(Lutador desafiante) {
			this.desafiante = desafiante;
		}
		public Integer getRounds() {
			return rounds;
		}
		public void setRounds(Integer rounds) {
			this.rounds = rounds;
		}
		public Boolean getAprovada() {
			return aprovada;
		}
		public void setAprovada(Boolean aprovada) {
			this.aprovada = aprovada;
			
		}
		
}