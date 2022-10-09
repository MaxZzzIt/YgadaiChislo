package by.home.maxzzzit;

import java.util.Scanner;

public class YgadaiChislo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Введите загаданное число от 1 до 10: ");
		int chislo;
		chislo = scn.nextInt();
		while (chislo != 7) {
			System.out.print("Попробуйте еще раз: ");	
			chislo = scn.nextInt();
			if (chislo>10 || chislo==0) 
				System.out.print("Введите числа в диапазоне от 1 до 10: ");
			}
			System.out.print("ДА ВЫ УГАДАЛИ ЗАГАДАННОЕ МНОЙ ЧИСЛО 7 !!!");

	}
}
