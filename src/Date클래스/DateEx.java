package Date클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date() : 1970년 1월 1일 0시0분0초에서 현재까지 경과 시간으로 시간 계산(msec), 객체를 생성 후 사용
// SimpleDateFormat : 운영체제로부터 얻어진 시간 정보를 우리가 원하는 포멧으로 변경, 출력(pattern 매칭을 사용)
//
public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        // yyyy : 연도
        // MM : 월(대문자)
        // dd : 일
        // hh : 시간 (12시간제를 의미)
        // HH : 시간 (24시간제를 의미)
        // mm : 분
        // ss : 초
        // W : 월에서 n 번째 주
        // w : 연에서 n 번째 주
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yyyy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년 MM월 dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차입니다.");
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

    }
}
