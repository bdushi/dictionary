package al.bruno.model;

import io.objectbox.BoxStore;
import io.objectbox.BoxStoreBuilder;
import io.objectbox.ModelBuilder;
import io.objectbox.ModelBuilder.EntityBuilder;
import io.objectbox.model.PropertyFlags;
import io.objectbox.model.PropertyType;


// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.
/**
 * Starting point for working with your ObjectBox. All boxes are set up for your objects here.
 * <p>
 * First steps (Android): get a builder using {@link #builder()}, call {@link BoxStoreBuilder#androidContext(Object)},
 * and {@link BoxStoreBuilder#build()} to get a {@link BoxStore} to work with.
 */
public class MyObjectBox {

    public static BoxStoreBuilder builder() {
        BoxStoreBuilder builder = new BoxStoreBuilder(getModel());
        builder.entity(Dictionary_.__INSTANCE);
        return builder;
    }

    private static byte[] getModel() {
        ModelBuilder modelBuilder = new ModelBuilder();
        modelBuilder.lastEntityId(1, 5843830524812640372L);
        modelBuilder.lastIndexId(0, 0L);
        modelBuilder.lastRelationId(0, 0L);

        EntityBuilder entityBuilder;

        entityBuilder = modelBuilder.entity("Dictionary");
        entityBuilder.id(1, 5843830524812640372L).lastPropertyId(4, 8860006477635119064L);
        entityBuilder.flags(io.objectbox.model.EntityFlags.USE_NO_ARG_CONSTRUCTOR);
        entityBuilder.property("id", PropertyType.Long).id(1, 4630241860809715827L)
            .flags(PropertyFlags.ID | PropertyFlags.NOT_NULL);
        entityBuilder.property("text", PropertyType.String).id(2, 8095517545163504935L);
        entityBuilder.property("comment", PropertyType.String).id(3, 5772798066003266536L);
        entityBuilder.property("date", PropertyType.Long).id(4, 8860006477635119064L)
            .flags(PropertyFlags.NON_PRIMITIVE_TYPE);
        entityBuilder.entityDone();

        return modelBuilder.build();
    }

}