package es.pmac.deadball.domain.common.config;

public interface PropertiesManager {
    //TODO ¿Para qué vale esto y por qué debe estar en el dominio?
    String getProperties(String key);
}
