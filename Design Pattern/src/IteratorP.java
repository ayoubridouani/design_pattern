//Exercice 3: Iterator Pattern
//Problem: 

public class IteratorP {

	public static void main(String[] args) {
		//implement Iterator
	    Collection<String> col = new ArrayList<>();
	    col.add("Ayoub1");
	    col.add("Ayoub2");
	    col.add("Ayoub3");
	    col.add("Ayoub4");
	    
	    Iterator<String> it = col.iterator();
	    while(it.hasNext()){
	        System.out.println(it.next());
	    }
	}

}
