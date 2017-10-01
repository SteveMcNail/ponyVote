package de.stephannaegele.demo.model.interfaces;

import java.time.LocalDate;

/**
 * PersistableEntity for Entity-Elements
 * Created by NgS on 30.09.2017.
 */
public interface PersistableEntity {
    Long getId();
    LocalDate getCreationDate();
    LocalDate getModifiedDate();
}
