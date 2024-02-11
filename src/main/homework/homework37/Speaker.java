package homework.homework37;

import homework.homework37.texts.SpeakerText;

public class Speaker {

    private SpeakerText speakerText;

    public Speaker(SpeakerText speakerText) {
        this.speakerText = speakerText;
    }

    public void setSpeakerText(SpeakerText speakerText) {
        this.speakerText = speakerText;
    }

    public void readText(){
        System.out.println(speakerText.getText());
    }
}
