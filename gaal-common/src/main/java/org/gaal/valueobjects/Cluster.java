package org.gaal.valueobjects;

import lombok.Value;
import org.gaal.dto.ClusterDTO;

import java.time.LocalDate;

@Value
public class Cluster implements ValueObject<ClusterDTO> {
    String name;
    LocalDate repDate;

    public static Cluster of(ClusterDTO dto){
        return new Cluster(dto.getName(),dto.getRepDate());
    }

    @Override
    public ClusterDTO dto() {
        return new ClusterDTO(this.name, this.repDate);
    }
}
