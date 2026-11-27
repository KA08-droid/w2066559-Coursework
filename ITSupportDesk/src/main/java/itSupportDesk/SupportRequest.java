package itSupportDesk;

public class SupportRequest {
    private Long id;
    private String name;
    private boolean available;

    public SupportRequest(Long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }
}
