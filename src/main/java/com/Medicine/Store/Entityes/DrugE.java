package com.Medicine.Store.Entityes;

import com.Medicine.Store.Enums.Stok;
import com.Medicine.Store.Enums.UnitStok;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "drugs")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DrugE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "EXPIRY_YET")
    private String expiryYet;

    @Column(name = "PRODUCT_COUNT")
    private BigDecimal productCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT_STOK")
    private UnitStok unitStok;

    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    @Column(name = "PRICE_AFTER")
    private BigDecimal priceAfter;

    @Column(name = "DISCOUNT")
    private BigDecimal discount;

    @Column(name = "PRICE_BEFORE")
    private BigDecimal priceBefore;

    @Column(name = "LETTER")
    private String letter;

    @Column(name = "ENTRY_DATE")
    @Temporal(TemporalType.DATE)
    private Date entryDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "STOK")
    private Stok stok;
}
