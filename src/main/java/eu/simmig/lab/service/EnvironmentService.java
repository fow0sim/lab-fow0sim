package eu.simmig.lab.service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class EnvironmentService {

    public Set<Map.Entry<String, String>> getEnvironment() {
        return System.getenv().entrySet();
    }
}
