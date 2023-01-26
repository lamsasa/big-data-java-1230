package Calendar클래스;

import java.util.Calendar;

// Calender 클래스는 추상 클래스이므로 객체 생성없이 사용
// >> 날짜와 시간과 달리 캘린더 표기법은 각 나라마다 상이하기 때문
// 정적 메소드인 getInstance() 메소드 이용, 운영체제 시간 기준의 정보를 가져옴, 포함 필드 전부 클래스 변수
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Date now = new Date();
//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(now.get(Calendar.MONTH) + 1); // 달에 대한 index 정보가 넘어와서 나라 별로 각자 구현하기 위해 + 1
//        System.out.println(now.get(Calendar.DAY_OF_WEEK));
//        System.out.println(now.get(Calendar.DAY_OF_MONTH));
//        System.out.println(now.get(Calendar.AM_PM));
//        System.out.println(now.get(Calendar.HOUR));
//        System.out.println(now.get(Calendar.MINUTE));
//        System.out.println(now.get(Calendar.SECOND));
        // yyyy년MM월dd HH시mm분ss초 : Calendar
        System.out.print(now.get(Calendar.YEAR) + "년");
        System.out.print(now.get(Calendar.MONTH) + 1 + "월");
        System.out.print(now.get(Calendar.DAY_OF_MONTH) + "일");
        System.out.print(now.get(Calendar.HOUR_OF_DAY) + "시");
        System.out.print(now.get(Calendar.MINUTE) + "분");
        System.out.print(now.get(Calendar.SECOND) + "초");

    }
}
