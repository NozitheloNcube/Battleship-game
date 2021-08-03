package batailleNavale;
public class TestCoordonnee {

	public static void main(String[] args) {
		
		Coordonnee c = new Coordonnee("C6");
		
		System.out.println(c.toString());
		
		if (c.getLigne() != 5) {
			System.out.println("PB avec ligne");
		}
		if (c.getColonne() != 2) {
			System.out.println("PB avec colonne");
		}
		if ( !c.toString().equals("C6") ) {
			System.out.println("PB avec toString");
		}
		
		if (! c.equals(new Coordonnee("C6"))) {
			System.out.println("PB 1 avec equals");
		}
		if (c.equals(new Coordonnee("C7"))) {
			System.out.println("PB 2 avec equals");
		}
		if (! c.voisine(new Coordonnee("C7"))) {
			System.out.println("PB 1 avec voisines");
		}
		if (! c.voisine(new Coordonnee("C5"))) {
			System.out.println("PB 2 avec voisines");
		}
		if (! c.voisine(new Coordonnee("B6"))) {
			System.out.println("PB 3 avec voisines");
		}
		if (! c.voisine(new Coordonnee("D6"))) {
			System.out.println("PB 4 avec voisines");
		}
		if (c.voisine(new Coordonnee("D7"))) {
			System.out.println("PB 5 avec voisines");
		}
		
		Coordonnee c2 = new Coordonnee("D6");
		Coordonnee c3 = new Coordonnee("A3");
		Coordonnee c4 = new Coordonnee("D7");
		if (c.compareTo(c2)>=0) {
			System.out.println("PB 1 avec compareTo");
		}
		if (c.compareTo(c3)<=0) {
			System.out.println("PB 2 avec compareTo");
		}
		if (c.compareTo(c4)>=0) {
			System.out.println("PB 3 avec compareTo");
		}
		if (c2.compareTo(c)<=0) {
			System.out.println("PB 4 avec compareTo");
		}
		if (c3.compareTo(c)>=0) {
			System.out.println("PB 5 avec compareTo");
		}
		if (c4.compareTo(c)<=0) {
			System.out.println("PB 6 avec compareTo");
		}
		if (c.compareTo(c)!=0) {
			System.out.println("PB 7 avec compareTo");
		}

	}

}
