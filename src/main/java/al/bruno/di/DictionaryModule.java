package al.bruno.di;

import al.bruno.data.source.DictionaryDataSource;
import al.bruno.data.source.DictionaryLocalDataSource;
import al.bruno.model.Dictionary;
import al.bruno.model.MyObjectBox;
import dagger.Provides;
import dagger.Module;
import io.objectbox.Box;
import io.objectbox.BoxStore;

import javax.inject.Singleton;

@Module
public class DictionaryModule {
   /* @Provides
    @Singleton
    public BoxStore providesBoxStore() {
        return MyObjectBox.builder().name("objectbox-dictionary-db").build();
    }

    @Singleton
    @Provides
    public Box<Dictionary> provideBoxDictionary(BoxStore store) {
        return store.boxFor(Dictionary.class);
    }*/

    @Singleton
    @Provides
    public DictionaryDataSource providesDataSource() {
        BoxStore boxStore = MyObjectBox.builder().name("objectbox-dictionary-db").build();
        Box<Dictionary> dictionaryBox = boxStore.boxFor(Dictionary.class);
        return new DictionaryLocalDataSource(dictionaryBox);
    }
}
