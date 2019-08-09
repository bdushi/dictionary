package al.bruno.di;

import al.bruno.data.source.DictionaryDataSource;
import al.bruno.data.source.DictionaryLocalDataSource;
import al.bruno.model.Dictionary;
import al.bruno.model.MyObjectBox;
import dagger.Binds;
import dagger.Provides;
import io.objectbox.Box;
import io.objectbox.BoxStore;

import javax.inject.Singleton;

@dagger.Module
public abstract class DictionaryModule {
    @Provides
    @Singleton
    public static BoxStore providesBoxStore(String name) {
        return MyObjectBox.builder().name("objectbox-dictionary-db").build();
    }

    @Singleton
    @Provides
    public static Box<Dictionary> provideBoxDictionary(BoxStore store) {
        return store.boxFor(Dictionary.class);
    }

    @Singleton
    @Binds
    public abstract DictionaryDataSource provideDictionaryLocalDataSource(DictionaryLocalDataSource dataSource);
}
