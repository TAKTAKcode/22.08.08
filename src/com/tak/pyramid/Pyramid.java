package com.tak.pyramid;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("피라미드를 표시합니다.");
        System.out.print("단수는? : ");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - 1; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
