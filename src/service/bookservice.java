package service;

public interface bookservice {
    public void displaybus();
    public void initializebus();
    public void bookticket(String name, int busno, int seats);
    public void cancelticket(int busno,int seats);
    public void checkavailable();
}
