package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.appwarehousedatarest.entity.Attachment;
import uz.pdp.appwarehousedatarest.entity.Category;
import uz.pdp.appwarehousedatarest.entity.Measurement;
import uz.pdp.appwarehousedatarest.projection.CustomCategory;
import uz.pdp.appwarehousedatarest.projection.CustomMeasurement;

@RepositoryRestResource(
        path = "category",
        collectionResourceRel = "categories",
        excerptProjection = CustomCategory.class
)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @RestResource(path = "byName")
    public Page<Category> findAllByName(String name, Pageable pageable);

}