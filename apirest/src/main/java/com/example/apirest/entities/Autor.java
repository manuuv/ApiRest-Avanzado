package com.example.apirest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "autor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Autor extends Base{

    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column(length = 1500)
    private String biografia;

}
