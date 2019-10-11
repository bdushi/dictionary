package al.bruno.data.source;

import al.bruno.model.Dictionary;
import io.objectbox.Box;

import javax.inject.Inject;
import javax.inject.Singleton;

public class DictionaryLocalDataSource implements DictionaryDataSource {

    private final Box<Dictionary> box;
    public DictionaryLocalDataSource(Box<Dictionary> box) {
        this.box = box;
    }

    @Override
    public long put(Dictionary entity) {
        return box.put(entity);
    }
}
