public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    User Jonasz = new User("Stefan", 30);
    User Pablo = new User("Pablo", 29);
    User Karol = new User("Karol", 19);
    User Anna = new User("Anna", 33);
    User Wojciech = new User("Wojciech", 40);
    User Karolina = new User("Karolina", 22);
    User Beata = new User("Beata", 32);
    User Eliza = new User("Eliza", 29);
    User Kazimierz = new User("Kazimierz", 60);
    User Bonifacy = new User("Bonifacy", 54);
    User Beatrycze = new User("Beatrycze", 50);
    User Tomasz = new User("Tomasz", 54);

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void main(String[] args) {
        User users[] = {Jonasz, Pablo, Karol, Anna, Wojciech, Karolina, Beata, Eliza, Kazimierz, Bonifacy, Beatrycze, Tomasz};
        int numberOfUsers = users.length;
        int sumOfAge = 0; // nie wiem co tu wpisac, więc dałem 0 żeby kod zadanie poszlo dalej
        for (int i = 0; i < numberOfUsers; i++) {
            int result = getAge(users[i]); // tu jest zgrzyt
            return result;
            System.out.println(users[i]); // tu tu też
        }
    }
        public int sumAge(int[] users) {
            int result = 0;
            for (int i = 0; i < users.length; i++) {
                result = result + users[i];
            }
            return result;
        }

    }



