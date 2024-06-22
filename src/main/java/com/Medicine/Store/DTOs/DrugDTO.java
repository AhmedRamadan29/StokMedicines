package com.Medicine.Store.DTOs;
import com.Medicine.Store.Enums.Stok;
import com.Medicine.Store.Enums.UnitStok;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.sql.Date;
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
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



}
