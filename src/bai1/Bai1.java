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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            a[i] = s;
        }
        if (a.length == 1) {
            if(a[0] == 1){
                System.out.print("YES");
            }else{
                System.out.println("NO");
            }
            
        } else {
            for (int z = 0; z < n; z++) {
                if (a[z] == 0) {
                    count++;
                }
            }
            if (count <= 1&&count!=0) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        }

    }

}
