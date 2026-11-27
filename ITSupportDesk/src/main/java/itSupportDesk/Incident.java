package itSupportDesk;

public class Incident {
    private Long id;
    private String name;
    private boolean available;

    public Incident(Long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }
}
