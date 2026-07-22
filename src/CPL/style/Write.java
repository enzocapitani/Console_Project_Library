package CPL.style;

public class Write {
	
	//Delay pré definido
	private static final int delay = 50;
	
	/*
	 * Essa função escreve caractere por caractere em um intervalo pré definido pela classe,
	 * ao final, quebra a linha.
	 * Ao escrever uma letra, o programa dorme por 50 milissegundos e depois repete o ciclo
	 * Basicamente é um System.out.println() mas com uma animação mais dinâmica, melhorando a
	 * interface no console, trazendo mais dinâmica
	 */
	
	public static void write(String phrase) {
		
		for(int i = 0; i < phrase.length(); i++) {
			System.out.print(phrase.charAt(i));
			
			try {
				Thread.sleep(delay);
			}catch(Exception e ) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println();
	}
	
	/*
	 * Mesma coisa da primeira, porém com um delay escolhido pelo usuário
	 */
	public static void write(String phrase, int delay) {
		
		for(int i = 0; i < phrase.length(); i++) {
			System.out.print(phrase.charAt(i));
			
			try {
				Thread.sleep(delay);
			}catch(Exception e ) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println();
		
	}

	/*
	* Mesma coisa das implementações anteriores, mas agora é possível escrever com cores definidas pelo enum WriteColor
	* em alguns consoles de IDE , essa função pode não funcionar 
	*/
	public static void write(String phrase, WriteColor color){

		for(int i = 0; i < phrase.length(); i++) {

			System.out.print(
				color.toString() +
				phrase.charAt(i) +
				WriteColor.RESET

			);
			
			try {
				Thread.sleep(delay);
			}catch(Exception e ) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println();
	}

	/*
	* Escrever com cor, mas com delay definido na entrada da função
	*/
	public static void write(String phrase, WriteColor color, int delay){
		for(int i = 0; i < phrase.length(); i++) {

			System.out.print(
				color.toString() +
				phrase.charAt(i) +
				WriteColor.RESET

			);
			
			try {
				Thread.sleep(delay);
			}catch(Exception e ) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println();
	}

}
