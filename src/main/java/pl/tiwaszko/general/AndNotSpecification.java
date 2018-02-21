package pl.tiwaszko.general;

/**
 * Created by tomasziwaszko on 21.02.2018.
 */
public class AndNotSpecification<T> extends CompositeSpecification<T> {
    private Specification<T> leftCondition;
    private Specification<T> rightCondition;

    public AndNotSpecification(Specification<T> left, Specification<T> right) {
        leftCondition = left;
        rightCondition = right;
    }

    @Override
    public boolean isSatisfiedBy(T candidate)
    {
        return leftCondition.isSatisfiedBy(candidate) && !rightCondition.isSatisfiedBy(candidate);
    }
}
