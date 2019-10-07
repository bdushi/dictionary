package al.bruno.di;

import al.bruno.App;
import al.bruno.data.source.DictionaryDataSource;
import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@dagger.Component(modules = {DictionaryModule.class, DataSourceServiceModule.class})
public interface DictionaryComponent {
    DictionaryDataSource dictionaryDataSource();
}
