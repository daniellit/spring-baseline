package com.daniel.baseline.model;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance
public class Identifiable extends Auditable<String> {

    @Id
    private String id;

    public Identifiable() {}

    public Identifiable(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
