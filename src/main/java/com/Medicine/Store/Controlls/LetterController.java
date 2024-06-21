package com.Medicine.Store.Controlls;

import com.Medicine.Store.DTOs.LettersDTO;
import com.Medicine.Store.Entityes.LettersE;
import com.Medicine.Store.Services.LettersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Letters")
public class LetterController {

    @Autowired
    private LettersService lettersService;

    // Endpoint to get all letters
    @GetMapping("/GetLetters")
    private ResponseEntity<List<LettersDTO>> GetLetters() {
        // Return the list of all letters wrapped in ResponseEntity
        return ResponseEntity.ok(lettersService.GetAllLetters.getAllLetters());
    }

    // Endpoint to save all letters
    @PostMapping("/SaveAllLetters")
    public ResponseEntity<List<LettersE>> saveLetters(@RequestBody List<LettersE> letters) {
        // Save the provided list of letters and return them wrapped in ResponseEntity
        return ResponseEntity.ok(lettersService.SaveAllLetters.SaveAllLetter(letters));
    }

    // Endpoint to get letter location by letter name
    @GetMapping("/LocationByLetter/{NameLetter}")
    public ResponseEntity<LettersDTO> getLetterByName(@PathVariable String NameLetter) {
        // Find location by letter name and return it wrapped in ResponseEntity
        Optional<LettersDTO> Location = lettersService.findLocationByLetter.findLocationByLetter(NameLetter);
        return Location.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint to update a letter
    @PutMapping("/updateLetter")
    public ResponseEntity<Void> updateLetter(@RequestParam String letter, @RequestParam String sotkLocation, @RequestParam Integer id) {
        // Update the letter and check if the update was successful
        int updateLetter = lettersService.updateAllLetter.updateLetter(letter, sotkLocation, id);
        if (updateLetter > 0) {
            // Return OK status if the update was successful
            return ResponseEntity.ok().build();
        } else {
            // Return Not Found status if the update was not successful
            return ResponseEntity.notFound().build();
        }
    }
}
