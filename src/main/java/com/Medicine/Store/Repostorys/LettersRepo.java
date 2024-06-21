package com.Medicine.Store.Repostorys;

import com.Medicine.Store.Entityes.LettersE;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LettersRepo extends JpaRepository<LettersE, Integer> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE letters SET LETTER = ?1, sotk_location = ?2 WHERE id = ?3", nativeQuery = true)
    int updateLetter(String letter, String sotkLocation, Integer id);

    Optional<LettersE> findByLetter(String letter);

}
