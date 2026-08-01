package pq;

import java.util.Hashtable;

public class HashTableHashCodeDemo {
	int hashcode;

	HashTableHashCodeDemo(int hashcode) {
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

		ht.put(new Testing(10), "Java");
		ht.put(new Testing(3), "C");
		ht.put(new Testing(6), "null");

		System.out.println(ht);
	}
}
