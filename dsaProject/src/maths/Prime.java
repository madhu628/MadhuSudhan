package maths;

import java.util.Scanner;

public class Prime {

//	public static void main(String[] args) {
//		int m = 0, flag = 0, n = 13;
//		m = n / 2;
//
//		for (int i = 2; i <= m; i++) {
//			if (n % i == 0) {
//				System.out.println("not prime");
//				flag = 1;
//				break;
//			}
//		}
//		if (flag == 0)
//			System.out.println("prime");
//	}

//	public static void main(String[] args) {
//		int n = 13;
//		boolean isPrime = isPrime(n);
//		int count = countPrimes(n);
//
//		if (isPrime) {
//			System.out.println("prime number");
//		} else {
//			System.out.println("not a prime number");
//		}
//
//		System.out.println(count);
//	}
//
//	private static int countPrimes(int n) {
//		int cnt = 0;
//		for (int i = 2; i < n; i++) {
//			if (isPrime(i)) {
//				cnt++;
//			}
//		}
//		return cnt;
//	}
//
//	private static boolean isPrime(int n) {
//		if (n <= 1)
//			return false;
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        for(int i = 2; i< input; i++){
            if(input % i == 0){
                count = count + 1;
                break;
            }
        }
        if(count==0 && input>1){
            System.out.println(input+" is a prime number");
        } else {
            System.out.println(input+" is not a prime number");
        }
    }
}
