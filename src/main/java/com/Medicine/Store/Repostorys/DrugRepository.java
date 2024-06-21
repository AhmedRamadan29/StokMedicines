package com.Medicine.Store.Repostorys;

import com.Medicine.Store.Entityes.DrugE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugRepository extends JpaRepository<DrugE, Integer> {
}
