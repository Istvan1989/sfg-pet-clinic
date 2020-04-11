package com.istvansarhegyi.sfgpetclinic.services;

import com.istvansarhegyi.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
