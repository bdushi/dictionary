package al.bruno.data.source;

import al.bruno.model.Dictionary;

import java.util.List;

public interface DictionaryDataSource {
    long put(Dictionary entity);
    List<Dictionary> list();
}
