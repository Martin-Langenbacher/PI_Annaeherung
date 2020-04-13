package Pi_challenge;

public class PiMethode02 {

	public static void main(String[] args) {
		
		
		double piVariable = 0.0;
		double zaehler = 0.0;
		double abbruch = 0.0000001;
		double summant = 1.0;
		final double PI_CONSTANT = Math.PI;
		boolean positiv = true;
		
		
		do {
			if (positiv) {
				piVariable = piVariable + summant;
				positiv = !positiv;
			} else {
				piVariable = piVariable - summant;
				positiv = !positiv;
			}
			zaehler++;
			summant = (1d / (2*zaehler +1)); // alternativ: 1.0
			
			//System.out.println( "zaehler : " + zaehler); 
			//System.out.println( "piVariable*4: " + piVariable*4);
			//System.out.println( "summant: " + summant);
		}
			while (summant >= abbruch);
			
		
		
		
		
		System.out.println("Ende, Abschnitt 2");
		System.out.println(4*piVariable + " (4 * piVariable)");
		System.out.println(PI_CONSTANT + " (PI_Konstante)");
		double delta = PI_CONSTANT - (4 * piVariable);
		System.out.println("Delta: " + delta);
		System.out.println( "summant: " + summant);
		
		

	}

}









