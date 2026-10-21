
public class Operator4 {

	public static void main(String[] args) {
        /*
         * 논리 연산자(Boolean)
         * &&   :  and연산자 A && B -> A,B 모두 true인경우에만 true
         *||    :  or 연산자 A || B -> A,B 하나라도 true 면 true
         *!     :  부정(not)연산자 !A -> A 의 현재 상태를 부정
         */
		
		int num1= 10; int num2 = 20; int num3 = 30;
		
		boolean result1 = (num1 < num3) && (num2 < num3); // true and true -> true
		System.out.println("result1: " + result1);
		
		boolean result2 = (num1 > num3) && (num2 < num3); // false and true -> false
		System.out.println("result2: " + result2);
		
		boolean result3 = (num1 > num3) || (num2 < num3); // false or true -> true
		System.out.println("result3: " + result3);
		
		/*
		 * python
		 * and, or , not
		 */
		
		System.out.println(!!true); // true
		/*
	       * &&와 ||중에서 어떤 연산자의 연산 우선순위가 높을까요?
	       * 갑작스런 질문에 살짝 당황하셨나요? 
	       * 쉽게 생각하면 &&와 ||는 모두 논리연산자로 연산 우선순위가 같아서 왼쪽부터 순차적으로 연산할거라 
	       * 생각하기 쉽습니다. 하지만 실제 연산 우선순위는 &&가 ||보다 높습니다. 
	       */
		boolean res = false;
		int no1 = 10;
		int no2 = 20;
		int no3 = 30;
		res = (no1 < no3) || (no2 < no3) && (no1 > no3);
		// true || true => true
		                     // true && false => false
		System.out.println("res : " + res); // true
		
		/*
		 * 조건식 연산자 or 삼항식 연산자
		 */
		
		int passScore = 80;
		int myScore = 90;
		
		//나의 점수가 80 이상이면 pass를 그렇지않으면 fail 을 출력하자!
		
		String resultStr = (myScore >= passScore) ? "PASS" : "FAIL";
        System.out.println("resultStr: " + resultStr);
        
        /*
         * pthon에서 삼항 연산자
         * true인경우 if 조건식 else false인경우10.
         */
		
	}

}
