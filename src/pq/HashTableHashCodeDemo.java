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

		ht.put(new Test1(10), "Java");
		ht.put(new Test1(3), "C");
		ht.put(new Test1(6), "null");

		System.out.println(ht);
	}
}
