package com.example.demo;

public class Algo1 {
    static void triangleLB(int n) {
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        System.out.println("왼쪽 위가 직각인 이등변 삼각형");
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        System.out.println("오른쪽 위가 직각인 이등변 삼각형");
        for (int i = 0; i < n; i++) {
            for (int j = 5; j > i; j--) {
                System.out.printf("*");
            }
            System.out.println();
            for (int k = 0; k <= i; k++) {
                System.out.printf(" ");
            }
        }
    }

    static void triangleRB(int n) {
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
        for (int i = 0; i < n; i++) {
            for (int j = 4; j > i; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    static void spira(int n) {
        System.out.println("n단의 피라미드 출력");
        for (int i = 1; i < n; i++) {
            for (int j = 4; j > i; j--) {
                System.out.printf(" ");
            }
            for (int l = 1; l <= (i - 1) * 2 + 1; l++) {
                System.out.printf("*");
            }
            for (int k = 4; k > i; k--) {
                System.out.printf(" ");
            }
            System.out.println();
        }
    }

    static void npira(int n) {
        System.out.println("n단의 숫자 피라미드 출력");
        for (int i = 1; i < n; i++) {
            for (int j = 4; j > i; j--) {
                System.out.printf(" ");
            }
            for (int l = 1; l <= (i - 1) * 2 + 1; l++) {
                System.out.printf("%d", i % 10);
            }
            for (int k = 4; k > i; k--) {
                System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
