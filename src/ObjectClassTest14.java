/* 자기 자신 문자 내용을 변경가능한 StringBuffer 내장 api
 * 특징 ; 내장메서드 활용도가 떨어지지만, 메모리 낭비가 적어서 프로그래밍 속도가 빠르다
 */


class Str{
	
}

public class ObjectClassTest14 {
public static void main(String[] args) {
	
	StringBuffer sb01 = new StringBuffer("abc");
	StringBuffer sb02 = new StringBuffer("abc");
	
	System.out.println("sb01 == sb02 ?" + (sb01 == sb02)); //참조타입을 == 로 비교하면 객체주소를 비교한다. 그래서 false
	System.out.println("sb01.equals(sb02) ?" + sb01.equals(sb02)); //false 
							//=> 이유는 StringBuffer 클래스에는 equals()메서드가 오버라이딩이 안되어 있어서 
							//	 Object 클래스의 equals()메서드를 상속받아서 사용하기 때문에 객체주소를 비교해서 false이다.
	
	System.out.println("문제!=================");
	
	/* 문제)
	 * 그러면 sb01과 sb02의 각 객체 문자 내용만 비교해서 참이 나오게 소스를 추가 코드 해보자 (다른 클래스로 변환; toString 을 이용)
	 */
	
	
	String s01=sb01.toString();
	String s02=sb02.toString();
//	if(s01 == s02) {
//		System.out.println("s01 와 s02 는 같다");
//	}else {
//		System.out.println("s01 와 s02 는 다르다");
//	}
	
	System.out.println("s01.equals(s02)? " + s01.equals(s02)); //문자 내용만 비교해서 참	
	
}
}
