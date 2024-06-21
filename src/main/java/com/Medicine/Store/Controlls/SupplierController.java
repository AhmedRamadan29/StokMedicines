package com.Medicine.Store.Controlls;

import com.Medicine.Store.Entityes.SupplierE;
import com.Medicine.Store.Services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    // Endpoint to get all suppliers
    @GetMapping("/GetAllSupplier")
    public ResponseEntity<List<SupplierE>> listRequestMapping() {
        // Return the list of all suppliers wrapped in ResponseEntity
        return ResponseEntity.ok(supplierService.GetAllSupplier.getAllSuppliers());
    }
}
