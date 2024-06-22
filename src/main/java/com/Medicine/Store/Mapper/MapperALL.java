package com.Medicine.Store.Mapper;

import com.Medicine.Store.DTOs.DrugDTO;
import com.Medicine.Store.DTOs.InvoiceDTO;
import com.Medicine.Store.Entityes.DrugE;
import com.Medicine.Store.Entityes.InvoiceE;
import lombok.Builder;

@Builder
public class MapperALL {

    public static DrugDTO mapToDTODrugDTO(DrugE drug) {
        if (drug == null) {
            return null;
        }
        return DrugDTO.builder()
                .id(drug.getId())
                .productName(drug.getProductName())
                .startDate(drug.getStartDate())
                .endDate(drug.getEndDate())
                .expiryYet(drug.getExpiryYet())
                .productCount(drug.getProductCount())
                .unitStok(drug.getUnitStok())
                .supplierName(drug.getSupplierName())
                .priceAfter(drug.getPriceAfter())
                .discount(drug.getDiscount())
                .priceBefore(drug.getPriceBefore())
                .letter(drug.getLetter())
                .entryDate(drug.getEntryDate())
                .stok(drug.getStok())
                .build();
    }

    public static InvoiceDTO MapInvoice(InvoiceE invoiceE) {
        return InvoiceDTO.builder().invoiceId(invoiceE.getInvoiceId()).
                invoiceNumber(invoiceE.getInvoiceNumber()).productName(invoiceE.getProductName())
                .totalProduct(invoiceE.getTotalProduct()).unit(invoiceE.getUnit()).startDate(invoiceE.getStartDate())
                .endDate(invoiceE.getEndDate()).totalCost(invoiceE.getTotalCost()).supplierName(invoiceE.getSupplierName())
                .prePrice(invoiceE.getPrePrice()).discount(invoiceE.getDiscount()).postPrice(invoiceE.getPostPrice()).
                paymentType(invoiceE.getPaymentType()).litter(invoiceE.getLitter()).stok(invoiceE.getStok())
                .build();

    }
/*
    public static DrugE mapToEntityDrugE(DrugDTO drugDTO) {
        if (drugDTO == null) {
            return null;
        }
        return DrugE.builder()
                .id(drugDTO.getId())
                .productName(drugDTO.getProductName())
                .startDate(drugDTO.getStartDate())
                .endDate(drugDTO.getEndDate())
                .expiryYet(drugDTO.getExpiryYet())
                .productCount(drugDTO.getProductCount())
                .unitStok(drugDTO.getUnitStok())
                .supplierName(drugDTO.getSupplierName())
                .priceAfter(drugDTO.getPriceAfter())
                .discount(drugDTO.getDiscount())
                .priceBefore(drugDTO.getPriceBefore())
                .letter(drugDTO.getLetter())
                .entryDate(drugDTO.getEntryDate())
                .stok(drugDTO.getStok())
                .build();
    }
*/
}
