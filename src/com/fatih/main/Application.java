package com.fatih.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int yarıCap,merkezAcı;
		double pi = 3.14;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yarıcap giriniz: ");
		yarıCap = scan.nextInt();
		
		System.out.println("Merkez Aci Olcusu giriniz");
		merkezAcı = scan.nextInt();
		
		double daireAlan = pi*yarıCap*yarıCap;
		double daireCevre = 2*pi*yarıCap;
		double daireDilimAlan = (pi*(yarıCap*yarıCap)*merkezAcı)/360;
		
		System.out.println("Dairenin Alanı: "+daireAlan+"\nDairenin Cevresi: "+daireCevre);
		System.out.println("Daire Dilimin Alani: "+daireDilimAlan);

	}

}
