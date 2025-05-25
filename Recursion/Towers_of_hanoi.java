package Recursion;

import java.util.Scanner;

public class Towers_of_hanoi {
    static void towersOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Move The Disk "+n+" from "+src+" to "+dest);
            return;
        }
        towersOfHanoi(n-1, src, dest, helper);
        System.out.println("Move The Disk "+n+" from "+src+" to "+dest);
        towersOfHanoi(n-1, helper, src, dest);
        }


        public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter number of disks:");
		int n=obj.nextInt();
		obj.close();
		towersOfHanoi(n,"S","H","D");
        }
    }

