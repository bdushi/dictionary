package al.bruno.di;

import al.bruno.data.source.DictionaryDataSource;
import al.bruno.data.source.DictionaryLocalDataSource;
import dagger.Binds;
import dagger.Module;

import javax.inject.Singleton;

@Module
abstract class DataSourceModule {
    @Singleton
    @Binds
    abstract DictionaryDataSource provideEventDataSource(DictionaryLocalDataSource dataSource);
}