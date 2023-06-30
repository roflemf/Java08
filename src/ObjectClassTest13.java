/* String 클래스 하위의 내장 메서드를 활용해서 주어진 파일로 부터 파일명과 확장자를 구하는 예제)
 * 
 * 
 */
public class ObjectClassTest13 {
public static void main(String[] args) {
	
	String fullName = "Hello.java";
	
	int index = fullName.indexOf('.'); // .를 맨 왼쪽에서부터 찾아서 가장 먼저 나오는 해당 문자 위치번호를 
									   // 왼쪽 0 부터 시작해서 반환 => 5
	
	
	
	
	/* 문제1) 
	 * Hello.java에서 index 변수값 5를 활용해서 String 클래스 하위의 내장메서드를 사용해서 파일명만 구해보자
	 */
	
	String fileName = fullName.substring(0, index); //0 이상 5미만 사이의 파일명을 구함
	System.out.println(fullName + " 에서 .java를 뺀 파일명 : " + fileName);
	
	/* 문제2)
	 * Hello.java에서 index 변수값 5를 활용해서 String 클래스 하위의 내장메서드를 사용해서 확장자만 구해보자.
	 * 
	 */
	String extension = fullName.substring(index+1); // 6이후부터 마지막 문자까지 구함 -> java
	System.out.println(fullName+ "에서 Hello.을 뺀 확장자 : "+ extension);
	
}
}
