package eu.simmig.lab.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EnvironmentService {

    public Map<String, String> getEnvironment() {
        return System.getenv();
    }

}
