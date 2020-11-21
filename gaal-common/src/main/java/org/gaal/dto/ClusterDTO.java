package org.gaal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ClusterDTO implements DTO {

    @JsonProperty("name")
    private final String name;
    private final LocalDate repDate;
}
