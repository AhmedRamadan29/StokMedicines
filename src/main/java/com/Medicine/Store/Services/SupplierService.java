package com.Medicine.Store.Services;

import com.Medicine.Store.Lamadas.LamdaSupplier;
import com.Medicine.Store.Repostorys.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepo supplierRepo;


    // Lambda function to get all suppliers
    public LamdaSupplier.ResponseSupplier GetAllSupplier = () ->
            // Fetch all suppliers from the repository
            supplierRepo.findAll();


}
