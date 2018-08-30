public class TimeStamp {
    private int hrs;
    private int mins;
    private int secs;
    
    public void fillTimes() {
        java.util.Calendar now;
        now = java.util.Calendar.getInstance();
        hrs = now.get(java.util.Calendar.HOUR_OF_DAY);
        mins = now.get(java.util.Calendar.MINUTE);
        secs = now.get(java.util.Calendar.SECOND);
    }
    public int getHrs() { return hrs; }
    public int getMins() { return mins; }
    public int getSecs() { return secs; }
}
