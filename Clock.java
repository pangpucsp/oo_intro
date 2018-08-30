public class Clock {
    public static void main(String[] argv) {
        ClockView cv = new ClockView();
        cv.setVisible(true);
        try {
            for (;;) {
                cv.refreshTimeDisplay();
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
