package com.istvansarhegyi.sfgpetclinic.repositories;

import com.istvansarhegyi.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
