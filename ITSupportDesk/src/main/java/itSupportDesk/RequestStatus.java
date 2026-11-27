package itSupportDesk;

public class RequestStatus {
    private Long id;
    private String name;
    private boolean available;

    public RequestStatus(Long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }
}