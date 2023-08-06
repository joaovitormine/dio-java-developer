public class PlanosOperadora {
    public static void main(String[] args) {
        String plano = "M"; //M / T
		
        /* Programa utilizando if-else, ineficiente comparado ao switch-case
		if(plano == "B") {
			System.out.println("100 minutos de ligação");

		} else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	

		} else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
         */

        switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
        }
    }
}