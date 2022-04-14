package com.whaleal.tuple;

import java.util.function.Function;

/**
 * A tuple that holds one values
 * @param <T1> The type of the first value held by this tuple
 *
 * @author wh
 *
 *
 */
public final class Tuple1< T1 > extends Tuple {

    public final T1 t1;

    private Tuple1(final T1 t1) {
        super(t1);
        this.t1 = t1;
    }

    /**
     * 创建一个包含1个元素的元组
     *
     * @param t1 第一个元素
     * @param <T1>   元素类型
     * @return 元组
     * @see TupleUtil#tuple(Object)
     *
     */
    public static <T1> Tuple1<T1> of(final T1 t1) {
        return new Tuple1<>(t1);
    }

    /**
     * 反转元组
     *
     * @return 反转后的元组
     *
     */
    @Override
    public Tuple1< T1 > reverse() {
        return new Tuple1<>(this.t1);
    }

    /**
     * 元组映射 由function 保证
     * @param mapFunction
     * @return 转换后的元组
     */
    @Override
    public Tuple map( Function< Tuple, Tuple > mapFunction ) {
        return mapFunction.apply(this);
    }
}
