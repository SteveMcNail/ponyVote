package de.stephannaegele.demo.model;

import de.stephannaegele.demo.model.interfaces.PersistableEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * The entity of a user
 * Created by NgS on 01.10.2017.
 */
@Entity
public class User implements PersistableEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String username;
    private LocalDate creationDate;
    private LocalDate modifyDate;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public LocalDate getCreationDate() {
        return null;
    }

    @Override
    public LocalDate getModifiedDate() {
        return null;
    }
}
