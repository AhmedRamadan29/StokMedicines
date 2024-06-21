package com.Medicine.Store.Repostorys;

import com.Medicine.Store.Entityes.SubstokE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubstokRepository extends JpaRepository<SubstokE, Integer> {
}
