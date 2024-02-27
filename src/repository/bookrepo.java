package repository;

public interface bookrepo {

    void initializebus();

    void displaybus();

    void book(int busno,int seats);

    void cancel(int busno, int seats);

    int seats(int busno);
}
