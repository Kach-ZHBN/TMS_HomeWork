package homework.homework37;



import homework.homework37.texts.AuthorText;
import homework.homework37.texts.HelloText;
import homework.homework37.texts.OrganizationText;
import homework.homework37.texts.SpeakerText;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringMainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SpeakerText speakerText = context.getBean("helloText", HelloText.class);
        Speaker speaker = new Speaker(speakerText);
        speaker.readText();

        speakerText = context.getBean("authorText", AuthorText.class);
        speaker.setSpeakerText(speakerText);
        speaker.readText();

        speakerText = context.getBean("organizationText", OrganizationText.class);
        speaker.setSpeakerText(speakerText);
        speaker.readText();
    }
}
