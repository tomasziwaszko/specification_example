package pl.tiwaszko.client;

import pl.tiwaszko.general.CompositeSpecification;

/**
 * Created by tomasziwaszko on 21.02.2018.
 */
public class OldClientSpecification extends CompositeSpecification<Client> {

    @Override
    public boolean isSatisfiedBy(Client client)
    {
        return client.getAge() > 60;
    }

}
