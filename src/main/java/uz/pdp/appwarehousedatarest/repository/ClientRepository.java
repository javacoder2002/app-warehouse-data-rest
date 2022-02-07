package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.appwarehousedatarest.entity.Client;
import uz.pdp.appwarehousedatarest.projection.CustomClient;

@RepositoryRestResource(
        path = "client",
        collectionResourceRel = "clients",
        excerptProjection = CustomClient.class
)
public interface ClientRepository extends JpaRepository<Client,Integer> {

    @RestResource(path = "byName")
    public Page<Client> findAllByName(@Param("name") String name, Pageable pageable);

    @RestResource(path = "byPhoneNUmber")
    Page<Client> findAllByPhoneNumber(@Param("phoneNumber") String phoneNumber, Pageable pageable);

}
