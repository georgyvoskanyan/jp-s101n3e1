import java.util.Objects;

public abstract class NewsEntry {
    private String title;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NewsEntry(String title) {
        this.title = title;
    }

    abstract public int calculatePrice();
    abstract public int calculateRating();

    @Override
    public String toString() {
        return "NewsEntry {\n  Titular: \n"
                    + title + "\n"
                    + "  Text: \n"
                    + text + "\n"
                    + "  Preu: \n"
                    + calculatePrice() + "\n"
                    + "  Puntuaciò: \n"
                    + calculateRating() + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsEntry newsEntry = (NewsEntry) o;
        return Objects.equals(title, newsEntry.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}
