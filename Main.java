package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        Ambulance ambulance = new Ambulance(dispatcher);
        Police police = new Police(dispatcher);
        FireBrigade fireBrigade = new FireBrigade(dispatcher);
        RoadsideAssistance roadsideAssistance =  new RoadsideAssistance(dispatcher);

        dispatcher.setStatus("Robbery");
        dispatcher.setStatus("Car accident");
        dispatcher.setStatus("Arson");
        dispatcher.setStatus("Heart attack");


    }
}
