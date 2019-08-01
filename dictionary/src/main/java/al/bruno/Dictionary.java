package al.bruno;

@Entity
public class Dictionary {
    @Id
    public long id;

    public String text;
    public String comment;
    public Date date;

    public Dictionary(long id, String text, String comment, Date date) {
        this.id = id;
        this.text = text;
        this.comment = comment;
        this.date = date;
    }

    public Dictionary() {
    }
}