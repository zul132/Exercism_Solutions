public class LogLevels {
    
    public static String message(String logLine) {
        String[] splitLogLine = logLine.split(": ");
        return splitLogLine[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] splitLogLine = logLine.split(": ");
        String levelLog = splitLogLine[0];
        String level = levelLog.substring(1, levelLog.length() - 1);
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        String logMessage = message(logLine);    // returns the log message
        String logLevelLower = logLevel(logLine);    // returns the log level in lowercase
        // Now reformat the log line as specified
        String reformattedLogLine = logMessage + " (" + logLevelLower + ")";
        return reformattedLogLine;
    }
}
