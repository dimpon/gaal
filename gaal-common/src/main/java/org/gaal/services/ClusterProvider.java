package org.gaal.services;

import org.gaal.valueobjects.Cluster;

public interface ClusterProvider {
    Cluster createNewCluster(String name);
}
