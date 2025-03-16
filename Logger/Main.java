public class Main {
    public static void main(String[] args) {
        Logger simpleLogger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();

        simpleLogger.log("Simple logger test message");
        smartLogger.log("Smart logger test message");
        smartLogger.log("This is an ERROR message");
    }
}