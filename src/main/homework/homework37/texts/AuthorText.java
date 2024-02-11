package homework.homework37.texts;

import org.springframework.stereotype.Component;

@Component
public class AuthorText implements SpeakerText{
    @Override
    public String getText() {
        return "Author - Vladislav";
    }
}
