package itSupportDesk;

public class ChangeRequest {
    private Long id;
    private String name;
    private boolean available;

    public ChangeRequest(Long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }
}