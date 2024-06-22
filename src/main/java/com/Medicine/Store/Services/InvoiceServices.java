package com.Medicine.Store.Services;

import com.Medicine.Store.Entityes.InvoiceE;
import com.Medicine.Store.Lamadas.LamdaInvoice;
import com.Medicine.Store.Mapper.MapperALL;
import com.Medicine.Store.Repostorys.InvoiceRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Service
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceServices {
    @Autowired
    private InvoiceRepository invoiceRepository;
    LamdaInvoice.GetAllInvoice getAllInvoice = () -> {
        List<InvoiceE> invoices = invoiceRepository.findAll();
        return invoices.stream()
                .map(MapperALL::MapInvoice)
                .collect(Collectors.toList());
    };

    LamdaInvoice.GetInvoiceById getInvoiceById = id ->
    {
        Optional <InvoiceE> optional = invoiceRepository.findById(id);
        return optional.map(MapperALL::MapInvoice).orElse(null);};




}
