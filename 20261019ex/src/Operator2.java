
public class Operator2 {

	public static void main(String[] args) {
		
		/*
		 * 1. 대입연산자
		 */
		
	    int no = 10; // '=' <-- 이 녀석을 대입(할당)연산자
	    //대입(할당)연산자란, 오른쪽의 값을 왼쪽의 변수에 대입(할당)하는 연산자입니다.
	    
	    //2. 복합 대입 연산자
	    /*
	     * += : 덧셈 후 할당
	     * -= : 뺼셈 후 할당
	     * *= : 곱셈 후 할당
	     * /= : 나눗셈 후 할당
	     * %= : 나머지 연산 후 할당
	     */
	    
	    /*
	       *  +=   no += 10;   no에 10을 더한 결괏값을 no에 대입한다.
	         -=   no -= 10;   no에 10을 뺀 결괏값을 no에 대입한다.
	         *=   no *= 10;   no에 10을 곱한 결괏값을 no에 대입한다.
	         /=   no /= 10;   no를 10으로 나눈 결괏값을 no에 대입한다.
	         %=   no %= 10;   no를 10으로 나눈 나머지를 no에 대입한다.
	       */
	    
	    //3. 증감 연산자
	    // ++, --
	    no = 10;
	    no++;
	    System.out.println("no: " + no); //11
	    
	    no--;
	    System.out.println("no: " + no); //10
	    
	    //3-1 : 전위 or 후위 연산자
	    int num1 = 10;
	    int result1 = 0;
	    
	    result1 = ++num1;
	    System.out.println("result1: " + result1); //11
	    System.out.println("num1: " + num1); // 11
	    
	    int num2 = 10;
	    int result2 = 0;
	    
	    result2 = num2++;
	    System.out.println("result2: " + result2); //10
	    System.out.println("num2: " + num2); // 11
	    
	    int num3 = 10;
	    int result3 = 0;
	    
	    result3 = (num3++);
	    System.out.println("result3: " + result3); //10
	    System.out.println("num3: " + num3); // 11 
	    
	    /*
	     * 
	     * 크고 작음을 나타내는 연산자 입니다.
	     * <, >, <=, >=, ==, !=, ===, !==
	     */
	    float num5 = 0.1f; //0.10000000149 > double
	    double num6 = 0.1; //0.10000000000 > double
	    System.out.println("num5: " + num5); //0.1
	    System.out.println("num6: " + num6); //0.1 
	    System.out.println("num5 + num6 : "+ (num5+ num6)); //0.2
	    
	    System.out.println("num5 == num6 : "+ (num5 == num6)); //false
	    System.out.println("num5 != num6 : " +(num5 != num6)); //true
	    
	    System.out.println("num5 > num6 : " +(num5 > num6)); // true
	    System.out.println("num5 < num6 : " +(num5 < num6)); // false
	    
	    int num7 = 10;
	    float num8 = 10.0f;
	    
	    // int + float ==> float + float // num7: 10.0 num8: 10.0
	    System.out.println("num7 > num8 : " +(num7 > num8)); //false
	    System.out.println("num7 >= num8 : " +(num7 >= num8)); //true
	    System.out.println("num7 < num8 : " +(num7 < num8)); //false
	    System.out.println("num7 <= num8 : " +(num7 <= num8)); // true
	    System.out.println("num7 == num8 : " +(num7 == num8)); //true
	    System.out.println("num7 != num8 : " +(num7 != num8)); //false
	    
	    
	    //*******************************************************
	    // 문자열 비교
	    String str1 = "hello";
	    String str2 = "hello";
	    
	    System.out.println("str1 == str2: " + (str1 == str2)); //true
	    
	    //Scanner scanner = new Scanner(System.in);
	    String str3 = new String("Hello"); //반드시 객체생성 연산자로 만들어라
	    String str4 = new String("Hello");
	    
	    System.out.println("str3 == str4: " + (str3 == str4)); //false
	    
	    System.out.println(str3.equals(str4)); //true
	    //문자열은 무조건 equals 로 비교하도록 한다.
	    
	    
	    
	}

}
