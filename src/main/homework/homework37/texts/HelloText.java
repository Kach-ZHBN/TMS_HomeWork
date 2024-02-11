package homework.homework37.texts;

import org.springframework.stereotype.Component;

@Component
public class HelloText implements SpeakerText{
    @Override
    public String getText() {
        return "Hello from Spring";
    }
}
