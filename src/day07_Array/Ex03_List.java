package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_List {

	public static void main(String[] args) {
		/*
		 List 
		 -ArrayList
		 -LinkedList
		 -stack...
		 
		 ArrayList
		 - 데이터에 대한 순서가 있다. index로 접근가능
		 - 중복된 데이터를 저장 가능
		 - 배열과는 다르게 서로 다른 자료형도 넣을 수 있다.
		 - 가변적인 크기를 갖는다
		 */
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		arr.add("789");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		System.out.println(arr.size());
		//1:1 관계를 갖는게 선형구조 ㅁ-ㅁ-ㅁ- ....
 		//1대 다의 관계를 같는것은 비선형구조
		System.out.println(arr.contains("123"));//내가 원하는게 있는지 확인해볼 수 있음.
		System.out.println(arr.remove("123"));//존재하고 잘 지워지면 true
		System.out.println(arr.remove(1));//index로 지우기
		System.out.println(arr);
		System.out.println(arr.get(0));//456이 [0]번째가 됨
		
		arr.clear();//전체 내용 지우기
		System.out.println("삭제 후 arr: "+arr);
	}

}
