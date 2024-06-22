package com.Medicine.Store.Controlls;
import com.Medicine.Store.DTOs.InvoiceDTO;
import com.Medicine.Store.Services.InvoiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class InvoiceController {
    @Autowired
    InvoiceServices invoiceServices;


    @GetMapping("/GET-ALL")
    public ResponseEntity<List<InvoiceDTO>> getAll() {

        return ResponseEntity.ok(invoiceServices.getGetAllInvoice().getAll());
    }

    @GetMapping("/GetById/{id}")
    public ResponseEntity<InvoiceDTO> GetById(@PathVariable Integer id) {
        InvoiceDTO invoiceDTO = invoiceServices.getGetInvoiceById().InvoiceById(id);
        return Optional.ofNullable(invoiceDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
