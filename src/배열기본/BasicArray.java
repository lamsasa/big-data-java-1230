package 배열기본;

public class BasicArray {
    public static void main(String[] args) {
        int[] score = {80, 99, 70};

        /*int[] score.txt = new int[3]; // 타입 [] 참조변수 = new 타입[크기];
        score.txt[0] = 90;
        score.txt[1] = 88;
        score.txt[2] = 70;*/

        //int sum = score.txt[0] + score.txt[1] + score.txt[2];

        int sum = 0;
        for(int i = 0; i < score.length; i++) {
            sum += score[i]; // sum = sum + score.txt[i];
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", + (double)sum/score.length);
    }
}
