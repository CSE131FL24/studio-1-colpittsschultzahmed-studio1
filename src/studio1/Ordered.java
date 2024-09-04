package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean isOrdered = true;
		
		boolean temp = x < y;
		boolean temp1 = y < z;
		boolean order = temp && temp1;
		
		boolean asc = x>y;
		boolean asc1 = y>z;
		boolean order1 = asc && asc1;
		
		isOrdered = order || order1;
		
		System.out.println(isOrdered);
				
	}

}
