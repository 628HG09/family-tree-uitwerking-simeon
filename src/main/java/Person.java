import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastname;
    private String sex;
    private int age;
    private Person mother;
    private Person father;


    private List<Person>siblings = new ArrayList<>();
    private List<Person>children = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();

    public Person(String name, String middleName, String lastname, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String lastname, String sex, int age) {
        this.name = name;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addParents(Person mother, Person father){
        this.mother = mother;
        this.father = father;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    public void addPet(Pet pet){
        pets.add(pet);
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person>siblings) {
        this.siblings = siblings;
    }
    public void addSibling(Person sibling){
    siblings.add(sibling);
    }
    public void addChild(Person child){
        children.add(child) ;

    }
    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }
    public List<Person> getGrandChildren(){
        List<Person> grandChildren = new ArrayList<>();
        for ( Person child : children ) {
            // .addAll is makkelijkere optie. Intern staat er een for-loop zoals wij hierna gebruiken
//            grandChildren.addAll(children);
           for (Person grandChild : child.getChildren()){
               grandChildren.add(grandChild);
            }

        }
        return grandChildren;

    }




}
