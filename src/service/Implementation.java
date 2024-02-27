package service;

import repository.bookrepo;
import repository.bookrepoimplement;

public class Implementation implements bookservice{
    bookrepo r = (bookrepo) new bookrepoimplement();
    @Override
    public void bookticket(String name, int busno, int seats) {
        if(r.seats(busno) - seats >=0){
            r.book(busno,seats);
        }
        else{
            System.out.println("Bus is full, Try another Bus");
        }
    }

    @Override
    public void cancelticket(int busno,int seats) {
        r.cancel(busno,seats);
    }

    @Override
    public void checkavailable() {
        r.displaybus();
    }
    @Override
    public void initializebus() {
     r.initializebus();
    }
    @Override
    public void displaybus() {
        r.displaybus();
    }
}
