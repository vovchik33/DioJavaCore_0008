import ch.qos.logback.classic.Level;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Main.class.getName());
        logger.setLevel(Level.DEBUG);
        logger.debug("START CALCULATING...");

        List<Person> list1 = new ArrayList(
                Arrays.asList(
                        new Person[]{
                                new Person.Builder().setFirstName("Vladimir").setSecondName("Kravchenko").setAge(32).setMail("vovchik33@gmail.com").build(),
                                new Person.Builder().setFirstName("Sergey").setSecondName("Kravchenko").setAge(32).setMail("sergey@gmail.com").build(),
                                new Person.Builder().setFirstName("Vlad").setSecondName("Panchenko").setAge(32).setMail("vlad@gmail.com").build()
                        }
                )
        );
        List<Person> list2=new ArrayList(
                Arrays.asList(
                        new Person[]{
                                new Person.Builder().setFirstName("Alex").setSecondName("Kravchenko").setAge(22).setMail("vovchik33@gmail.com").build(),
                                new Person.Builder().setFirstName("Vlad").setSecondName("Panchenko").setAge(32).setMail("vlad@gmail.com").build()
                        }
                )
        );

        logger.debug("UNION");
        logger.info(String.valueOf(ArrayWrapper.union(list1, list2)));
        logger.debug("INTERSECT");
        logger.info(String.valueOf(ArrayWrapper.intersect(list1, list2)));
        logger.debug("NONOVERLAP");
        logger.info(String.valueOf(ArrayWrapper.nonOverlap(list1, list2)));
        logger.debug("CALCULATIONS COMPLETED!");
    }
}
