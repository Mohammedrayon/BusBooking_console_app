package controller;

import model.Bus;
import service.Implementation;
import service.bookservice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Bus Booking app");
        bookservice q = new Implementation();
        q.initializebus();
        Scanner sc  = new Scanner(System.in);
        while(true){
            q.displaybus();
            System.out.print("1.Book a ticket\n2.cancel a ticket\n3.check availability\n4.Exit\n");
            int a = sc.nextInt();
            if(a==4) break;
            switch(a){
                case 1:
                    System.out.println("Enter Passenger Name :");
                    String name = sc.next();
                    System.out.println("Enter Bus No : ");
                    int n = sc.nextInt();
                    System.out.println("Enter no of seats");
                    int b = sc.nextInt();
                    q.bookticket(name,n,b);
                    break;
                case 2:
                    System.out.println("Enter Bus No : ");
                    int n1 = sc.nextInt();
                    System.out.println("Enter seats to cancel : ");
                    int n2 = sc.nextInt();
                    q.cancelticket(n1,n2);
                    break;
                case 3:
                    q.checkavailable();
                    break;
                default:
                    break;
            }
        }
    }
}


