package cz.spsmb.b3;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.print("Input your number: ");
        int a = sc.nextInt();
        int[] zzz = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < zzz.length; i++) {
            int x = a/zzz[i];
            a = a % zzz[i];
            System.out.println(x + " x " + zzz[i]);
        }
    }
}