/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package al.bruno;

import io.objectbox.*;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }
    public static void main(String[] args) {
        BoxStore store = MyObjectBox.builder().name("objectbox-notes-db").build();
        Box<Dictionary> box = store.boxFor(Dictionary.class);

        String text = args.length > 0 ? String.join(" ", args) : "No text given";
        box.put(new Dictionary(text));

        System.out.println(box.count() + " notes in ObjectBox database:");
        for (Dictionary note : box.getAll()) {
            System.out.println(note.toString());
        }
        store.close();
    }
}