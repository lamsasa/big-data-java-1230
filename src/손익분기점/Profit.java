package 손익분기점;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        int cost = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("고정 비용 가변 비용 노트북 가격");
        int fixCost = sc.nextInt();
        int changeableCost = sc.nextInt();
        int sellPrice = sc.nextInt();

        if(changeableCost >= sellPrice) {
            System.out.println("-1");
            return;
        }
        System.out.println((fixCost/(sellPrice - changeableCost)) + 1);
        }
    }

