package al.bruno.di;

import al.bruno.model.Dictionary;
import al.bruno.model.MyObjectBox;
import dagger.Provides;
import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.objectbox.DebugFlags;

import javax.inject.Singleton;
import java.io.File;
import java.io.IOException;

@dagger.Module
public class FakeModule {
    @Singleton
    @Provides
    public static String boxName() {
        return "test-objectbox-dictionary-db";
    }

    @Singleton
    @Provides
    public BoxStore providesBoxStore(String name) {
        return MyObjectBox
                .builder()
                .name(name)
                .debugFlags(DebugFlags.LOG_QUERIES | DebugFlags.LOG_QUERY_PARAMETERS)
                .build();
        /*File tempFile = File.createTempFile(name, "");
        return MyObjectBox.builder()
                // add directory flag to change where ObjectBox puts its database files
                //.directory(tempFile)
                // optional: add debug flags for more detailed ObjectBox log output
                .debugFlags(DebugFlags.LOG_QUERIES | DebugFlags.LOG_QUERY_PARAMETERS)
                .build();*/
    }

    @Singleton
    @Provides
    public Box<Dictionary> provideBoxDictionary(BoxStore store) {
        return store.boxFor(Dictionary.class);
    }
}
