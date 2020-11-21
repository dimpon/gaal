package org.gaal.moduletwo.service;

public class ModuleOneServiceImpl implements ModuleOneService {
    @Override
    public String health() {
        return "I'm ok";
    }
}
