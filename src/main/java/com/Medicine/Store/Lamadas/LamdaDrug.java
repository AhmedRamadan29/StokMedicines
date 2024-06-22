package com.Medicine.Store.Lamadas;
<<<<<<< HEAD

import com.Medicine.Store.DTOs.DrugDTO;

import java.util.List;

=======
import com.Medicine.Store.DTOs.DrugDTO;
import java.util.List;
>>>>>>> 7f047230a0db5e515fc27c2c7a6c47c33d458992
public class LamdaDrug {

    @FunctionalInterface
    public interface getDrugs {
        List<DrugDTO> getAllDrugs();
    }
<<<<<<< HEAD

=======
>>>>>>> 7f047230a0db5e515fc27c2c7a6c47c33d458992
    @FunctionalInterface
    public interface DrugById {
        DrugDTO getDrugById(Integer id);
    }
<<<<<<< HEAD

=======
>>>>>>> 7f047230a0db5e515fc27c2c7a6c47c33d458992
    @FunctionalInterface
    public interface deleteDrugById {
        void deleteDrug(Integer id);
    }
<<<<<<< HEAD

=======
>>>>>>> 7f047230a0db5e515fc27c2c7a6c47c33d458992
    @FunctionalInterface
    public interface updateDrugRow {
        DrugDTO updateDrug(DrugDTO drugDTO);
    }
<<<<<<< HEAD

=======
>>>>>>> 7f047230a0db5e515fc27c2c7a6c47c33d458992
    @FunctionalInterface
    public interface InsertRowDrug {
        DrugDTO insertRowDrug(DrugDTO drugDTO);
    }


}
