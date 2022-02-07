package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Currency;
import uz.pdp.appwarehousedatarest.entity.Input;
import uz.pdp.appwarehousedatarest.entity.InputProduct;
import uz.pdp.appwarehousedatarest.entity.Product;

import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Product getProduct();

    Double getAmount();

    Currency getCurrency();

    Double getPrice();

    Date getDate();

    Input getInput();

}
