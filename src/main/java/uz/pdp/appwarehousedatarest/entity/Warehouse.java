package uz.pdp.appwarehousedatarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appwarehousedatarest.entity.template.AbsIdNameActive;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Warehouse extends AbsIdNameActive {

}
