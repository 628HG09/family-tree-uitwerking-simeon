import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


// Arrange
// Act
// Assert
public class PersonTest {
    Person person;
    @BeforeEach
    public void init(){
    person = new Person("barbara", "Streisand", "female", 88);
    }

    @Test
    public void getName(){
//Arrange
        Person person = new Person("Barbara", "Streisand", "female",88);
        //        Act
String result = person.getName();
//        Assert
        Assertions.assertEquals("Barbara", result);
    }
@Test
    public void getfather(){
        //        arrange
//        Person person = new Person("Barbara", "Streisand", "female",88); --> kan nu weg omdat we boven @BeforeEach hebben
        Person testFather = new Person("papa", "Streisand", "male",88);
        person.setFather(testFather);
//        act
Person result = person.getFather();

//assert
        Assertions.assertEquals(testFather, result);
    }

    @Test
    public void getMiddelName(){
        // Arrange
        Person person = new Person("O", "J", "Simpson", "Male", 65);
// Act
        String result = person.getMiddleName();
// Assert
Assertions.assertEquals("J", result);
    }

    @Test
    public void getLastName(){
        String result = person.getLastname();
        Assertions.assertEquals("Streisand", result);
    }

    @Test
    public void getAge(){
        int result = person.getAge();
        Assertions.assertEquals(88, result);
    }
    @Test
    public void getMother(){
//        Person person = new Person("Barbara", "Streisand", "female",88); --> kan nu weg omdat we boven @BeforeEach hebben
        Person testMother = new Person("mama", "Streisand", "female", 67);
        person.setMother(testMother);
//        Act
        Person result = person.getMother();
// Assert
        Assertions.assertEquals(testMother, result );
    }
    @Test
    public void siblingShouldBeAddedToList(){
        // Arrange
        Person person = new Person("H", "jk", "male",56);
        Person sibling1 = new Person("Hetty", "Nieuwendijk", "female", 12);

        person.addSibling(sibling1);
// Act
        String result = person.getSiblings().get(0).getName();
// Assert
        Assertions.assertEquals(sibling1.getName(), result);
    //    Assertions.assertEquals(1, person.getSiblings().size());
//        Assertions.assertEquals(sibling1.getName(), person.getSiblings().get(0).getName());

    }
    @Test
    public void getLastNameChild(){
        // Arrange
        Person person = new Person("H", "jk", "male",56);
        Person childB = new Person("Boris", "Boef", "male", 16);
        person.addChild(childB);
// Act
        String result = person.getChildren().get(0).getLastname();
// Assert
        Assertions.assertEquals(childB.getLastname(), result);
    }
    @Test
    public void getGrandchildren(){
        Person personA = new Person("H", "jk", "male",56);
        Person personB = new Person("Boris", "Boef", "male", 16);
        Person personC = new Person("Kwik", "Duck", "male", 6);
        personA.addChild(personB);
        personB.addChild(personC);
// Act
        String result = personA.getGrandChildren().get(0).getName();
// Assert
        Assertions.assertEquals(personC.getName(), result);
    }

    @Test
    public void getPetAge(){
        // Arrange
        Pet pet1 = new Pet("H", 9, "male");
        Person person = new Person("Boris", "Boef", "male", 16);
        person.addPet(pet1);
// Act
        int result = person.getPets().get(0).getAge();
// Assert
        Assertions.assertEquals(pet1.getAge(), result);

    }
    @Test
    public void getOwner(){
        // Arrange
        Pet pet1 = new Pet("H", 9, "male");
        Person person = new Person("Boris", "Boef", "male", 16);
        pet1.setOwner(person);

// Act
        Person result = pet1.getOwner();
// Assert
        Assertions.assertEquals(pet1.getOwner(), result);
    }




}
