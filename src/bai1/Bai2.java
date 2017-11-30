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
public class Bai2 {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int[] a = new int[n];
        int h = r.nextInt();
        int count = 0;
        if (n > 0 && n <= 1000 && h > 0 && h <= 1000) {
            for (int z = 0; z < n; z++) {
                a[z] = r.nextInt();
                if (a[z] > h) {
                    count += 2;
                } else {
                    count += 1;
                }
            }
            System.out.println(count);
        }else{
            System.out.println("ERROR");
        }

    }
}
