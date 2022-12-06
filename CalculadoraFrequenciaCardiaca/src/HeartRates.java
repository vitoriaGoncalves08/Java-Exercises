/*INTEGRANTES: 
 * Vitória Passos
 * Gabriel Sena
 * Fábio Barbosa
 * Luisa Aredes
 * Felipe Sadrak
 * */

import java.util.Calendar;

public class HeartRates {
	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	
	//Pegando ano atual automáticamente
	String anoAtual = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
	int anoAtualConvertido = Integer.parseInt(anoAtual);
	
	//Construtor já pegando as validações do set dia, mês e ano
	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		setDia(dia);
		setMes(mes);
		setAno(ano);
		validacaoData();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
	    return dia;
	}

	//Validação do dia (maior que 0 e menor ou igual a 31)
	public void setDia(int dia) {
		if(dia > 0 && dia <= 31) {
			this.dia = dia;			
		}else {
			this.dia = 0;
			System.out.println("\n"+dia + " É um dia inválido!");
		}		
	}

	public int getMes() {
		return mes;
	}
	//Validação do mês (maior que 0 e menor ou igual a 12)
	public void setMes(int mes) {
		if(mes > 0 && mes <= 12) {
			this.mes = mes;
		}else {
			this.mes = 0;
			System.out.println("\n"+mes + " É um mês inválido!");
		}
	}

	public int getAno() {
		return ano;
	}

	//Método para calcular a idade caso a data seja válida
	public int getIdade() {
		if(dia > 0 && mes > 0 && ano > 0) {
			int idade = anoAtualConvertido - ano;
		 	return idade;
		}
		return 0;
	}
	
	//Validação de ano (maior que 0 e menor ou igual que o atual)
	public void setAno(int ano) {
		if(ano > 0 && ano <= anoAtualConvertido) {
			this.ano = ano;
		}else {
			this.ano = 0;
			System.out.println("\n"+ano + " É um ano inválido!");
		}
	}
	
	//Validação específica de data, considerando dia de meses específicos. Ex: mês 2 não pode ter mais de 29 dias...
	public void validacaoData() {
		 if(mes == 2 && dia > 29) {
			 System.out.println("Mês "+ mes +" tem menos dias!");
			 this.dia = 0;
			 this.mes = 0;
		 }
		 else if(mes == 4 && dia == 31 || mes == 6 && dia == 31 || mes == 8 && dia == 31 || mes == 11 && dia == 31) {
			 System.out.println("Mês "+ mes +" tem menos dias!");
			 this.mes = 0;
		 }
	}
	
	//Método pra calcular a Frequência Cardíaca Máxima
	public int frequenciaCardiacaMax() {
        int frequenciaCardio = 220 - this.getIdade();
        return frequenciaCardio;
	}
	
	//Método que calcula a Frequência Cardíaca Alvo
	public void frequenciaCardioAlvo() {
		int teste = frequenciaCardiacaMax();
		double frequenciaAlvoMax = teste * 0.85; //MÁXIMO (85%) da frequência cardíaca.
	    double frequenciaAlvoMin = teste * 0.50; //MÍNIMO (50%) da frequência cardíaca.
	    System.out.printf("Frequência Cardiaca Alvo Máxima: %.2f", frequenciaAlvoMax);
	    System.out.printf("\nFrequência Cardiaca Alvo Mínima: %.2f", frequenciaAlvoMin);
	}
	
	@Override
	public String toString() {
		return "\n=============================DADOS PESSOAIS=================================="
				+ "\nNome completo: " + nome + " " + sobrenome + "\nData de nascimento: " + dia + "/" + mes + "/"
				+ ano + "\nIdade: "+ getIdade() + " anos" + "\nAno atual: " + anoAtual + "\nFrequência Cardíaca Máxima: " + this.frequenciaCardiacaMax();
	}
}
