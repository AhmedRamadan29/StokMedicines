package com.Medicine.Store.Entityes;

import com.Medicine.Store.Enums.PaymentType;
import com.Medicine.Store.Enums.Stok;
import com.Medicine.Store.Enums.UnitStok;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "invoices")
public class InvoiceE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceId;

    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "TOTAL_PRODUCT")
    private BigDecimal totalProduct;

    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT")
    private UnitStok unit;

    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "TOTAL_COST")
    private BigDecimal totalCost;

    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    @Column(name = "PRE_PRICE")
    private BigDecimal prePrice;

    @Column(name = "DISCOUNT")
    private BigDecimal discount;

    @Column(name = "POST_PRICE")
    private BigDecimal postPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "PAYMENT_TYPE")
    private PaymentType paymentType;

    @Column(name = "LITTER")
    private String litter;

    @Enumerated(EnumType.STRING)
    @Column(name = "STOK")
    private Stok stok;

}
