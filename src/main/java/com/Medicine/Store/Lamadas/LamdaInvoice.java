package com.Medicine.Store.Lamadas;


import com.Medicine.Store.DTOs.InvoiceDTO;

import java.util.List;
import java.util.Optional;

public class LamdaInvoice {
    @FunctionalInterface
    public interface GetAllInvoice {
        List<InvoiceDTO> getAll();
    }
@FunctionalInterface
    public  interface  GetInvoiceById{
   InvoiceDTO InvoiceById (Integer ID);
}
}
