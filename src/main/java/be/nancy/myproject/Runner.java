package be.nancy.myproject;

import com.realdolmen.Person;

class Runner {
    public static void main(String[] args) {
        PersonDao dao = new StubPersonDao();
        loadPersonAndDoSomethingWithIt(dao);
    }

    private static void loadPersonAndDoSomethingWithIt(PersonDao dao) {
        // ... do your thing here
        Person p = dao.findById(1507);
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
    }
}