package com.Medicine.Store.Lamadas;
import com.Medicine.Store.DTOs.DrugDTO;
import java.util.List;
public class LamdaDrug {

    @FunctionalInterface
    public  interface getDrugs {
        List<DrugDTO> getAllDrugs();
    }
    @FunctionalInterface
    public  interface DrugById{
        DrugDTO getDrugById(Integer id);
    }
    @FunctionalInterface
    public interface deleteDrugById {
        void deleteDrug(Integer id);
    }
    @FunctionalInterface
    public  interface updateDrugRow {
        DrugDTO updateDrug(DrugDTO drugDTO);
    }
    @FunctionalInterface
    public  interface InsertRowDrug {
        DrugDTO insertRowDrug(DrugDTO drugDTO);
    }



}
