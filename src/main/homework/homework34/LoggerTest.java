package homework.homework34;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LoggerTest.class);
        logger.info("Test INFO");
        logger.info("Homework {}. {}", 34, "Slf4J");
        logger.warn("Test WARNING");
        logger.error("Test ERROR");

    }
}
