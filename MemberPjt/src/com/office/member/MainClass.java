package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean systemFlag = true;

		String memberID;
		String memberPW;
		String memberMail;
		String memberPhone;
		String[] memberInfos;

		final int MENU_SIGN_UP = 1;
		final int MENU_SIGN_IN = 2;
		final int MENU_MODIFY = 3;
		final int MENU_DELETE = 4;
		final int MENU_END = 99;

		//     gildong ["1234", "gildong@gmail.com", "010-1234-5678"]
		//     chanho  ["0000", "chanho@naver.com", "010-2222-3333"]
		HashMap<String, String[]> members = new HashMap<String, String[]>();

		// DUMMY DATA START
		members.put("gildong", new String[]{"1234", "gildong@gmail.com", "010-1234-5678"});
		memberInfos = members.get("gildong");
		for (int i = 0; i < memberInfos.length; i++) {
			System.out.println(memberInfos[i]);
		}
		members.put("chanho", new String[]{"0000", "chanho@naver.com", "010-2222-3333"});
		memberInfos = members.get("chanho");
		for (int i = 0; i < memberInfos.length; i++) {
			System.out.println(memberInfos[i]);
		}
		// DUMMY DATA END

		while (systemFlag) {

			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.END");

			int selectedMenuNumber = scanner.nextInt();

			switch (selectedMenuNumber) {
			case MENU_SIGN_UP:                          // 1.SIGN-UP 회원가입

				System.out.println("Input new member ID!!");
				memberID = scanner.next();

				System.out.println("Input new member PW!!");
				memberPW = scanner.next();

				System.out.println("Input new member MAIL!!");
				memberMail = scanner.next();

				System.out.println("Input new member PHONE!!");
				memberPhone = scanner.next();

				members.put(memberID, new String[]{memberPW, memberMail, memberPhone});

				memberInfos = members.get(memberID);
				for (int i = 0; i < memberInfos.length; i++) {
					System.out.println(memberInfos[i]);
				}

				break;

			case MENU_SIGN_IN:                          // 2.SIGN-IN 로그인

				System.out.println("Input member ID!!");
				memberID = scanner.next();

				System.out.println("Input member PW!!");
				memberPW = scanner.next();

				memberInfos = members.get(memberID);

				if (memberInfos != null && memberInfos[0].equals(memberPW)) {
					// ID, PW 일치 == 로그인 성공
					System.out.println("SIGN-IN SUCCESS!!");
				} else {
					// ID 없음 or PW 불일치 == 로그인 실패
					System.out.println("SIGN-IN FAIL!!");
				}

				break;

			case MENU_MODIFY:                           // 3.MODIFY 정보수정

				System.out.println("Input member ID!!");
				memberID = scanner.next();

				System.out.println("Input new member PW!!");
				memberPW = scanner.next();

				System.out.println("Input new member MAIL!!");
				memberMail = scanner.next();

				System.out.println("Input new member PHONE!!");
				memberPhone = scanner.next();

				memberInfos = members.get(memberID);

				if (memberInfos != null) {
					memberInfos[0] = memberPW;
					memberInfos[1] = memberMail;
					memberInfos[2] = memberPhone;

					for (String memberInfo : memberInfos) {
						System.out.println(memberInfo);
					}
				} else {
					System.out.println("존재하지 않는 ID 입니다. 다시 확인하세요.");
				}

				break;

			case MENU_DELETE:                           // 4.DELETE 탈퇴

				System.out.println("Input member ID!!");
				memberID = scanner.next();

				System.out.println("Input member PW!!");
				memberPW = scanner.next();

				memberInfos = members.get(memberID);

				if (memberInfos != null && memberInfos[0].equals(memberPW)) {
					members.remove(memberID);
					System.out.println("삭제 처리 이후: " + members.get(memberID));   // null이면 삭제 성공
				} else {
					System.out.println("ID 또는 PW가 올바르지 않습니다. 다시 확인하세요.");
				}

				break;

			case MENU_END:                              // 99.END 종료

				System.out.println("Goodbye");
				systemFlag = false;
				break;
			}
		}

		scanner.close();
	}
}