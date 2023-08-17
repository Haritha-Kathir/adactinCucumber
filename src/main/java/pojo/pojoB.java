package pojo;

public class pojoB {
	
	public static void main(String[] args) {
		
	pojoA a=new pojoA();
	
	String name = a.getName();
	System.out.println(name);	
	
	a.setName("James");
	
	String name2 = a.getName();
	System.out.println(name2);
	

}

}
