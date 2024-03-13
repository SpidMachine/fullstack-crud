package com.sergio.crud.backend.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
public class VehicleDto {

    private Long id;

    @NotNull
    private String customerFio;

    @NotNull
    private String coachFio;

    @NotNull
    private String time;

}
