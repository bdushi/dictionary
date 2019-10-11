package al.bruno.di;

import al.bruno.data.source.DictionaryRepository;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DictionaryModule.class})
public interface DictionaryComponent {
    DictionaryRepository dictionaryRepository();
}