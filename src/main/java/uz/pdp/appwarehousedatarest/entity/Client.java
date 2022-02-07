package uz.pdp.appwarehousedatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appwarehousedatarest.entity.template.AbsIdNameActive;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Client extends AbsIdNameActive {

    @Column(nullable = false, unique = true)
    private String phoneNumber;

}
