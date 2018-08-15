package com.epam.lowcost.dao;

import com.epam.lowcost.model.AbstractEntity;
import java.util.stream.Stream;

public interface Dao<T extends AbstractEntity> {



    T add(T t);

//    Optional<T> findById(long id) {
//        /*
//        @Autowired
//        SessionFactory ss;
//        return (Optional<T>) sf.;
//        */
//    }

    <U extends T> U update(U t);

    <U extends T> Dao<T> delete(U u);


    <U extends T> Stream<U> findAll();

//    default <R> R mapAll(Function<Stream<T>,R> mapper) {
//        @Cleanup val stream = findAll();
//        return mapper.apply(stream);
//    }

//    default void withAll(Consumer<Stream<T>> mapper) {
//        @Cleanup val stream = findAll();
//        mapper.accept(stream);
//    }



//   default long count() {
//        return mapAll(Stream::count);
//

}
