package guru.springframework.joke.jokeapp.services;

import org.springframework.stereotype.Service;

@Service
public interface JokeService {
    String getJoke();
}
