package day07_Array;

public class Ex01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=100*i;
			System.out.println("arr "+i+" : "+arr[i]);
		}
		System.out.println("-----------------------------");
		int[] arr1 = new int[] {10,20,30,40,50}; //ÃÊ±âÈ­
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1 "+i+" : "+arr1[i]);
		}

	}

}
