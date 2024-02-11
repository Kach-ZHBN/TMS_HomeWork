package homework.homework37.texts;

import org.springframework.stereotype.Component;

@Component
public class OrganizationText implements SpeakerText{
    @Override
    public String getText() {
        return "Organization - TeachMeSkills";
    }
}
