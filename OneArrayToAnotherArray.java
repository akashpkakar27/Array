package Array;

public class OneArrayToAnotherArray {

	public static void main(String[] args) {
		int a1[] = {1,23,4,2,5,};
		int a2[] = new int [a1.length];
		
		for(int i=0;i<a1.length;i++) {
			a2[i]=a1[i];
			
		}
		
		System.out.println("Original Elements");
		for(int i=0;i<a1.length;i++) {
			
			System.out.print(a1[i]+" ");
		}
			System.out.println("Copy Elements");
			for(int i=0;i<a2.length;i++) {
		System.out.print(a2[i]+" ");
		
}
			System.out.println();
}
}