package Arrays;

import java.util.Scanner;

/*
Program to calcualte sum of even elements present in an array.
Program to calcualte sum of odd elements present in an array.
Program to calcualte sum of +ve elements present in an array.
Program to calcualte sum of -ve elements present in an array.
Program to calcualte sum of elements which are divisible by 2 and 3 present in an array.
Program to calcualte sum of prime elements present in an array.
Program to calcualte sum of all elements factorials present in an array.

 */



public class Arrays3 {
    static int evenSum(int a[]){
        int sum=0;

        if(a.length>0)
            for(int i :a)
                if(i%2==0)
                    sum = sum+i;
        return sum;
        
    }

    static int oddSum(int a[]){
        int sum=0;

        if(a.length>0)
            for(int i :a)
                if(i%2!=0)
                    sum = sum+i;
        return sum;
        
    }

    static int positiveSum(int a[]){
        int sum=0;

        if(a.length>0)
            for(int i :a)
                if(i>0)
                    sum = sum+i;
        return sum;
        
    }

    static int negativeSum(int a[]){
        int sum=0;

        if(a.length>0)
            for(int i :a)
                if(i<0)
                    sum = sum+i;
        return sum;
        
    }

    static int divBy2and3Sum(int a[]){
        int sum=0;

        if(a.length>0)
            for(int i :a)
                if(i%2==0 && i%3==0)
                    sum = sum+i;
        return sum;
        
    }

    static int primeSum(int a[]){
        int sum=0;

        if(a.length>0)
            for(int i :a){
            
                int factors = 0;
                for(int j=1; j<=i; j++){
                    if(i%j==0)
                        factors++;
                }
                if(factors==2)
                    sum = sum+i;
                }
        return sum;
        
    }

    static int factorialSum(int a[]){
        int sum=0;

        if(a.length>0)
            for(int i :a){
                int fact = 1;
                for(int j = 1; j<=i; j++)
                    fact = fact*j;
                    sum = sum+fact;
        
                }
        return sum;
        
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

		System.out.println("Enter array size:");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter "+size+" elements...");
		for(int i=0;i<a.length;i++){
			a[i] = obj.nextInt();
		}
        obj.close();

        System.out.println("Sum of even : "+evenSum(a));
        System.out.println("Sum of odd : "+oddSum(a));

        System.out.println("Sum of positive : "+positiveSum(a));
        System.out.println("Sum of negative : "+negativeSum(a));

        System.out.println("sum of divisible by 2 and 3 is : "+divBy2and3Sum(a) );

        System.out.println("Sum of prime : "+primeSum(a));

        System.out.println("sum of factorials of all is : "+ factorialSum(a));



    }
}
