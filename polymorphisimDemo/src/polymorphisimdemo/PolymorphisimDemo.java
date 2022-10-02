package polymorphisimdemo;

public class PolymorphisimDemo {

    public static void main(String[] args) {
        EmailLogger logger = new EmailLogger();
        logger.log("Log message");
        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("database");

        System.out.println("-----------------------");

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};
        for (BaseLogger logger1 : loggers) {
            logger1.log("Log message");
        }

        System.out.println("-----------------------");

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }

}
