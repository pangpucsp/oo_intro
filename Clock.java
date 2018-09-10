public class Clock {
    public static void main(String[] argv) {
        new Clock().go();
    }
    public void go() {
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
