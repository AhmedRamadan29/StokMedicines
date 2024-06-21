package com.Medicine.Store.Entityes;

import com.Medicine.Store.Enums.UnitStok;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "main_stok")
public class MainStokE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "TOTAL_PRODUCT")
    private BigDecimal totalProduct;

    @Column(name = "SHELF")
    private String shelf;

    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT_STOK")
    private UnitStok unitStok;

    @Column(name = "LITTER")
    private String litter;

    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;

    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "EXPIRY_YET")
    private String expiryYet;

    @Column(name = "TOTAL_COST")
    private BigDecimal totalCost;


}
