package al.bruno.data.source;

import al.bruno.model.Dictionary;

import javax.inject.Inject;

public class DictionaryRepository  {
    private final DictionaryDataSource dictionaryDataSource;
    @Inject
    public DictionaryRepository(DictionaryDataSource dictionaryDataSource) {
        this.dictionaryDataSource = dictionaryDataSource;
    }

    public long save(Dictionary entity) {
       return dictionaryDataSource.put(entity);
    }
}
