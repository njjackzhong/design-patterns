package factory;

public class LogTesting {

    public static void main(String[] args) {

        LogFactory databaseLogFactory = new DatabaseLogFactory();
        Log databaseLogFactoryLog = databaseLogFactory.createLog();
        databaseLogFactoryLog.writeLog("save a 99* Message to SQLServer.Table");

        LogFactory fileLogFactory = new FileLogFactory();
        Log fileLog = fileLogFactory.createLog();
        fileLog.writeLog("delete a Passport Message.");

    }

}
