package pq;

// Deprecated: moved implementation to HashTableHashCodeDemo.java

import java.util.Hashtable;

public class pq45 {
	int hashcode;

	pq45(int hashcode) {
		this.hashcode = hashcode;
	}

	public int hashCode() {
		return hashcode;
	}

	public String toString() {
		return hashcode + " ";
	}

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();

		ht.put(new Test1(10), "Java");
		ht.put(new Test1(3), "C");
		ht.put(new Test1(6), "null");

		System.out.println(ht);
	}
}