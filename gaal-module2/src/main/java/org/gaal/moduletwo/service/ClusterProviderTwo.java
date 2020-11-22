package org.gaal.moduletwo.service;

import lombok.extern.slf4j.Slf4j;
import org.gaal.services.ClusterProvider;
import org.gaal.valueobjects.Cluster;

import java.time.LocalDate;

@Slf4j
public class ClusterProviderTwo implements ClusterProvider {
    @Override
    public Cluster createNewCluster(String name) {
        log.info("ClusterProviderTwo.ClusterProviderTwo {}", name);
        return new Cluster(name, LocalDate.of(1978, 01, 18));
    }
}
