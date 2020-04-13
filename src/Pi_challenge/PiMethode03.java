package Pi_challenge;

public class PiMethode03 {

	public static void main(String[] args) {
		double piVariable = 0.0;
		double zaehler = 0.0;
		double abbruch = 0.00000001;
		double summant = 1.0;
		double delta;
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
			summant = (1 / (2*zaehler +1));
			delta = PI_CONSTANT - 4*piVariable; 
			
			/*
			System.out.println( "zaehler : " + zaehler); 
			System.out.println( "piVariable*4: " + piVariable*4);
			System.out.println( "summant: " + summant);
			System.out.println( "delta: " + Math.abs(delta));
			System.out.println( "abbruch: " + abbruch);
			*/
			
		}	
		while (Math.abs(delta) > abbruch);
			
		
		
		
		
		System.out.println("Ende, Abschnitt 3");
		System.out.println(4*piVariable + " (4 * piVariable)");
		System.out.println(PI_CONSTANT + " (PI_Konstante)");
		delta = PI_CONSTANT - (4 * piVariable);
		System.out.println("Delta: " + delta);
		System.out.println( "summant: " + summant);
	}

}






