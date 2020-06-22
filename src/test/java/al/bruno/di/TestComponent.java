package al.bruno.di;

import al.bruno.AppTest;
import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

/**
 * https://dagger.dev/dev-guide/testing.html
 */

@Singleton
@dagger.Component(modules = {FakeModule.class, FakeDataSourceModule.class})
public interface TestComponent extends DictionaryComponent {
    @Component.Factory
    interface Factory {
        TestComponent create(@BindsInstance AppTest appTest);
    }
    void inject(AppTest app);
}