package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Supplier;
import uz.pdp.appwarehousedatarest.projection.CustomSupplier;

@RepositoryRestResource(
        path = "supplier",
        collectionResourceRel = "suppliers",
        excerptProjection = CustomSupplier.class
)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
