package al.bruno.data.source;

import al.bruno.model.Dictionary;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DictionaryRepository implements DictionaryDataSource {
    @Inject
    private DictionaryDataSource dictionaryDataSource;
    public DictionaryRepository (DictionaryDataSource dictionaryDataSource) {
        this.dictionaryDataSource = dictionaryDataSource;
    }

    @Override
    public long put(Dictionary entity) {
        return dictionaryDataSource.put(entity);
    }
}
