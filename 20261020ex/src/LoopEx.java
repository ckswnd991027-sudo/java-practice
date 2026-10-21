// import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		
		//안녕하세요/ 를 5회 출력하자!
		//for(초기화; 조건식; 단계)
		//for ( 시작; 끝; 단계)
		/*
		for (int i = 1; i <6; i++) {
			System.out.println("안녕하세요");
		}
		
		int i = 1;
		for(; i < 10; i +=2) {
			System.out.println("hello");
		}
		
		int j = 0;
		for (j = 5; j < 10; j+=2) {
			System.out.println("HHHHHH");
		}
		for (int k =0; k<10; k++) {
			System.out.println("0");
		}
		*/
		//1부터 사용자가 입력한 정수까찌의 합을 구하는 프로그램을 만들어보자.
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 입력하세요.");
		int inputData = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i <=inputData; i++) {
			sum += i;
		}
		System.out.println("sum: " + sum);
		
		
		
		scanner.close();
        */
		
		//3단 구구단 출력
	/*	for (int i = 1; i < 10; i++) {
	//		System.out.println("3*" + i + "=" + (3*i));
			System.out.printf("3 * %d = %d%n", i, (3*i));
			String.format("3 * %d = %d%n", i, (3*i));
			System.out.println(str);
		*/	
	//재사용 안할거라면 그냥 통으로넣기
			//System.out.println(String.format("3 * %d = %d%n", i, (3*i)));
			
			// 전체 구구단 (가로모드, 세로모드) 출력하자!
			
			for (int i =1; i<10; i++) {
				System.out.printf("2 * %d = %d%n", i, (2*i));
		}
			for (int i =1; i<10; i++) {
				System.out.printf("3 * %d = %d%n", i, (3*i));
		}
			for (int i =1; i<10; i++) {
				System.out.printf("4 * %d = %d%n", i, (4*i));
		}
			for (int i =1; i<10; i++) {
				System.out.printf("5 * %d = %d%n", i, (5*i));
		}
			for (int i =1; i<10; i++) {
				System.out.printf("6 * %d = %d%n", i, (6*i));
		}
			for (int i =1; i<10; i++) {
				System.out.printf("7 * %d = %d%n", i, (7*i));
		}
			for (int i =1; i<10; i++) {
				System.out.printf("8 * %d = %d%n", i, (8*i));
		}
			for (int i =1; i<10; i++) {
				System.out.printf("9 * %d = %d%n", i, (9*i));
		}
			
			for (int i = 1; i < 10; i++) {
			    for (int dan = 2; dan < 10; dan++) {
			        System.out.printf("%d * %d = %2d\t", dan, i, dan * i);
			    }
			    System.out.println();   
			    
			    
			}	
			
			System.out.println("MON\tTue\tWED\tTHU\tFRI\tSAT\tSUN\t");
			int offset = 3;
			int day = 1;
			for (int i =0; i <5; i++){
				// -
				for (int j =0; j < offset; j++) {
						System.out.print(String.format("%3c\t", '-'));
					}
				//날짜
				for (int j = 0; j < 7 -offset; j++) {
					if(day <=30) {
					System.out.print(String.format("%3d\t", day));
					day++;
				}else {
					System.out.println();
				}
				
				System.out.println();
				
				}
			}
					
			
			
	}

}
