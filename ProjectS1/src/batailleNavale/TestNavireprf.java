package batailleNavale;
public class TestNavire {

	public static void main(String[] args) {
		
		Navire n = new Navire(new Coordonnee("A3"),4,true);
		
		System.out.println(n);
		
		if (!n.contient(new Coordonnee("A3"))) {
			System.out.println("pb ne contient pas A3");
		}
		if (!n.contient(new Coordonnee("A4"))) {
			System.out.println("pb ne contient pas  A4");
		}
		if (!n.contient(new Coordonnee("A5"))) {
			System.out.println("pb ne contient pas  A5");
		}
		if (!n.contient(new Coordonnee("A6"))) {
			System.out.println("pb ne contient pas  A6");
		}
		
		if (n.contient(new Coordonnee("A2"))) {
			System.out.println("pb contient A2");
		}
		if (n.contient(new Coordonnee("A7"))) {
			System.out.println("pb contient A7");
		}
		if (n.contient(new Coordonnee("B4"))) {
			System.out.println("pb contient B4");
		}
		
		 // [d1;f1] [d2;f2]
		 // [1;10] [5;15] -> intersectionNonVide true
		 // [5;15]  [1;10]-> intersectionNonVide true
		 // [1;10] [12;15] -> intersectionNonVide false
		if (! Navire.intersectionNonVide(1, 10, 5, 15)) {
			System.out.println("pb intersectionNonVide 1");
		}
		if (! Navire.intersectionNonVide( 5, 15, 1, 10)) {
			System.out.println("pb intersectionNonVide 2");
		}
		if (Navire.intersectionNonVide( 1, 10, 12, 15)) {
			System.out.println("pb intersectionNonVide 3");
		}
		if (Navire.intersectionNonVide(  12, 15, 1, 10)) {
			System.out.println("pb intersectionNonVide 4");
		}
		
		
		
	}

}
