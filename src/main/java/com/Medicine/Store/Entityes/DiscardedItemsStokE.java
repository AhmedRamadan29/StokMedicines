package com.Medicine.Store.Entityes;

import com.Medicine.Store.Enums.Stok;
import com.Medicine.Store.Enums.TypeDamage;
import com.Medicine.Store.Enums.UnitStok;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "discarded_items_stok")
public class DiscardedItemsStokE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "`COUNT`")
    private BigDecimal count;

    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT_TYPE")
    private UnitStok unitType;

    @Column(name = "PRICE_BEFORE")
    private BigDecimal priceBefore;

    @Column(name = "DISCOUNT")
    private BigDecimal discount;

    @Column(name = "PRICE_AFTER")
    private BigDecimal priceAfter;

    @Column(name = "LITTER")
    private String litter;

    @Enumerated(EnumType.STRING)
    @Column(name = "STORE_TYPE")
    private Stok storeType;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name = "DEPARTMENT_ID")
    private String departmentId;

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    @Column(name = "`POSITION`")
    private String position;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE_DAMAGE")
    private TypeDamage typeDamage;
}
