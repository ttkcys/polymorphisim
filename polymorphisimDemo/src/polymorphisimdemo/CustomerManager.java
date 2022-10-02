package polymorphisimdemo;

public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Added Customer");
        this.logger.log("Log message");

    }
}
