package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Client;
import uz.pdp.appwarehousedatarest.entity.Output;
import uz.pdp.appwarehousedatarest.entity.Supplier;
import uz.pdp.appwarehousedatarest.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Client getClient();

    String getFactureNumber();

    String getCode();

}
