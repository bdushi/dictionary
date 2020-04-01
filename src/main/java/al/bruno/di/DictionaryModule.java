package al.bruno.di;

import dagger.Module;
import dagger.Provides;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.inject.Singleton;

@Module
public class DictionaryModule {
    @Singleton
    @Provides
    public SessionFactory sessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    @Provides
    @Singleton
    public Session session(SessionFactory sessionFactory) {
        return sessionFactory.openSession();
    }
}
