package Week2;
import java.util.*;
public class LinkedListP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myll= new LinkedList();
		myll.add("Ironman");
		myll.add("Thor");
		myll.add("Hulk");
		myll.add("Loki");
		
		System.out.println(myll.get(1));
		
		Iterator itr = myll.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
