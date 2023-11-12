package med.amusem.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.amusem.api.domain.direccion.DatosDireccion;

public record DatosRegistroMedico(

    //Here we are validating all sections of the database
    @NotBlank
    String nombre, 
    @NotBlank
    @Email
    String email,
    @NotBlank
    String telefono,
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String documento,
    @NotNull
    Especialidad especialidad,
    @NotNull
    @Valid
    DatosDireccion direccion) {

}
