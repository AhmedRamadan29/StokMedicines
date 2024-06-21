package com.Medicine.Store.Repostorys;

import com.Medicine.Store.Entityes.MainStokE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainStokRepository extends JpaRepository<MainStokE, Integer> {
}
