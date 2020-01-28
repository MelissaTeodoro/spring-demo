package guru.springframework.services;

public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servico de saludo primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst";
    }
}
