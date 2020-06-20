package al.bruno.di;

import al.bruno.model.Dictionary;
import al.bruno.model.MyObjectBox;
import dagger.Provides;
import io.objectbox.Box;
import io.objectbox.BoxStore;

import javax.inject.Singleton;

@dagger.Module
public class DictionaryModule {
    @Singleton
    @Provides
    public String boxName() {
        return "objectbox-dictionary-db";
    }

    @Singleton
    @Provides
    public BoxStore providesBoxStore(String name) {
        return MyObjectBox.builder().name(name).build();
    }

    @Singleton
    @Provides
    public Box<Dictionary> provideBoxDictionary(BoxStore store) {
        return store.boxFor(Dictionary.class);
    }
}
