package Pi_challenge;

public class PiMethode01 {

	public static void main(String[] args) {
		
		double piVariable = 0.0;
		double zaehler;
		int abbruch = 100000;
		final double PI_CONSTANT = Math.PI;
		boolean positiv = true;
		
		for (int i = 0; i < abbruch; i++) {
			zaehler = i;
			if (positiv) {
				piVariable = piVariable + (1 / (2*zaehler +1));
				positiv = !positiv;
			} else {
				piVariable = piVariable - (1 / (2*zaehler +1));
				positiv = !positiv;
			}
			//System.out.println(i + ": " + zaehler); 
			//System.out.println(i + ": " + piVariable);
		}
		
		System.out.println("Ende");
		System.out.println(4*piVariable + " (4 * piVariable)");
		System.out.println(PI_CONSTANT + " (PI_Konstante)");
		double delta = PI_CONSTANT - (4 * piVariable);
		System.out.println("Delta: " + delta);
	}
}
