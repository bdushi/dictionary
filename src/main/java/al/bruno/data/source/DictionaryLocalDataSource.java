package al.bruno.data.source;

import al.bruno.model.Dictionary;
import org.hibernate.Session;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

public class DictionaryLocalDataSource implements DictionaryDataSource {
    private final Session session;
    @Inject
    public DictionaryLocalDataSource(Session session) {
        this.session = session;
    }
    @Override
    public long insert(Dictionary entity) {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        return 1;
    }

    @Override
    public List dictionary() {
        return session.createQuery("FROM Dictionary").getResultList();
    }
}
