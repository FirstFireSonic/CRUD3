package my.crud.app.util;

import my.crud.app.dao.PersonDAO;
import my.crud.app.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
public class PersonValidator implements Validator {

    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        Optional<Person> personFromDb = personDAO.show(person.getName());

        if (personDAO.show(person.getName()).isPresent() && personFromDb.get().getId() != person.getId()) {
            errors.rejectValue("name", null, "Name is already taken");
        }
    }
}
