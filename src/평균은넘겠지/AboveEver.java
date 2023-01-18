package 평균은넘겠지;
//      5 ==> 총 테스트 케이스
//      5 50 50 70 80 100 ==> 40.000%
//      7
//      3
//      3
//      9


import java.util.Scanner;

public class AboveEver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();
        double[] rst = new double[testCnt];
        for (int i = 0; i < rst.length; i++) {
            rst[1] = overRate();
        }
        for (double e : rst) {
            //System.out.println("%3.3f\n", e);
        }
    }
    // 학생수를 입력 받고 입력 받은 학생수 만큼의 성적을 입력 받음
    // 평균을 구하기 위해 먼저 총점을 구하고 이를 나눠 평균을 구함
    // 구해서 평균을 가지고 각각 입력 받은 성적을 비교, 평균을 넘는 학생 수 구함
    // 구해진 학생 수를 100분율로 변환해서 변환
    static double overRate() {
        Scanner sc =new Scanner(System.in);
        int cnt = sc.nextInt(); // 학생의 수 입력
        int total = 0; // 총점 구하기 위한 변수
        int overCmt = 0; // 평균을 넘는 학생 수 구하는 변수
        int[] score = new int[cnt]; // 학생의 수만큼 성적 입력 받기 위한 배열로 생성
        for(int i = 0; i < score.length; i++) {
            score[i] =sc.nextInt(); // 학생 수만큼 성적을 입력 받아 배열에 대입
            total = total + score[i]; // 학생 수맠믐 입력된 성적 누적 해 총점 구함
        }
//        double aver = (double) total / cnt; // 총점을 학생 수로 나눠 평균을 구함
//        for(int e : score)
//            [-]
        return 0;
    }
}
