package al.bruno.di;

import al.bruno.App;
import al.bruno.data.source.DictionaryDataSource;
import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

//, DataSourceModule.class
@Singleton
@dagger.Component(modules = {DictionaryModule.class, DataSourceModule.class})
public interface DictionaryComponent {
    // DictionaryDataSource dictionaryDataSource();
    @Component.Builder
    interface Builder {
        DictionaryComponent build();
        @BindsInstance
        Builder application(App app);
    }
    void inject(App app);
}
