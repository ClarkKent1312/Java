package com.capg.work;

import java.util.Scanner;

public class CardController {

	public static void main(String[] args) {
		//code here
        Scanner sc = new Scanner(System.in);
        int noOfCards = sc.nextInt();
        
        for (int i = 0; i<noOfCards; i++){
                Long a = sc.nextLong();sc.nextLine();
                String b = sc.next();
                Long c = sc.nextLong();sc.nextLine();
                String d = sc.next();
                String e = sc.next();
                Double f = sc.nextDouble();
                Boolean g = sc.nextBoolean();
                Card cc = new Card(a, b, c, d, e, f, g);
        }

	}

}
