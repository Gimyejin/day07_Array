package day07_Array;

import java.util.Scanner;
import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList member = new ArrayList();
		ArrayList memberA = new ArrayList();

		while (true) {
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.println(">>>");
			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("�̸� �Է�: ");
				String name = input.next();
				System.out.println("����ó �Է�: ");
				String address = input.next();
				if (member.contains(name)) {
					System.out.println("���� �̸��� �����մϴ�.");
				} else {
					member.add(name);
					memberA.add(address);
					System.out.println("��� �Ϸ�\n");
				}
				break;
			case 2:
				System.out.println("ã�� �̸� �Է�: ");
				String findName = input.next();

				if (member.contains(findName)) {
					int index = 0;
					index = member.indexOf(findName);
					System.out.println(member.get(index) + " : " + memberA.get(index));
				} else {
					System.out.println(findName + "���� ��Ͽ� �����ϴ�.");
				}
				break;
			case 3:
				System.out.println("������ �̸� �Է�:");
				String findName2 = input.next();
				int index = 0;
				if (member.contains(findName2)) {
					index = member.indexOf(findName2);
					member.remove(index);
					memberA.remove(index);
				} else {
					System.out.println(findName2 + "���� ��Ͽ� �����ϴ�.");
				}
				break;
				
			case 4:
				for (int i = 0; i < member.size(); i++) {
					System.out.println("ȸ��" + (i + 1) + "�� �̸�: " + member.get(i) + ", ����ó: " + memberA.get(i));
				}

				break;
			case 5:
				System.exit(1);
			}
		}

	}

}
