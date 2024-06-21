package com.Medicine.Store.DTOs;

import com.Medicine.Store.PublicClass.string;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Component
public class LettersDTO {
    private Integer id;
    private String sockLocation;
    private String Location = string.empty();

    public LettersDTO(String sockLocation) {

        this.sockLocation = sockLocation;
    }


}



