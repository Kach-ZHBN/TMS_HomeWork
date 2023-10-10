package homework.homework7.task1;

import java.security.SecureRandom;

public class Therapist extends Doctor{
    private Doctor surgeon;
    private Doctor dentist;

    @Override
    public void treat() {
        System.out.println("Therapist treats");
    }

    public void setDoctors(Doctor surgeon, Doctor dentist){
        this.surgeon = surgeon;
        this.dentist = dentist;
    }

    public void chooseDoctor(Patient patient){
        SecureRandom secureRandom = new SecureRandom();
        patient.setTreatmentPlan(secureRandom.nextInt(1,4)); //Максимальное приближение к реальной жизни
        if(patient.getTreatmentPlan() == 1){
            patient.setDoctor(surgeon);
        } else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(dentist);
        } else {
            patient.setDoctor(this);
        }
    }
}
