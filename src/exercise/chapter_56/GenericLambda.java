package exercise.chapter_56;

@FunctionalInterface
public interface GenericLambda<T> {
    T calculate(T t);
}
