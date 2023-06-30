import java.util.Calendar;

/*
 * java.util 패키지와 Calender 추상 클래스 특징)
 *  이 클래스는 년월일 시분초 값을 반환할 때 사용하는 달력 클래스 라고도 한다.
 * 
 */
public class ObjectClassTest08 {
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	//캘린더는 추상클래스 new로 객체 생성을 못한다.
	
	int year = cal.get(Calendar.YEAR); //년도
	int month = cal.get(Calendar.MONTH); // 월값, +1을 한 이유는 1월이 0으로 반환되기 때문
	int date = cal.get(Calendar.DATE); // 일
	int hour = cal.get(Calendar.HOUR); // 12시간제
	int minute = cal.get(Calendar.MINUTE); // 분
	int second = cal.get(Calendar.SECOND); // 초
	int am_pm = cal.get(Calendar.AM_PM); // AM은 오전, PM은 오후
	
	System.out.println("현재 년월일은 " + year + "년"  + month + "월" + date + "일");
	if(am_pm == Calendar.AM) {
		System.out.println("현재 시간은 AM : ");
	}else {
		System.out.println("현재 시간은 PM : ");
	}
	System.out.println(hour + "시 " + minute + "분" + second+ "초 입니다.");
	
}
}
