package al.bruno;

<<<<<<< HEAD
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Dictionary {
=======
@Entity
public class Dictionary {
    @Id
    public long id;
>>>>>>> 30b7c6bfe19eabdbee52cb89c353d1449b1161a6

    public String text;
    public String comment;
    public Date date;
<<<<<<< HEAD
    
=======

>>>>>>> 30b7c6bfe19eabdbee52cb89c353d1449b1161a6
    public Dictionary(long id, String text, String comment, Date date) {
        this.id = id;
        this.text = text;
        this.comment = comment;
        this.date = date;
    }
<<<<<<< HEAD
    
=======

>>>>>>> 30b7c6bfe19eabdbee52cb89c353d1449b1161a6
    public Dictionary() {
    }
}