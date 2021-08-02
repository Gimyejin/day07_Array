package day07_Array;

import java.util.Scanner;
import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList member = new ArrayList();
		ArrayList memberA = new ArrayList();

		while (true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.println(">>>");
			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("이름 입력: ");
				String name = input.next();
				System.out.println("연락처 입력: ");
				String address = input.next();
				if (member.contains(name)) {
					System.out.println("같은 이름이 존재합니다.");
				} else {
					member.add(name);
					memberA.add(address);
					System.out.println("등록 완료\n");
				}
				break;
			case 2:
				System.out.println("찾을 이름 입력: ");
				String findName = input.next();

				if (member.contains(findName)) {
					int index = 0;
					index = member.indexOf(findName);
					System.out.println(member.get(index) + " : " + memberA.get(index));
				} else {
					System.out.println(findName + "님은 목록에 없습니다.");
				}
				break;
			case 3:
				System.out.println("삭제할 이름 입력:");
				String findName2 = input.next();
				int index = 0;
				if (member.contains(findName2)) {
					index = member.indexOf(findName2);
					member.remove(index);
					memberA.remove(index);
				} else {
					System.out.println(findName2 + "님은 목록에 없습니다.");
				}
				break;
				
			case 4:
				for (int i = 0; i < member.size(); i++) {
					System.out.println("회원" + (i + 1) + "의 이름: " + member.get(i) + ", 연락처: " + memberA.get(i));
				}

				break;
			case 5:
				System.exit(1);
			}
		}

	}

}
