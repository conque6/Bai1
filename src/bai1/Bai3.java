/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author tan
 */
public class Bai3 {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int t = n + 1;
        int[] a = new int[t];
        a[0] = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        int count = 0;
        if (count >= 90) {
            count = 90;
        }
        if (t > 0 && t <= 91) {
            for (int i = 1; i < a.length; i++) {
                if (a.length == 2 && a[1] < 15) {
                    count = 15 + a[1];
                    break;
                }

                if (a[i] - a[i - 1] > 15) {
                    count = a[i - 1] + 15;
                    break;

                } else {
                    count += a[i] - a[i - 1];
                    if (count < 90) {
                        count = a[i] + 15;

                    } else {
                        count = 90;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
