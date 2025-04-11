package hashMap;

public class HashMapDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put(0,"10");
		map.put(1, "a");
		map.put(2, "12");
		map.put(15 ,"yy");
		map.display();
		System.out.println(map.getSize());
		System.out.println(map.get(2));
		System.out.println(map.containsKey(15));
	}

}
