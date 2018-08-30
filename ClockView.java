public class ClockView extends javax.swing.JFrame {
    private javax.swing.JLabel tLabel = new javax.swing.JLabel();
    
    public ClockView() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(95,45);
        getContentPane().add(tLabel);
        refreshTimeDisplay();
    }
    
    protected String getDigitAsString(int i) {
        String str = Integer.toString(i);
        if (i<10) str = "0" + str;
        return str;
    }
    
    public void refreshTimeDisplay() {
        TimeStamp t = new TimeStamp();
        t.fillTimes();
        String display = getDigitAsString(t.getHrs()) + ":"
                     + getDigitAsString(t.getMins()) + ":"
                     + getDigitAsString(t.getSecs());
        tLabel.setText("  " + display);
        tLabel.repaint();
    }
}
