package al.bruno.di;

import al.bruno.data.source.DictionaryDataSource;
import al.bruno.data.source.DictionaryLocalDataSource;
import dagger.Binds;
import dagger.Module;

import javax.inject.Singleton;

@Module
public abstract class DataSourceModule {
    @Binds
    public abstract DictionaryDataSource providesDictionaryDataSource(DictionaryLocalDataSource dictionaryLocalDataSource);
}