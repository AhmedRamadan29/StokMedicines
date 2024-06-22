package com.Medicine.Store.Mapper;

import com.Medicine.Store.DTOs.InvoiceDTO;
import com.Medicine.Store.Entityes.InvoiceE;
import org.jetbrains.annotations.NotNull;

public class MapperInvoice {

    public static InvoiceDTO MapInvoice(@NotNull InvoiceE invoiceE) {
        return InvoiceDTO.builder().invoiceId(invoiceE.getInvoiceId()).
                invoiceNumber(invoiceE.getInvoiceNumber()).productName(invoiceE.getProductName())
                .totalProduct(invoiceE.getTotalProduct()).unit(invoiceE.getUnit()).startDate(invoiceE.getStartDate())
                .endDate(invoiceE.getEndDate()).totalCost(invoiceE.getTotalCost()).supplierName(invoiceE.getSupplierName())
                .prePrice(invoiceE.getPrePrice()).discount(invoiceE.getDiscount()).postPrice(invoiceE.getPostPrice()).
                paymentType(invoiceE.getPaymentType()).litter(invoiceE.getLitter()).stok(invoiceE.getStok())
                .build();

    }
}
