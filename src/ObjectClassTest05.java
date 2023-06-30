/* java.lang패키지의 final class인 문자열을 다루는 내장 api String 클래스 특징)
 * 	문자열  String은 자기 자신 내용을 수정 못한다. 문자열 내용이 수정되면 문자열 객체가 생성된다.
 * 
 */
public class ObjectClassTest05 {
public static void main(String[] args) {
	
	String str01 = "java";
	System.out.println("영문 대문자로 변경 : " + str01.toUpperCase());
	System.out.println("str01자기 자신은 그대로임 : " + str01);
	
	String str02 = new String(" Programming");
	System.out.println("\'java\' 문자길이=" + str01.length()); // length()메서드로 문자 길이 반환. 
															// 길이는 1부터 카운트 한다. 
	String result = str01.concat(str02); //두 문자 연결
	System.out.println("두 문자 연결 : " + result);
	System.out.println("\'java\'의 세번쨰 단일문자 = " + str01.charAt(2)); // charAt(2)내장 메서드는 주어진 인자값 2 에 해당하는 단일문자를 구함.
																	// 첫문자를 0부터 카운트 함.
	System.out.println("\' Programming\'에서 단일문자 r이 몇번째에 저장 되어 있는가?"+
																	(str02.indexOf('r')+1)); 
	//indexOf('r')내장 메서드는 단일문자 r 을 맨 왼쪽에서 부터 찾아서 가장 먼저 나오는 해당 문자 위치 번호를 0부터 카운트 해서 반환 => 3
	
	/* 문제)
	 * String 내장 api 의 내장 메서드 중에서 
	 * str02 변수에 저장된 문자열 값 중에서 단일문자 r을 맨 오른쪽부터 찾아서 가장 먼저 나오는 해당 문자 위치 번호를 맨 왼쪽에서 부터 +1해서 반환해 보자.
	 * 
	 */
	
	System.out.println("\' Programming\'에서 단일문자 r이 맨 오른쪽에서 가장 먼저 나오는 해당 문자 위치 : "
	+ (str02.lastIndexOf("r")+1)); // 6
			
			
			
			
			

}
}
