public class HeartRatesTest {
	public static void main (String[]args) {
		
		HeartRates frequenciaJose = new HeartRates("José", "Claudio", 31,02,1992); //Exemplo com dia do mês inválido
		System.out.println(frequenciaJose.toString());
		frequenciaJose.frequenciaCardioAlvo();
		System.out.println("\n=============================================================================");
		
		HeartRates frequenciaCarla = new HeartRates("Carla", "Pereira", 42,10,1990); //Exemplo com dia inválido
		System.out.println(frequenciaCarla.toString());
		frequenciaCarla.frequenciaCardioAlvo();
		System.out.println("\n=============================================================================");
		
		HeartRates frequenciaLucas = new HeartRates("Lucas", "Silva", 03,17,2000); //Exemplo com mês inválido
		System.out.println(frequenciaLucas.toString());
		frequenciaLucas.frequenciaCardioAlvo();
		System.out.println("\n=============================================================================");
		
		HeartRates frequenciaMariana = new HeartRates("Mariana", "Nunes", 20,11,2024); //Exemplo com ano inválido
		System.out.println(frequenciaMariana.toString());
		frequenciaMariana.frequenciaCardioAlvo();
		System.out.println("\n=============================================================================");
		
		HeartRates frequenciaGabriel = new HeartRates("Gabriel", "Ortega", 30,01,1982); //Exemplo funcionando corretamente
		System.out.println(frequenciaGabriel.toString());
		frequenciaGabriel.frequenciaCardioAlvo();
		System.out.println("\n=============================================================================");
	}
}
