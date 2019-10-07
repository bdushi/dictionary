package al.bruno.di;

import al.bruno.model.Dictionary;
import al.bruno.model.MyObjectBox;
import dagger.Provides;
import io.objectbox.Box;
import io.objectbox.BoxStore;

import javax.inject.Singleton;

@dagger.Module
public class DictionaryModule {
    @Provides
    @Singleton
    public BoxStore providesBoxStore() {
        return MyObjectBox.builder().name("objectbox-dictionary-db").build();
    }

    @Singleton
    @Provides
    public Box<Dictionary> provideBoxDictionary(BoxStore store) {
        return store.boxFor(Dictionary.class);
    }
}
