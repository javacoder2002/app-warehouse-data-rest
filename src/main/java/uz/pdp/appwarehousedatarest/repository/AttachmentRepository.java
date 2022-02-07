package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;
import uz.pdp.appwarehousedatarest.entity.Attachment;
import uz.pdp.appwarehousedatarest.projection.CustomAttachment;

@RepositoryRestResource(
        path = "attachment",
        collectionResourceRel = "attachments",
        excerptProjection = CustomAttachment.class
)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {

    @RestResource(path = "byName")
    public Page<Attachment> findAllByName(@Param("name") String name, Pageable pageable);

}