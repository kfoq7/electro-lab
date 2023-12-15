package models;

import java.time.LocalDate;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Student {

    private int student_code;
    private String names;
    private String career;
    private int cycle;
    private LocalDate date;
    private boolean asistencia;

}
