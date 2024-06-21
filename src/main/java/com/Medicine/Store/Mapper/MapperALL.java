package com.Medicine.Store.Mapper;
import com.Medicine.Store.DTOs.DrugDTO;
import com.Medicine.Store.Entityes.DrugE;

public class MapperALL {

    public static DrugDTO mapToDTO(DrugE drug) {
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

    public static DrugE mapToEntity(DrugDTO drugDTO) {
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
}
