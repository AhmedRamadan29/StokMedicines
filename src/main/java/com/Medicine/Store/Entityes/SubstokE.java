package com.Medicine.Store.Entityes;

import com.Medicine.Store.Enums.Stok;
import com.Medicine.Store.Enums.UnitStok;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "substok")
public class SubstokE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer storeId;
    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "TOTAL_PRODUCT")
    private BigDecimal totalProduct;

    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT")
    private UnitStok unit;

    @Column(name = "LETTER")
    private String letter;

    @Enumerated(EnumType.STRING)
    @Column(name = "STOK")
    private Stok stok;
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    @Column(name = "TOTAL_COST")
    private BigDecimal totalCost;
}
