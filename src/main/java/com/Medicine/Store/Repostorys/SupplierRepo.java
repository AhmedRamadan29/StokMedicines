package com.Medicine.Store.Repostorys;

import com.Medicine.Store.Entityes.SupplierE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepo extends JpaRepository<SupplierE, Integer> {
}
