package br.com.carstore.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CarDTO {
    @NotBlank(message = "Campo nome obrigátorio")
    @Size(min = 3, max= 50, message = "O nome deve ter mais de 3 chars e menos de 50 chars")
    private String name;

    @NotBlank(message = "Campo cor obrigátorio")
    private String cor;

    public CarDTO(String name, String cor) {
        this.name = name;
        this.cor = cor;
    }

    public CarDTO() {

    }

    public @NotBlank(message = "Campo nome obrigátorio") @Size(min = 3, max = 50, message = "O nome deve ter mais de 3 chars e menos de 50 chars") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Campo nome obrigátorio") @Size(min = 3, max = 50, message = "O nome deve ter mais de 3 chars e menos de 50 chars") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Campo cor obrigátorio") String getCor() {
        return cor;
    }

    public void setCor(@NotBlank(message = "Campo cor obrigátorio") String cor) {
        this.cor = cor;
    }
}
