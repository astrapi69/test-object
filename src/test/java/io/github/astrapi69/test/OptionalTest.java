package io.github.astrapi69.test;

import io.github.astrapi69.test.objects.CompanyGroup;
import io.github.astrapi69.test.objects.Employee;
import io.github.astrapi69.test.objects.Factory;
import io.github.astrapi69.test.objects.Person;
import io.github.astrapi69.test.objects.enums.Gender;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest {

    @Test
    public void testNestedOptionalOfNullable() {
        CompanyGroup companyGroup = CompanyGroup.builder().build();
        Optional<String> optionalGenderName = resolve(() -> companyGroup.getParent().getCeo().getPerson().getGender().name());

        assertFalse(optionalGenderName.isPresent());

        String undefinedGender = getCeoGender(companyGroup);
        assertEquals(undefinedGender, Gender.UNDEFINED.name());

        String ceoNickname = getCeoNickname(companyGroup);
        assertEquals(ceoNickname, "bro");
    }

    public static <T> Optional<T> resolve(Supplier<T> resolver) {
        try {
            T result = resolver.get();
            return Optional.ofNullable(result);
        }
        catch (NullPointerException e) {
            return Optional.empty();
        }
    }

    public static String getCeoGender(CompanyGroup companyGroup) {
        return Optional.ofNullable(companyGroup).map(cg -> cg.getParent())
                .map(parentFactory -> parentFactory.getCeo())
                .map(ceo -> ceo.getPerson())
                .map(person -> person.getGender())
                .map(gender -> gender.name())
                .orElse(Gender.UNDEFINED.name());
    }

    public static String getCeoNickname(CompanyGroup companyGroup) {
        return Optional.ofNullable(companyGroup).map(CompanyGroup::getParent)
                .map(Factory::getCeo)
                .map(Employee::getPerson)
                .map(Person::getNickname)
                .orElse("bro");
    }

}
