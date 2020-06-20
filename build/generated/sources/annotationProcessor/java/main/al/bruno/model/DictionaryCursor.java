package al.bruno.model;

import al.bruno.util.DateConverter;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;
import java.util.Date;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * ObjectBox generated Cursor implementation for "Dictionary".
 * Note that this is a low-level class: usually you should stick to the Box class.
 */
public final class DictionaryCursor extends Cursor<Dictionary> {
    @Internal
    static final class Factory implements CursorFactory<Dictionary> {
        @Override
        public Cursor<Dictionary> createCursor(io.objectbox.Transaction tx, long cursorHandle, BoxStore boxStoreForEntities) {
            return new DictionaryCursor(tx, cursorHandle, boxStoreForEntities);
        }
    }

    private static final Dictionary_.DictionaryIdGetter ID_GETTER = Dictionary_.__ID_GETTER;

    private final DateConverter dateConverter = new DateConverter();

    private final static int __ID_text = Dictionary_.text.id;
    private final static int __ID_comment = Dictionary_.comment.id;
    private final static int __ID_date = Dictionary_.date.id;

    public DictionaryCursor(io.objectbox.Transaction tx, long cursor, BoxStore boxStore) {
        super(tx, cursor, Dictionary_.__INSTANCE, boxStore);
    }

    @Override
    public final long getId(Dictionary entity) {
        return ID_GETTER.getId(entity);
    }

    /**
     * Puts an object into its box.
     *
     * @return The ID of the object within its box.
     */
    @Override
    public final long put(Dictionary entity) {
        String text = entity.getText();
        int __id1 = text != null ? __ID_text : 0;
        String comment = entity.getComment();
        int __id2 = comment != null ? __ID_comment : 0;
        Date date = entity.getDate();
        int __id3 = date != null ? __ID_date : 0;

        long __assignedId = collect313311(cursor, entity.getId(), PUT_FLAG_FIRST | PUT_FLAG_COMPLETE,
                __id1, text, __id2, comment,
                0, null, 0, null,
                __id3, __id3 != 0 ? dateConverter.convertToDatabaseValue(date) : 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0);

        entity.setId(__assignedId);

        return __assignedId;
    }

}
