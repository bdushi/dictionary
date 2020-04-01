package al.bruno.data.source;

import al.bruno.model.Dictionary;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

public class DictionaryRepository {

    private final DictionaryDataSource dictionaryLocalDataSource;

    @Inject
    public DictionaryRepository (DictionaryLocalDataSource dictionaryLocalDataSource) {
        this.dictionaryLocalDataSource = dictionaryLocalDataSource;
    }

    public long put(Dictionary entity) {
        return dictionaryLocalDataSource.put(entity);
    }

    public List<Dictionary> list() {
        return dictionaryLocalDataSource.list();
    }
}
