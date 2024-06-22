package com.Medicine.Store.Services;

import com.Medicine.Store.DTOs.LettersDTO;
import com.Medicine.Store.Lamadas.LamdaLetters;
import com.Medicine.Store.Repostorys.LettersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class LettersService {
    @Autowired
    private LettersRepo lettersRepo;

    // Lambda function to get all letters
    public LamdaLetters.ResponseGETAllLetter GetAllLetters = () ->
            // Fetch all letters from the repository, map them to DTOs, and collect as a list
            lettersRepo.findAll().stream().map(l -> new LettersDTO(l.getId(), l.getSockLocation(), l.getLetter())).collect(Collectors.toList());

    // Lambda function to save all letters
    public LamdaLetters.ResponseSaveAllLetter SaveAllLetters = SaveLetter ->
            // Save all provided letters to the repository
            lettersRepo.saveAll(SaveLetter);
    // Lambda function to find location by letter
    public LamdaLetters.FindByLetter findLocationByLetter = letter ->
            // Find a letter by its content and map it to a DTO containing only the location
            lettersRepo.findByLetter(letter).map(l -> new LettersDTO(l.getSockLocation()));



    public LamdaLetters.updateAllLetter updateAllLetter = (letter, sotkLocation, id) ->
            lettersRepo.updateLetter(letter, sotkLocation, id);


}
