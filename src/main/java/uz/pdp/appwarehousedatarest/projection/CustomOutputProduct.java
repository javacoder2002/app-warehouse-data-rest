package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Currency;
import uz.pdp.appwarehousedatarest.entity.Output;
import uz.pdp.appwarehousedatarest.entity.OutputProduct;
import uz.pdp.appwarehousedatarest.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Product gteProduct();

    Double getAmount();

    Currency getCurrency();

    Double getPrice();

    Output getOutput();

}
