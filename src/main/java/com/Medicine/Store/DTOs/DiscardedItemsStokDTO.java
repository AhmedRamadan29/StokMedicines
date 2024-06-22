package com.Medicine.Store.DTOs;
import com.Medicine.Store.Enums.Stok;
import com.Medicine.Store.Enums.TypeDamage;
import com.Medicine.Store.Enums.UnitStok;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscardedItemsStokDTO {
    private Integer productId;
    private String productName;
    private BigDecimal count;
    private UnitStok unitType;
    private BigDecimal priceBefore;
    private BigDecimal discount;
    private BigDecimal priceAfter;
    private String litter;
    private Stok storeType;
    private String employeeName;
    private Integer employeeId;
    private String departmentId;
    private String departmentName;
    private String position;
    private TypeDamage typeDamage;
}
