package al.bruno.di;

import al.bruno.App;
import al.bruno.data.source.DictionaryRepository;
import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@dagger.Component(modules = {DictionaryModule.class, DataSourceModule.class})
public interface DictionaryComponent {
    @Component.Builder
    interface Builder {
        DictionaryComponent build();
        @BindsInstance
        Builder application(App app);
    }
    void inject(App app);
}
