public class Card extends Payment{
    Integer numberCard;
    String dataCard;
    String cvv;

    public Card(Integer id, Integer numberCard, String dataCard, String cvv){
        super(id);
        this.numberCard = numberCard;
        this.dataCard = dataCard;
        this.cvv = cvv;
    }
}
