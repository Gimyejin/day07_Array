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
		 - �����Ϳ� ���� ������ �ִ�. index�� ���ٰ���
		 - �ߺ��� �����͸� ���� ����
		 - �迭���� �ٸ��� ���� �ٸ� �ڷ����� ���� �� �ִ�.
		 - �������� ũ�⸦ ���´�
		 */
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		arr.add("789");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		System.out.println(arr.size());
		//1:1 ���踦 ���°� �������� ��-��-��- ....
 		//1�� ���� ���踦 ���°��� ��������
		System.out.println(arr.contains("123"));//���� ���ϴ°� �ִ��� Ȯ���غ� �� ����.
		System.out.println(arr.remove("123"));//�����ϰ� �� �������� true
		System.out.println(arr.remove(1));//index�� �����
		System.out.println(arr);
		System.out.println(arr.get(0));//456�� [0]��°�� ��
		
		arr.clear();//��ü ���� �����
		System.out.println("���� �� arr: "+arr);
	}

}
