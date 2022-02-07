package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.appwarehousedatarest.entity.Measurement;
import uz.pdp.appwarehousedatarest.projection.CustomMeasurement;

@RepositoryRestResource(
        path = "measurement",
        collectionResourceRel = "measurements",
        excerptProjection = CustomMeasurement.class
)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

    /**
     * name orqali topish
     * @param name
     * @param pageable
     */
    @RestResource(path = "byName")
    public Page<Measurement> findAllByName(@Param("name") String name, Pageable pageable);

}