// 1. Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.
// 2. Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
// 3. If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
// 4. Immutable objects can be built without much complex logic in the object building process.

class User {
    // required fields
    private String name;
    private String email;
    // optional fields
    private String userName;
    private int luckyNumber;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.userName = builder.userName;
        this.luckyNumber = builder.luckyNumber;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getUserName() {
        return userName;
    }
    public int luckyNumber() {
        return luckyNumber;
    }

    public static class UserBuilder {
        // required fields
        private String name;
        private String email;
        // optional fields
        private String userName;
        private int luckyNumber;

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }
        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public UserBuilder setLuckNumber(int number) {
            this.luckyNumber = number;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}