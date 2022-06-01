package lv.alija.zooRulesEngine.model;

public class Visitor {

    private String type;
    private int age;
    private double ticketPrice;
    private boolean haveCertificate;

    public Visitor(String type, int age, double ticketPrice, boolean haveCertificate) {
        this.type = type;
        this.age = age;
        this.ticketPrice = ticketPrice;
        this.haveCertificate = haveCertificate;
    }

    public boolean isHaveCertificate() {
        return haveCertificate;
    }

    public void setHaveCertificate(boolean haveCertificate) {
        this.haveCertificate = haveCertificate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Visitor() {
    }
}
