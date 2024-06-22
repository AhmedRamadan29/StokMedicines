package com.Medicine.Store.Services;

import com.Medicine.Store.Entityes.DrugE;
import com.Medicine.Store.Lamadas.LamdaDrug;
import com.Medicine.Store.Mapper.MapperALL;
import com.Medicine.Store.Repostorys.DrugRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DrugServices {
    @Autowired
    private DrugRepository DrugRepository;
    LamdaDrug.getDrugs GetAll = () -> {
        List<DrugE> drugES = DrugRepository.findAll();
        return drugES.stream().
                map(MapperALL::mapToDTODrugDTO)
                .collect(Collectors.toList());
    };

    LamdaDrug.DrugById drugById = id -> {
        Optional<DrugE> drug = DrugRepository.findById(id);
        return drug.map(MapperALL::mapToDTODrugDTO)
                .orElse(null);
    };


}
