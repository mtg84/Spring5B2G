package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String SayGreetings() {
        return "Hello World - Property";
    }
}
