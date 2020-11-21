package org.gaal.valueobjects;

import org.gaal.dto.ClusterDTO;
import org.gaal.dto.DTO;

public interface ValueObject<D extends DTO> {
     D dto();
}
