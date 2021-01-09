package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

public class RoadsideAssistance implements Observer {
    private Operator operator;

    public RoadsideAssistance(Operator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(RoadsideAssistance.class.getSimpleName() + " received the notification and is on its way.");
        System.out.println("INCIDENT: " + operator.getStatus());
    }
}
