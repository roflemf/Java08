import java.util.StringTokenizer;

/* java.util 패키지의 StringTokenizer 내장 api 클래스 특징
 *  어떤 특수문자 기호를 기준으로 문자를 분리 즉, 파싱해준다. 
 *  분리된 문자를 파싱된 문자라고 한다.
 *  토큰이 되어진 문자 즉, 분리된 문자를 구하는 예제이고, 주로 회원정보 수정폼 등에서 활용 
 *  파싱된 문자는 딱 한번만 사용 가능
 * 
 */
public class ObjectClassTest07 {
	public static void main(String[] args) {
		String phone = "010-999-9999";
		StringTokenizer ph = new StringTokenizer(phone, "-"); // -를 기준으로 폰번호를 분리
		int count = ph.countTokens(); //파싱된 문자 즉 분리된 문자 개수
		System.out.println("파싱된 문자 개수 : " +count + " 개");
		
		while(ph.hasMoreTokens()) { //분리된 토큰이 있다면 ; 참
			System.out.println(ph.nextToken()); //분리된 폰번호를 반환
			}
		System.out.println("==============================");
		StringTokenizer ph02 = new StringTokenizer(phone, "-");
//		System.out.println(ph02.nextToken()); // 사용불가; 한번 사용된 토큰은 재사용 불가능
		System.out.println(ph02.nextToken());
		System.out.println(ph02.nextToken()); // 분리된 폰번호 반환
		System.out.println(ph02.nextToken()); 
	}
	

}
