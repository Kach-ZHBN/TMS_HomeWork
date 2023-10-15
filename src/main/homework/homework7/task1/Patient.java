package homework.homework7.task1;

public class Patient {
    private int treatmentPlan;
    private Doctor doctor;

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void getTreatment(){
        doctor.treat();
    }
}
