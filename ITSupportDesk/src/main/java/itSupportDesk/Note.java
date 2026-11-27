package itSupportDesk;

public class Note {
    private Long id;
    private String name;
    private boolean available;

    public Note(Long id, String name, boolean available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }
}