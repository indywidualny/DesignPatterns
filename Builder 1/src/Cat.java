/**
 * Created by Krzysztof Grabowski on 13.08.16.
 * Design Patterns
 * Builder + Fluent interface
 */
public class Cat {

    private String name;
    private String owner;
    private int age;

    private Cat(final Builder builder) {
        this.name = builder.name;
        this.owner = builder.owner;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {

        private final String name;
        private String owner;
        private int age;

        public Builder(final String name) {
            this.name = name;
        }

        public Builder owner(final String owner) {
            this.owner = owner;
            return this;
        }

        public Builder age(final int age) {
            this.age = age;
            return this;
        }

        public Cat build() {
            return new Cat(this);
        }

    }

}
