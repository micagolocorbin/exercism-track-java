public class LogLevels {

    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        String level = logLine.split(":")[0];
        return level.replace("[", "").replace("]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        String msg = message(logLine);
        String level = logLevel(logLine);
        return String.format("%s (%s)", msg, level);
    }
}
