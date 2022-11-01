package ami;
import java.util.*;
 class Book {
int id;
String name ,author,publisher;
int quantity;
public Book(int id,String name,String author,String publisher,int quantity) {
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
}
}
public class HashSetexample{
	public static void main(String[] args) {
		HashSet<Book> set=new HashSet<Book>();
		//creating books
		Book b1=new Book(101," let us c","amirtha","BpB",6);
		Book b2=new Book(102,"Data communication & networking","Forouzan","Mc graw hill",4);
		Book b3=new Book(103,"operating system","Galvin","Wiley",8);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for(Book b:set) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
			}

	}

}
