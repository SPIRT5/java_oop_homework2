import java.time.LocalDateTime;

class SmartLogger implements Logger {
    private int logCount = 0;

    @Override
    public void log(String msg) {
        logCount++;
        String level = msg.toLowerCase().contains("error") ? "ERROR" : "INFO";
        System.out.println(level + "#" + logCount + " [" + LocalDateTime.now() + "] " + msg);
    }
}