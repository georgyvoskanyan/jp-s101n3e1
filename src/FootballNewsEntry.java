public class FootballNewsEntry extends NewsEntry {
    private int basePrice = 300;

    public FootballNewsEntry(String title, String competition, String club, String player) {
        super(title);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    protected String competition;
    protected String club;
    protected String player;

    public int calculatePrice() {
        int finalPrice = basePrice;
        if(competition.contains("Lliga de Campions")) {
            basePrice += 100;
        }
        if(club.contains("Barça") || club.contains("Madrid")) {
            basePrice += 100;
        }
        if(player.contains("Ferran Torres") || player.contains("Benzema")) {
            basePrice += 50;
        }
        return basePrice;
    }

}
