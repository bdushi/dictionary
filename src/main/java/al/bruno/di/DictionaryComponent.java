package al.bruno.di;

import al.bruno.App;
import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@dagger.Component(modules = {DictionaryModule.class, DataSourceModule.class})
public interface DictionaryComponent {
    /*@Component.Builder
    interface Builder {
        DictionaryComponent build();
        @BindsInstance
        Builder application(App app);
    }*/
    @Component.Factory
    interface Factory {
        DictionaryComponent create(@BindsInstance App appTest);
    }
    void inject(App app);
}
