package Main;

import dbo.PersonDbo;
import dto.PersonDto;
import interfaz.PersonMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        getPeopleDto().forEach(System.out::println);
    }

    private static List<PersonDto> getPeopleDto(){

        return getPeople()
                .stream()
                .map(personDbo -> PersonMapper.INSTANTCE.dboToDto(personDbo))
                .collect(Collectors.toList());
    }

    private static List<PersonDbo> getPeople(){

        List<PersonDbo> people = new ArrayList<>();

        people.add(new PersonDbo(1, "Alfredo", "Solorzano"));
        people.add(new PersonDbo(2, "Laura", "Moreno"));
        people.add(new PersonDbo(3, "Danne", "Solorzano"));
        people.add(new PersonDbo(4, "Raúl", "Solorzano"));
        people.add(new PersonDbo(5, "Norma", "Solorzano"));

        System.out.println();
        System.out.println(" PersonDbo:  ");
        people.forEach(System.out::println);

        System.out.println();
        System.out.println(" PersonDto: ");

        return people;
    }

}
