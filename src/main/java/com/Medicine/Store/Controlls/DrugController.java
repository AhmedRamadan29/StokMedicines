package com.Medicine.Store.Controlls;

import com.Medicine.Store.DTOs.DrugDTO;
import com.Medicine.Store.Services.DrugServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Drug")
public class DrugController {
    @Autowired
    private DrugServices drugServices;

    @GetMapping("/GetAllDrug")
    private ResponseEntity<List<DrugDTO>> GetAll() {
        return ResponseEntity.ok(drugServices.getGetAll().getAllDrugs());

    }


}
