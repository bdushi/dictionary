package al.bruno.data.source;

import al.bruno.model.Dictionary;
import io.objectbox.Box;
import io.objectbox.BoxStore;

import javax.inject.Inject;

public class DictionaryLocalDataSource implements DictionaryDataSource {

    private final Box<Dictionary> box;
    @Inject
    public DictionaryLocalDataSource(BoxStore boxStore) {
        this.box = boxStore.boxFor(Dictionary.class);
    }

    @Override
    public long put(Dictionary entity) {
        return box.put(entity);
    }
}
