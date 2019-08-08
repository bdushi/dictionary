package al.bruno;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

import java.util.Date;

@Entity
public class Dictionary {
    @Id
    private long id;
    private String text;
    private String comment;
    private Date date;
    
    public Dictionary(String text, String comment) {
        this.text = text;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }
    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }
    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return id + " " + text + " " + comment;
    }
}