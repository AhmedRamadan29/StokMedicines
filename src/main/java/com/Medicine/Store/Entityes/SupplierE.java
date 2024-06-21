package com.Medicine.Store.Entityes;

import com.Medicine.Store.Enums.PaymentType;
import com.Medicine.Store.PublicClass.string;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "suppliers")
public class SupplierE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    @Column(name = "SUPPLIER_ADDRESS")
    private String supplierAddress;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber = string.empty();

    @Enumerated(EnumType.STRING)
    @Column(name = "PAYMENT_TYPE")
    private PaymentType paymentType;

    @Column(name = "EMAIL_SUPPLIER")
    private String emailSupplier = "Not Email";
}




