public class ClockDisplay {

    private NumberDiplay hour;
    private NumberDisplay minutes;
    private String displayString;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }
    public void timeTick() {
        minutes.increment();

        if(minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }
    public String getDisplayString() {
        return displayString;
    }
    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

}
