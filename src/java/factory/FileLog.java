package factory;

public class FileLog implements Log{
    @Override
    public void writeLog(String logContent) {
        System.out.println("FileLog::writeLog(), content is: " + logContent);
    }
}
