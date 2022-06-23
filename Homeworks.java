package com.turkcell;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// kullanıcı tarafından girilen bir kelimeyi tersten yazdıran Algoritma ?
		// yazdığınız kelime kaç harfli ?
		System.out.print("Bir kelime giriniz: ");
		String myStr = scan.next();
		System.out.println("Ters metin: " + reverseStr(myStr));
		System.out.println("Ters metin harf sayisi: " + reverseStr(myStr).length());
		
		// kullanıcı tarafından girilen bir parola için ilk ve son harfi haricinde *
		// eklensin
		System.out.print("Metin Giriniz: ");
		String text = scan.next();
		System.out.println("Sifreli metin: " + eraseLeter(text));
		
		// Faktoriyel hesaplama
		System.out.print("Bir sayı giriniz: ");
		int number = scan.nextInt();
		System.out.println("Faktoriyel: " + faktoriel(number));
		
		// Fibonacci hesaplama
		System.out.print("Bir sayı giriniz: ");
		int number2 = scan.nextInt();
		fibonacci(number2);
		
		// Girilen sayının asal sayı olup olmadığı kontrolü
		System.out.print("Bir rakam giriniz: ");
		int myNum = scan.nextInt();
		if (isPrime(myNum)) {
			System.out.println("Girdiginiz sayi asaldir.");
		} else {
			System.out.println("Girdiginiz sayi asal degildir.");
			
		}
	}
	
	public static String reverseStr(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
			
		}
		return result;
	}
	
	public static String eraseLeter(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 || i == (str.length() - 1)) {
				result += str.charAt(i);
			} else {
				result += "*";
			}
		}
		return result;
	}
	
	public static int faktoriel(int num) {
		int result = 1;
		for (int i = num; i > 0; i--) {
			result *= i;
		}
		return result;
	}
	
	public static void fibonacci(int num) {
		int temp1 = 1;
		int temp2 = 1;
		for (int i = 1; i <= num; i++) {
			System.out.print(temp1 + " ");
			int temp3 = temp1 + temp2;
			temp1 = temp2;
			temp2 = temp3;
			
		}
	}
	
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
