package itSupportDesk;

public class Agent {

    private Long id;
    private String name;
    private boolean available;

    public Agent(Long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }
}