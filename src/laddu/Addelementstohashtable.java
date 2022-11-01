package laddu;
import java.io.*;
import java.util.*;


class Addelementstohashtable {

	public static void main(String[] args) {
Hashtable<Integer,String>ht1=new Hashtable<Integer, String>();		// TODO Auto-generated method stub
Hashtable<Integer,String>ht2=new Hashtable<Integer, String>();
//inserting the elements
//using put()method

ht1.put(2, "two");
ht1.put(3, "three");


ht2.put(4, "four");
ht2.put(5, "five");
//print mapping to the console
System.out.println("mapping of ht1 :"+ht1);
System.out.println("mapping of ht2 :"+ht2);
	}
}
