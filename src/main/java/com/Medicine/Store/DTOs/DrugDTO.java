package com.Medicine.Store.DTOs;

import com.Medicine.Store.Enums.Stok;
import com.Medicine.Store.Enums.UnitStok;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Date;

@NoArgsConstructor
@Data
@Builder
@Component
public class DrugDTO {
    private Integer id;
    private String productName;
    private Date startDate;
    private Date endDate;
    private String expiryYet;
    private BigDecimal productCount;
    private UnitStok unitStok;
    private String supplierName;
    private BigDecimal priceAfter;
    private BigDecimal discount;
    private BigDecimal priceBefore;
    private String letter;
    private Date entryDate;
    private Stok stok;

    public DrugDTO(Integer id, String productName, Date startDate, Date endDate, String expiryYet, BigDecimal productCount,
                   UnitStok unitStok, String supplierName, BigDecimal priceAfter, BigDecimal discount, BigDecimal priceBefore,
                   String letter, Date entryDate, Stok stok) {
        this.id = id;
        this.productName = productName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.expiryYet = expiryYet;
        this.productCount = productCount;
        this.unitStok = unitStok;
        this.supplierName = supplierName;
        this.priceAfter = priceAfter;
        this.discount = discount;
        this.priceBefore = priceBefore;
        this.letter = letter;
        this.entryDate = entryDate;
        this.stok = stok;
    }


}
