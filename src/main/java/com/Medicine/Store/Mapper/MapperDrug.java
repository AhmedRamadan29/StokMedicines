package com.Medicine.Store.Mapper;
import com.Medicine.Store.DTOs.DrugDTO;
import com.Medicine.Store.Entityes.DrugE;
import lombok.Builder;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
@Builder
@Component

public class MapperDrug {
    public static  DrugDTO mapToDTODrugDTO(@NotNull DrugE drug) {
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



}
