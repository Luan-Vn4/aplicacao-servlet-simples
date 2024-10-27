package br.com.luanvn.infra.healthcheck;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HealthCheckService {

    public String helloWorld() {
        return "<h1>Hello World</h1>";
    }

}
