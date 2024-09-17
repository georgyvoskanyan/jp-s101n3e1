public abstract class NewsEntry {
    private String title;
    private String text;
    private int rating;
    protected int basePrice;

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
                    + rating + "\n"
                    + "Puntuaciò: \n"
                    + basePrice + "\n";
    }

}
