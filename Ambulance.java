package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

public class Ambulance implements Observer{
    private Operator operator;

    public Ambulance(Operator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(Ambulance.class.getSimpleName() + " received the notification and is on its way.");
        System.out.println("INCIDENT: " + operator.getStatus());
    }
}
