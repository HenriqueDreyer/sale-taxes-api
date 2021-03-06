package com.dreyer.saletaxes.core.boundary.responsemodel;

import com.dreyer.saletaxes.core.domain.entity.ProductType;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
@ToString
public class GetProductsFilterResponseModel {
    private Long id;
    private String name;
    private Double price;
    private Double basicTax;
    private Double additionalTax;
    private String description;
    private ProductType productType;
    private String isImported;
    private Double totalTaxes;
    private Double totalPrice;
}
