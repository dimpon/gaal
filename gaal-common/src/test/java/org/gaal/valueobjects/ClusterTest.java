package org.gaal.valueobjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ClusterTest {

    @Test
    void testCluster(){
        Cluster cluster = new Cluster("cluster", LocalDate.now());
        Assertions.assertEquals("cluster",cluster.getName());
    }
}
