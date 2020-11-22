package org.gaal.commonbeans.service;

import org.gaal.services.ClusterProvider;
import org.gaal.valueobjects.Cluster;

import java.time.LocalDate;

public class ClusterProviderImpl implements ClusterProvider {
    @Override
    public Cluster createNewCluster(String name) {
        return new Cluster(name, LocalDate.now());
    }
}
