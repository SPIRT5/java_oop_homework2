import java.time.LocalDateTime;

class SimpleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("[" + LocalDateTime.now() + "] " + msg);
    }
}