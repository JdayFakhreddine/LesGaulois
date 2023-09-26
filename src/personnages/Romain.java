package personnages;

public class Romain {
	private String nom;
	private int force ;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	
	}
	
	private String prendreParole() {
		// TODO Auto-generated method stub
		return " le romain " + nom + " :";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0 )
			parler("Aie");
		else {
			parler("j'abondonne ...");
		}
	}
	public static void main(String[] args) { 
		Romain Minus= new Romain("Minus", 6);
		System.out.println(Minus.prendreParole() + " je Suis Minus , le Romain !" );
		Minus.parler("UN GAU... UN GAUGAU...");
		Gaulois asterix = new Gaulois("Asterix",8);
		Minus.recevoirCoup(asterix.getForce() /3);
}
}