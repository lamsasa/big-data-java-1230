package 배열없이진수변경;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("10 진수 : ");
        int ten = Integer.parseInt(br.readLine());

        String binary = Integer.toBinaryString(ten);
        System.out.println("이진수 : " + binary);
        System.out.println("십진수 : " + ten);

    }
}
