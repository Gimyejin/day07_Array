package day07_Array;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String odd_even=null;
		System.out.println("Â¦¼ö, È¦¼ö ÀÔ·Â: ");
		odd_even = input.next();
		
		int arr[] = new int[] {10,54,13,17,25,30};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0 && odd_even.equals("Â¦¼ö")) {//String Àº ==ÀÌ ¾Æ´Ï¶ó equals·Î ºñ±³
				System.out.println("Â¦¼ö: "+arr[i]);
			}else if(arr[i]%2 !=0 && odd_even.equals("È¦¼ö")){
				System.out.println("È¦¼ö: "+arr[i]);
			}
		}

	}

}
