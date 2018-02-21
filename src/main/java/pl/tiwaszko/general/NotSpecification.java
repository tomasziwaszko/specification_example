package pl.tiwaszko.general;

import pl.tiwaszko.general.CompositeSpecification;
import pl.tiwaszko.general.Specification;

/**
 * Created by tomasziwaszko on 21.02.2018.
 */
public class NotSpecification<T> extends CompositeSpecification<T> {
    private Specification<T> wrapped;

    public NotSpecification(Specification<T> wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public boolean isSatisfiedBy(T candidate)
    {
        return !wrapped.isSatisfiedBy(candidate);
    }
}
