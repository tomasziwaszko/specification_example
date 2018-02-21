package pl.tiwaszko.general;

/**
 * Created by tomasziwaszko on 21.02.2018.
 */
public interface Specification<T> {
    boolean isSatisfiedBy(T candidate);
    Specification<T> And(Specification<T> other);
    Specification<T> AndNot(Specification<T> other);
    Specification<T> Or(Specification<T> other);
    Specification<T> OrNot(Specification<T> other);
    Specification<T> Not();
}
