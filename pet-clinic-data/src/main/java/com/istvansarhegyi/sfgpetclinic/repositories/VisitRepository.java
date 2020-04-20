package com.istvansarhegyi.sfgpetclinic.repositories;

import com.istvansarhegyi.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
