package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois ( "ASterix" , 8);
		Romain Minus = new Romain ( "Minus",6);
		asterix.parler("« Bonjour à tous»");
		Minus.parler("« UN GAU... UN GAUGAU...»");
		asterix.frapper(Minus);
		Minus.parler("« Aïe»");
		asterix.frapper(Minus);
		Minus.parler("« Aïe»");
		asterix.frapper(Minus);
		Minus.parler("« j'abondonne»");
		
	}

}
