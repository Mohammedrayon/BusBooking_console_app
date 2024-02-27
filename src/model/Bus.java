package model;

public class Bus {
    private int busno;

    public Bus(int i, String from, String to, int cap) {
        this.busno=i;
        this.from = from;
        this.to = to;
        this.capacity = cap;
    }

    public int getBusno() {
        return busno;
    }

    public void setBusno(int busno) {
        this.busno = busno;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int i) {
        this.capacity = i;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    private int capacity;
    private String from;
    private String to;

}
