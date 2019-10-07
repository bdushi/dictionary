package al.bruno.di;

import al.bruno.data.source.DictionaryDataSource;
import al.bruno.data.source.DictionaryLocalDataSource;
import al.bruno.model.Dictionary;
import dagger.Module;
import dagger.Provides;
import io.objectbox.Box;

@Module
public class DataSourceServiceModule {
    @Provides
    public DictionaryDataSource providesDictionaryDataSource(Box<Dictionary> dictionaryBox) {
        return new DictionaryLocalDataSource(dictionaryBox);
    }
}
