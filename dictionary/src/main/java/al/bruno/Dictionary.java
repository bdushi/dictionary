package al.bruno;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Dictionary {

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