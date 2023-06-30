/* Object 을 상속받은 자손에서 부모의 equals() 메서드를 오버라이딩을 해서 비교해서 제대로 된 비교를 하는 예제
 * 
 */

class Point02_1{//extends Object 생략됌
	int x,y;
	
	public Point02_1() {}
	
	public Point02_1(int x, int y) {
		this.x = x;
		this.y = y;
	}//생성자 오버로딩

	public boolean equals(Object obj1) {
		Point02 tmp = (Point02) obj1;
		
		return (x==tmp.x && y==tmp.y);
	}
}//equals()
	
public class ObjectClassTest03_01 {
public static void main(String[] args) {
	Point02 pt01 = new Point02(100,200); // 수원
	Point02 pt02 = new Point02(100,200); // 종로
	
	System.out.println(pt01 == pt02);
	
	System.out.println(pt01.equals(pt02)); // 두 객체의 x변수와 y값이 일치하면 true
	
	
	
}
}
