package pl.tiwaszko;

import pl.tiwaszko.client.Client;
import pl.tiwaszko.client.LongNameSpecification;
import pl.tiwaszko.client.OldClientSpecification;
import pl.tiwaszko.general.Specification;

/**
 * Created by tomasziwaszko on 21.02.2018.
 */
public class Example {

    public static void main(String [] args) {
        Client youngLong = new Client(13, "Kunegunda");
        Client youngShort = new Client(15, "Ala");
        Client oldLong = new Client(67, "Patrycja");
        Client oldShort = new Client(80, "Ola");

        Specification<Client> longNameSpecification = new LongNameSpecification();
        Specification<Client> oldClientSpec = new OldClientSpecification();

        Specification<Client> youngAndLongSpec = longNameSpecification.AndNot(oldClientSpec);

        System.out.println(youngAndLongSpec.isSatisfiedBy(oldLong));
    }
}
