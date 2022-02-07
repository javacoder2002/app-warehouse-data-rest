package uz.pdp.appwarehousedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appwarehousedatarest.entity.template.AbsIdNameActive;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbsIdNameActive {

    @ManyToOne(optional = false)//not null
    private Category category;

    @OneToOne
    private Attachment photo;

    private String code;

    @OneToOne(optional = false)//not null
    private Measurement measurement;

}
