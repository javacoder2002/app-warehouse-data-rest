package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.OutputProduct;
import uz.pdp.appwarehousedatarest.projection.CustomOutputProduct;

@RepositoryRestResource(
        path = "outputProduct",
        collectionResourceRel = "outputProducts",
        excerptProjection = CustomOutputProduct.class
)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
