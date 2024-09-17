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
        return "NewsEntry {\n Titular: \n"
                    + title + "\n"
                    + "Text: \n"
                    + text + "\n"
                    + "Preu: \n"
                    + calculatePrice() + "\n"
                    + "Puntuaciò: \n"
                    + calculateRating() + "\n";
    }

}
