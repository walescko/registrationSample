import com.walescko.people.People;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void createNewPeople (){
        People people = new People(01, "Oscar", "Eca", "123.123.120.-88", 'M');

        System.out.println(people);

    }
}
