package al.bruno.data.source;

import al.bruno.model.Dictionary;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DictionaryLocalDataSource implements DictionaryDataSource {

    private DictionaryDataSource dictionaryDataSource;
    @Inject
    public DictionaryLocalDataSource(DictionaryDataSource dictionaryDataSource) {
        this.dictionaryDataSource = dictionaryDataSource;
    }

    @Override
    public long put(Dictionary entity) {
        return dictionaryDataSource.put(entity);
    }
}
