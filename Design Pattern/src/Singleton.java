//Exercice 1: Singleton Pattern
//Problem: comment instancier une seule fois une class, tel que la deuxieme et la troisieme et les autres instances va partagé la meme espace memoire de la premier objet instancié.

class Exo1{
	private static Exo1 instance;
	
	private Exo1() {
		System.out.println("an object was created");
	}
	
	public synchronized static Exo1 getInstance() { //synchronized ==>  pour resolue le problem lors de deux threads ou plus va utiliser la fonction en meme temps
		if(instance == null) {
			instance = new Exo1();
		}
		return instance;
	}
}

public class Singleton {

	public static void main(String[] args) {
		Exo1 obj1 = Exo1.getInstance();
		Exo1 obj2 = Exo1.getInstance();
	}
}
