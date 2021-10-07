/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 10/7/2021
 *   Time: 9:27 AM
 *   File: Solution.java
 */

package Loops;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                a += (int) Math.pow(2,j)*b;
                System.out.print(a +"");

            }
            System.out.println();
        }
    }
}
