package uz.pdp.appwarehousedatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appwarehousedatarest.entity.template.AbsIdNameActive;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Category extends AbsIdNameActive {

    @ManyToOne
    private Category category;

}
