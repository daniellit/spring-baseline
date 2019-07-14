package com.daniel.baseline.repository;

import com.daniel.baseline.model.Identifiable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CrudRepository<T extends Identifiable> extends JpaRepository<T , String> {
}
