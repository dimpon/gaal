package org.gaal.moduletwo.service;

import org.gaal.valueobjects.Cluster;

import java.time.LocalDate;

public class ModuleOneServiceImpl implements ModuleOneService {
    @Override
    public Cluster cluster() {
        return new Cluster("cluster", LocalDate.now());
    }
}
