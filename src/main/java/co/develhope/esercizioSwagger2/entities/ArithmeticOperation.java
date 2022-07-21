package co.develhope.esercizioSwagger2.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArithmeticOperation {


    private String name;

    private int minNumberOfOperands;

    private String description;

    private String[] properties;

}
