/*
 * https://dagger.dev/testing.html
 * https://docs.objectbox.io/java-desktop-apps
 * https://www.vogella.com/tutorials/JUnit/article.html
 */
package al.bruno;

import al.bruno.data.source.DictionaryRepository;
import al.bruno.di.DaggerTestComponent;
import al.bruno.model.Dictionary;
import io.objectbox.BoxStore;
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
    @Inject
    BoxStore boxStore;

    @Before
    public void setUp() {
        DaggerTestComponent.factory().create(this).inject(this);
    }

    @After
    public void tearDown() {
        if (boxStore != null && !boxStore.isClosed()) {
            boxStore.close();
            boxStore.deleteAllFiles();
        }
    }

    @Test
    public void testGet() {
        assertTrue(dictionaryRepository.list().isEmpty());
    }

    @Test
    public void testInsert() {
        assertNotEquals(dictionaryRepository.put(new Dictionary("test", "test")), -1);
    }

    @Test
    public void exampleTest() {
        // get a box and use ObjectBox as usual
        // Box<Note> noteBox = store.boxFor(Note.class);
        // assertEquals(...);
    }
}
