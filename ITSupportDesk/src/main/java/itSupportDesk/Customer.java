package itSupportDesk;

public class Customer {
    private Long id;
    private String name;
    private boolean available;

    public Customer(Long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }
}