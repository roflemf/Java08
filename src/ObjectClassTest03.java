class Point02{//extends Object 생략됌
	int x,y;
	
	public Point02() {}
	
	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}//생성자 오버로딩

	@Override
	public boolean equals(Object obj) { // 업캐스팅 되면서 인자가 전달됌
		/* 문제) 형변환 유무 판단 연산자인 instanceof 를 사용해서 더 안전한 다운캐스팅이 되게 해보자
		 * 
		 */
		Point02 ptTmp = null;
		if(obj instanceof Point02) { //명시적인 다운캐스팅이 가능한가? 사전에 업캐스팅이 가능함.true
			ptTmp = (Point02)obj; // 명시적인 다운캐스팅
		}
		
		if((x == ptTmp.x) && (y == ptTmp.y)) { // 기본 정수타입 값을 == 로 값만 비교
			return true;
		}else {
			return false;
		}
		
		
	}//equals()

	
}
	
public class ObjectClassTest03 {
	
	public static void main(String[] args) {
	
		Point02 pt01 = new Point02(100,200); 
		Point02 pt02 = new Point02(100,200); 
		
		if(pt01 == pt02) { //참조 타입 객체를 ==로 비교해서 객체 주소를 비교 => pt01과 pt02는 각각 객체 주소가 다르다
			System.out.println("pt01 과 pt02는 같다");
		}else {
			System.out.println("pt01 과 pt02는 다르다");
		}
	}
	
}
