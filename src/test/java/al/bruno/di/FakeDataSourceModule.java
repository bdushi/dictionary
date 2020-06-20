package al.bruno.di;

import al.bruno.data.source.DictionaryDataSource;
import al.bruno.data.source.DictionaryLocalDataSource;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class FakeDataSourceModule {
    @Binds
    public abstract DictionaryDataSource providesDictionaryDataSource(DictionaryLocalDataSource dictionaryLocalDataSource);
}
