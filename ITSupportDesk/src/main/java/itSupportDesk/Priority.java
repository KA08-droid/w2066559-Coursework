package itSupportDesk;

public class Priority {
    private Long id;
    private String name;
    private boolean available;

    public Priority(Long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }
}