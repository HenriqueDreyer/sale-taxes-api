package com.dreyer.saletaxes.web.service;

import com.dreyer.saletaxes.core.boundary.input.GetProductsFilterInput;
import com.dreyer.saletaxes.core.boundary.requestmodel.GetProductsFilterRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public class GetProductsFilterService {
    private final GetProductsFilterInput getProductsFilterInput;

    @Autowired
    public GetProductsFilterService(final GetProductsFilterInput getProductsFilterInput) {
        this.getProductsFilterInput = getProductsFilterInput;
    }

    public void execute(GetProductsFilterRequestModel requestModel) {
        this.getProductsFilterInput.execute(requestModel);
    }
}
