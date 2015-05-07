//
// Document   : LocalDateConverter
// Created on : 03/22/2015, 09:33:51 AM
// Author     : Carmelo
//
package tutor.programacion.springdatarest;

import java.time.LocalDate;
import java.sql.Date;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate entityValue) {
        return entityValue == null ? null : Date.valueOf(entityValue);
    }

    @Override
    public LocalDate convertToEntityAttribute(Date databaseValue) {
        return databaseValue == null ? null : databaseValue.toLocalDate();
    }

}
