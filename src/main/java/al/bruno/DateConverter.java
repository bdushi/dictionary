package al.bruno;

import io.objectbox.converter.PropertyConverter;

import java.util.Date;

public class DateConverter implements PropertyConverter<Date, Long> {
    @Override
    public Date convertToEntityProperty(Long databaseValue) {
        return new Date(databaseValue);
    }

    @Override
    public Long convertToDatabaseValue(Date entityProperty) {
        return entityProperty.getTime();
    }
}
