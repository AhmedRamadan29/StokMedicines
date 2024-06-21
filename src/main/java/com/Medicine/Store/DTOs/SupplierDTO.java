package com.Medicine.Store.DTOs;

import com.Medicine.Store.Enums.PaymentType;
import com.Medicine.Store.PublicClass.string;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Component
public class SupplierDTO {
    private final String phoneNumber = string.empty();
    private final String emailSupplier = string.empty();
    private Integer id;
    private String supplierName;
    private String supplierAddress;
    private PaymentType paymentType;
}
