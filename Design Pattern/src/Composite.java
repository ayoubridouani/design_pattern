//Exercice 2: Composite Pattern
//Problem: patron permet de concevoir une structure d'arbre, par exemple un dossier contient des fichiers et sous dossiers (arbre)

class Exo2_composite implements Exo2_composant{
	private ArrayList<Exo2_composant> component;
	public Exo2_composite() {
		this.component = new ArrayList<>();
	}
	public void operation() {}
	public void add(Exo2_composant component) {
		this.component.add(component);
	}
	public void remove() {
		this.component.remove(this.component.size() - 1);
	}
	public int size() {
		return this.component.size();
	}
}

interface Exo2_composant{
	public void operation();
}

class Exo2_element implements Exo2_composant{
	public Exo2_element() {}
	public void operation() {}
}

public class Composite {

	public static void main(String[] args) {
		Exo2_composite obj1 = new Exo2_composite();
		Exo2_element obj2 = new Exo2_element();
		Exo2_composite obj3 = new Exo2_composite();
		obj1.add(obj2);
		System.out.println(obj1.size());
		obj1.add(obj3);
		System.out.println(obj1.size());
		obj1.remove();
		System.out.println(obj1.size());
	}
}
