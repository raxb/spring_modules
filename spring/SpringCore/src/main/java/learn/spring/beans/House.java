package learn.spring.beans;

public class House {

    private final Record record;

    public House(Record record) {
        this.record = record;
    }

    public void constructHouse() {
        System.out.println("Constructed House...");
        record.read();
    }
}
