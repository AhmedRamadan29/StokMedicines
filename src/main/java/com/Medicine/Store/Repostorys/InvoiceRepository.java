package com.Medicine.Store.Repostorys;

import com.Medicine.Store.Entityes.InvoiceE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceE, Integer> {
}
