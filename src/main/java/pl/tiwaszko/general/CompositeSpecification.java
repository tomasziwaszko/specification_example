package pl.tiwaszko.general;

/**
 * Created by tomasziwaszko on 21.02.2018.
 */
public class CompositeSpecification<T> implements Specification<T> {
    public boolean isSatisfiedBy(T candidate) {
        return false;
    }

    public Specification<T> And(Specification<T> other) {
        return new AndSpecification<T>(this, other);
    }

    public Specification<T> AndNot(Specification<T> other) {
        return new AndNotSpecification<T>(this, other);
    }

    public Specification<T> Or(Specification<T> other) {
        return new OrSpecification<T>(this, other);
    }

    public Specification<T> OrNot(Specification<T> other) {
        return new OrNotSpecification<T>(this, other);
    }

    public Specification<T> Not() {
        return new NotSpecification<T>(this);
    }
}
