package com.istvansarhegyi.sfgpetclinic.repositories;

import com.istvansarhegyi.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
