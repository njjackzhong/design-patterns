package factory;

public class DatabaseLog implements Log {
    @Override
    public void writeLog(String logContent) {
        System.out.println("DatabaseLog::writeLog(), content is: " + logContent);
    }
}
