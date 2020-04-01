package al.bruno.data.source;

import al.bruno.model.Dictionary;

import javax.inject.Inject;
import javax.inject.Singleton;

public class DictionaryRepository {
    private DictionaryDataSource dictionaryDataSource;
    @Inject
    public DictionaryRepository (DictionaryLocalDataSource dictionaryLocalDataSource) {
        this.dictionaryDataSource = dictionaryLocalDataSource;
    }

    public long put(Dictionary entity) {
        return dictionaryDataSource.insert(entity);
    }
}
