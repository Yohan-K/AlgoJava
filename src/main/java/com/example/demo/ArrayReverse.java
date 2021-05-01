package com.example.demo;

import java.util.Scanner;

public class ArrayReverse {

    static void reverse(int[] a) {
        print(a);
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
            print(a);
        }
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
        System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        int[] x = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println("역순 정렬을 마쳤습니다.");

        sum(x);

    }

    static int sum(int[] a) {
        int hap = 0;
        for (int i = 0; i < a.length; i++) {
            hap += a[i];
        }
        System.out.println(hap);
        return hap;
    }
}
