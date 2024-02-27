package repository;

import model.Bus;

import java.util.ArrayList;

public class bookrepoimplement implements bookrepo{
    static ArrayList<Bus> buses = new ArrayList<>();
    public void initializebus(){
        buses.add(new Bus(1,"nkl","slm",5));
        buses.add(new Bus(2,"slm","nkl",5));
    }
    public void displaybus(){
        for(Bus b : buses){
            System.out.println("Bus no : " + b.getBusno() + " From : " + b.getFrom() + " To : " + b.getTo() + " capacity : " + b.getCapacity());
        }
    }
    public void book(int busno,int seats){
        for(Bus b : buses){
            if(b.getBusno()==busno){
                b.setCapacity(b.getCapacity()-seats);
                break;
            }
        }
        System.out.println("your ticket is Booked");
    }
    public void cancel(int busno, int seats){
        for(Bus b : buses){
            if(b.getBusno()==busno){
                b.setCapacity(b.getCapacity()+seats);
                break;
            }
        }
        System.out.println("Your ticket is cancelled");
    }
    public int seats(int busno){
        for(Bus b : buses){
            if(b.getBusno()==busno){
                return b.getCapacity();
            }
        }
        return -1;
    }
}
