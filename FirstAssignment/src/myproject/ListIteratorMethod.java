package myproject;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;
public class ListIteratorMethod {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>(10);
		//Vector a1=new ArrayList(11);
		for(int i=0;i<=10;i++) {
			a1.add(i);
		}
			System.out.println("Size="+a1.size());
			//System.out.print(a1.capacity();
			//System.out.print("new capacity"+a1.capacity();
			 ListIterator itr = a1.listIterator();
			while(itr.hasNext()) {
			itr.next();
			}
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
			}
		}
	}


