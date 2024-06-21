package com.Medicine.Store.Repostorys;

import com.Medicine.Store.Entityes.DiscardedItemsStokE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscardedItemsStokRepository extends JpaRepository<DiscardedItemsStokE, Integer> {
}
