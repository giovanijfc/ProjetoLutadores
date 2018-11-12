package UeC;

import java.util.Scanner;

public class Lutador {
	
	public enum Categoria{
		PESO_PENA("Leve") , PESO_MEDIO("Médio") , PESO_PESADO("Pesado"),PESO_INVALIDO("Inválido");
		String descricao;	
		
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		Categoria(String descricao){
			this.descricao = descricao;
			
		}
	}
	
		private String nome;
		private String nacionalidade;
		private Integer idade;
		private float altura;
		private float peso;
		private Categoria categoria;
		private Integer vitorias;
		private Integer derrotas;
		private Integer empates;
		public Lutador(String nome, String nacionalidade , Integer idade , float altura , float peso , Integer vitorias, Integer derrotas , Integer empates) {
			setNome (nome);
			setNacio(nacionalidade);
			setIdade(idade);
			setAltura(altura);
			setPeso(peso);
			setVitorias(vitorias);
			setDerrotas(derrotas);
			setEmpates(empates);
		}

		
		public void apresentar() {			
			System.out.println("Lutador de nome: " +getNome()+ " | nacionalidade "+getNacio() +" | com "+getVitorias()+" vitorias | "+getDerrotas()+" derrotas | e "+getEmpates()+" empate.");
		}
		public void status() {
			if(categoria == null)
				categoria = Categoria.PESO_INVALIDO;
			System.out.println("Lutador com peso de "+getPeso()+"KG |altura de "+getAltura()+"m |na categoria de peso "+getCategoria().getDescricao());
		}
		public void ganharLuta() {
			this.vitorias += 1 ;
		}
		public void perderLuta() {
			this.derrotas += 1;
		}
		public void empatarLuta() {
			this.empates += 1;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacio() {
			return nacionalidade;
		}
		public void setNacio(String nacio) {
			this.nacionalidade = nacio;
		}
		public Integer getIdade() {
			return idade;
		}
		public void setIdade(Integer idade) {
			this.idade = idade;
		}
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float pe) {
			this.peso = pe;
			
				setCategoria(pe);		
			}
	
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(float pe) {			
			if(pe < 52.2f ) {
				this.categoria = Categoria.PESO_INVALIDO;
			}else if(pe < 70.3) {
				this.categoria = Categoria.PESO_PENA;
			}else if(pe < 83.9) {
				this.categoria = Categoria.PESO_MEDIO;
			}else if(pe < 120.2 ) {
				this.categoria = Categoria.PESO_PESADO;
			}else {
				this.categoria = Categoria.PESO_INVALIDO;
			}
				
		}
		public Integer getVitorias() {
			return vitorias;
		}
		public void setVitorias(Integer vitorias) {
			this.vitorias = vitorias;
		}
		public Integer getDerrotas() {
			return derrotas;
		}
		public void setDerrotas(Integer derrotas) {
			this.derrotas = derrotas;
		}
		public Integer getEmpates() {
			return empates;
		}
		public void setEmpates(Integer empates) {
			this.empates = empates;
		}


		}	

