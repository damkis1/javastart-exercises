package zadania.klasastring.zadanietrzy;

class Loader {
    private static final double PROGRESS_STEP = 0.5;
    private static final int NUMBER_OF_FILLINGS = 10;
    private static final int FULL_STEPS = 100;
    private static final String PROGRESS_BAR_SYMBOL = "#";
    private static final long PAUSE_TIME_MILLIS = 200;
    private static final String PRINT_FORMAT = "Wczytywanie %c %5.2f%% " + "(%-" + NUMBER_OF_FILLINGS + "s)\r";

    public static void main(String[] args) {
        double progress = 0.0;
        for (int i = 0; progress <= FULL_STEPS; i++) {
            char slash = progress % 2 == 0 ? '/' : '\\';
            String progressBar = getProgressBar(progress);
            System.out.printf(PRINT_FORMAT, slash, progress, progressBar);
            progress = i * PROGRESS_STEP;
            stop();
        }
    }

    private static String getProgressBar(double progress) {
        int howManyFilling = FULL_STEPS / NUMBER_OF_FILLINGS;
        int numberOfDots = (int) (progress / howManyFilling);
        return PROGRESS_BAR_SYMBOL.repeat(numberOfDots);
    }

    private static void stop() {
        try {
            Thread.sleep(PAUSE_TIME_MILLIS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
