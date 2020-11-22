package org.gaal.commonbeans.service;

import lombok.extern.slf4j.Slf4j;
import org.gaal.services.ClusterProvider;
import org.gaal.valueobjects.Cluster;

import java.time.LocalDate;

@Slf4j
public class ClusterProviderImpl implements ClusterProvider {
    @Override
    public Cluster createNewCluster(String name) {
        log.info("ClusterProviderImpl.ClusterProviderTwo {}", name);
        return new Cluster(name, LocalDate.now());
    }
}
