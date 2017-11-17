package collections;

import java.util.HashSet;

public class Hash_Set {
	public static void main(String[] args){
		HashSet<String>hash=new HashSet<String>();
		hash.add("1");
		hash.add("bangaram");
		hash.add("anu");
		hash.add("venu");
		hash.add(null);
		int size = hash.size();
		
		System.out.println(size+" = total size");
		boolean b=hash.isEmpty();
		System.out.println(hash);
		System.out.println(b);
		boolean c=hash.contains("bangaram");
		System.out.println(c);
		hash.remove("anu");
		System.out.println(hash);
		
		
		
	}
	

}
