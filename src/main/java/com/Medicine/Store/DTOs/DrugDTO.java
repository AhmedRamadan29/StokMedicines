package com.Medicine.Store.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
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
    private String unitStok;
    private String supplierName;
    private BigDecimal priceAfter;
    private BigDecimal discount;
    private BigDecimal priceBefore;
    private String letter;
    private Date entryDate;
    private String stok;


}
