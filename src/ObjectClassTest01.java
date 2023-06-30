/* java.lang 패키지의 최고 조상 클래스 Object 의 내장 메서드 중
 * to String()메서드를 자손에서 오버라이딩을 해서 활용하는 예제
 */

class Point01 extends Object{ //extends Object는 생략가능함
	int x,y; //클래스 소속 멤버변수 2개 선언
	
	public Point01() {} // 기본 생성자
	
	public Point01(int x, int y) { // 전달인자 개수가 다른 생성자 오버로딩
		this.x = x;
		this.y = y;
		
	}

	@Override
	public String toString() {
		return "(x좌표값 ="+x+",y좌표값=" +y+")";
	}

}

public class ObjectClassTest01 {
public static void main(String[] args) {
	
	Point01 pt = new Point01(100,200);
	System.out.println(pt.toString());
	System.out.println(pt); //.toString()이 생략됌
	
}
}
