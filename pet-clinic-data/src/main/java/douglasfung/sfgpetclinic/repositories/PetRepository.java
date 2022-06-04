package douglasfung.sfgpetclinic.repositories;

import douglasfung.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}