public class NewsEntry {
    private String title;
    private String text;
    private int price;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NewsEntry(String title) {
        this.title = title;
    }
}
