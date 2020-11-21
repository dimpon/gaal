package org.gaal.moduletwo.service;

public class ModuleTwoServiceImpl implements ModuleTwoService {
    @Override
    public String health() {
        return "I'm ok from module 2";
    }
}
