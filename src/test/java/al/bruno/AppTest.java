/*
 * https://dagger.dev/testing.html
 * https://docs.objectbox.io/java-desktop-apps
 * https://www.vogella.com/tutorials/JUnit/article.html
 */
package al.bruno;

import al.bruno.data.source.DictionaryRepository;
import al.bruno.di.DaggerTestComponent;
import al.bruno.model.Dictionary;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class AppTest {

    @Inject
    DictionaryRepository dictionaryRepository;

    /*@Rule
    DaggerTestComponent daggerTestComponent;*/

    @Before
    public void setUp() {
        DaggerTestComponent.factory().create(this).inject(this);
    }

    @After
    public void tearDown() throws Exception {
        /*if (store != null) {
            store.close();
            store.deleteAllFiles();
        }*/
    }

    @Test
    public void testPutAndGet() {
        assertFalse(dictionaryRepository.list().size() > 10);
    }

    @Test
    public void testAppHasAGreeting() {
        assertEquals(dictionaryRepository.put(new Dictionary("test", "test")), 3);
    }

    @Test
    public void exampleTest() {
        // get a box and use ObjectBox as usual
        // Box<Note> noteBox = store.boxFor(Note.class);
        // assertEquals(...);
    }
}
