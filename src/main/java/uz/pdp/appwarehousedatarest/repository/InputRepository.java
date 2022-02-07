package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.appwarehousedatarest.entity.Input;
import uz.pdp.appwarehousedatarest.projection.CustomInput;

@RepositoryRestResource(
        path = "input",
        collectionResourceRel = "inputs",
        excerptProjection = CustomInput.class
)
public interface InputRepository extends JpaRepository<Input,Integer> {

    @RestResource(path = "factureNumber")
    Page<Input> getAllByFactureNumber(@Param("factureNumber") String factureNumber, Pageable pageable);

}
