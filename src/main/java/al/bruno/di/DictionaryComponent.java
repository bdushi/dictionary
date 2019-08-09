package al.bruno.di;

import al.bruno.App;
import al.bruno.data.source.DictionaryDataSource;
import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

//, DataSourceModule.class
@Singleton
@dagger.Component(modules = {DictionaryModule.class})
public interface DictionaryComponent {
    DictionaryDataSource dictionaryDataSource();
    /*@Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(App app);
        DictionaryComponent builder();
    }*/
}
