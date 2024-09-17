public class FootballNewsEntry extends NewsEntry {

    public FootballNewsEntry(String title) {
        super(title);
        this.basePrice = 300;
    }

    public int calculatePrice(boolean mentionsChampionsLeague, boolean mentionsBarcaOrMadrid, boolean mentionsFerranTorresOBenzema) {
        int finalPrice = basePrice;
        if(mentionsChampionsLeague) {
            basePrice += 100;
        }
        if(mentionsBarcaOrMadrid) {
            basePrice += 100;
        }
        if(mentionsFerranTorresOBenzema) {
            basePrice += 50;
        }

    }

}
