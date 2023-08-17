class DriverClass {
    public static void main(String[] args) {
        
        User user = new User.UserBuilder("Ram", "ram@gmail.com")
                    .setUserName("ram123")
                    .setLuckNumber(1)
                    .build();
        System.out.println(user.getUserName());
    }
}