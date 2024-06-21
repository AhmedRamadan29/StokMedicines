package com.Medicine.Store.Lamadas;

import com.Medicine.Store.Entityes.SupplierE;

import java.util.List;

public class LamdaSupplier {

    // Functional interface for getting all suppliers
    @FunctionalInterface
    public interface ResponseSupplier {
        // Method to get all suppliers as a list of SupplierE
        List<SupplierE> getAllSuppliers();
    }
}
