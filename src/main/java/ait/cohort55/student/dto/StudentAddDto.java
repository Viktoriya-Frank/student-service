package ait.cohort55.student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class StudentAddDto {
    private Long id;
    private String name;
    private String password;

    }
