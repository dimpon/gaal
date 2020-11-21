package org.gaal.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClusterDTO implements DTO {
    private final String name;
    private final LocalDate repDate;
}
