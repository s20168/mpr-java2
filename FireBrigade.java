package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

public class FireBrigade implements Observer {
    private Operator operator;

    public FireBrigade(Operator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(FireBrigade.class.getSimpleName() + " received the notification and is on its way.");
        System.out.println("INCIDENT: " + operator.getStatus());
    }
}
