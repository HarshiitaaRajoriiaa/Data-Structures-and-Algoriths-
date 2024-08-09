package BASICS;
import java.util.Scanner;
//TODO:https://codeforces.com/problemset/problem/1807/A
/*
* You are given three integers a, b, and c such that exactly one of these two equations is true:
* a+b=c , a−b=c
* Output + if the first equation is true, and - otherwise.
* Input:The first line contains a single integer t (1≤t≤162) — the number of test cases.
* The description of each test case consists of three integers a, b, c(1≤a,b≤9, −8≤c≤18). The additional constraint on the input: it will be generated so that exactly one of the two equations will be true.
*Output :For each test case, output either + or - on a new line, representing the correct equation.
 */


public class PlusandMinus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            checkEquation(a, b, c);
        }
        s.close();
    }
    public static void checkEquation(int a, int b, int c) {
        if (a + b == c) {
            System.out.println("+");
        } else if (a - b == c) {
            System.out.println("-");
        }
    }
}

