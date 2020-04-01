package al.bruno.data.source;

import al.bruno.model.Dictionary;
import io.objectbox.Box;
import javax.inject.Inject;
import java.util.List;

public class DictionaryLocalDataSource implements DictionaryDataSource {

    private final Box<Dictionary> dictionaryBox;

    @Inject
    public DictionaryLocalDataSource(Box<Dictionary> dictionaryBox) {
        this.dictionaryBox = dictionaryBox;
    }

    @Override
    public long put(Dictionary entity) {
        return dictionaryBox.put(entity);
    }

    @Override
    public List<Dictionary> list() {
        return dictionaryBox.getAll();
    }
}
