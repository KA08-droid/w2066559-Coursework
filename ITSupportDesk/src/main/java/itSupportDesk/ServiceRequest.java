package itSupportDesk;

public class ServiceRequest {
    private Long id;
    private String name;
    private boolean available;

    public ServiceRequest(Long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }
}