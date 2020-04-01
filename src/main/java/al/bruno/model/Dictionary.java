package al.bruno.model;

import al.bruno.util.DateConverter;
import io.objectbox.annotation.Convert;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

import javax.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class Dictionary {
    @Id
    @GeneratedValue
    private long id;
    private String text;
    private String comment;
    private Date date;
    
    public Dictionary(String text, String comment) {
        this.text = text;
        this.comment = comment;
        this.date = new Date();
    }

    public Dictionary() {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return id + " " + text + " " + comment + date;
    }
}