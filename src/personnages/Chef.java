package personnages;

public class Chef {
	private String nom;
	private int  effetPotionMin;
	private int effetPotionMax;
	private Village village;
	
	public Chef(String nom, int effetPotionMin, int effetPotionMax, Village village) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.village= village;
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");

	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return " le chef " + nom + " du village " + village.getNom()+ ": ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
}
