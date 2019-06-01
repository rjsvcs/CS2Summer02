/**
 * Wizard example from lecture.
 */
public class Wizard {
    /**
     * The age of the wizard.
     */
    private int age;

    /**
     * The name of the wizard.
     */
    private String name;

    /**
     * Creates a wizard with the specified name and age.
     *
     * @param name The new wizard's name.
     * @param age The new wizard's age.
     */
    public Wizard(String name, int age) {
        this.age = age;
        this.name = name;
    }

    /**
     * Creates a wizard with a default name ("Hermione") and age (17).
     */
    public Wizard() {
        this("Hermione", 17);
    }

    /**
     * Returns the wizard's name.
     *
     * @return The name of the wizard.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the wizard's age.
     *
     * @param age The age of the wizard.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns a string representation of the wizard.
     *
     * @return A string in the format "Wizard[name=name, age=age]".
     */
    @Override
    public String toString() {
        return "Wizard[name=" + this.name + ", age=" + age + "]";
    }

    /**
     * Returns true if the object parameter is another wizard with the same
     * name and age as this wizard.
     *
     * @param o Another object.
     * @return True if the other object is a wizard and has the same name and
     * age as this wizard.
     */
    @Override
    public boolean equals(Object o) {
        if(o instanceof Wizard) {
            Wizard w = (Wizard)o;
            return this.name.equals(w.name) &&
                    this.age == w.age;
        } else {
            return false;
        }
    }

    /**
     * Wizard examples.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        // use the parameterless constructor to create a wizard and print it
        Wizard wiz = new Wizard();
        System.out.println(wiz);
        System.out.println(wiz.age);
        System.out.println(wiz.name);

        Wizard harry = new Wizard("Harry", 17);
        Wizard ron = new Wizard("Ron", 17);
        Wizard harry2 = new Wizard("Harry", 17);

        if(harry.equals(harry2)) {
            System.out.println("Equals!");
        } else {
            System.out.println("Not equal!");
        }

        if(harry.equals(ron)) {
            System.out.println("Harry equals Ron?!");
        } else {
            System.out.println("Harry and Ron are not equal.");
        }

    }
}
