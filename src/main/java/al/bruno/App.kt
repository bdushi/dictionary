/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package al.bruno

import io.objectbox.Box
import io.objectbox.BoxStore

class App {
    val greeting: String
    get() {
        return "Hello world."
    }
}
fun main(args: Array<String>) {
    println(App().greeting)
    val store : BoxStore = MyObjectBox.builder().name("objectbox-notes-db").build()
    val box : Box<Dictionary> = store.boxFor(Dictionary::class.java)

    val text:String = if (args.isNotEmpty()) {
        //String.join(" ", args)
        args.toString()
    } else {
        "No text given"
    }
    box.put(Dictionary(text))
    println(" notes in ObjectBox database:" + box.count())
    for (dictionary in box.all) {
        println(dictionary.toString())
    }
    store.close()
}
