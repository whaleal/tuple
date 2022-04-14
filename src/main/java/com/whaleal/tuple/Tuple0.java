package com.whaleal.tuple;

import java.util.function.Function;

/**
 * A tuple that holds zero values
 *
 * @author wh
 *
 *
 */
public final class Tuple0 extends Tuple {

    private static final Object[] EMPTY    = new Object[]{};
    private static final Tuple0   INSTANCE = new Tuple0();

    private Tuple0() {
        super(EMPTY);
    }

    /**
     * 反转元组
     *
     * @return 反转后的元组
     *
     */
    @Override
    public Tuple0 reverse() {
        return this;
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

    /**
     * 得到一个包含0个元素的元组
     *
     * @return 元组
     *
     * @see TupleUtil#tuple()
     *
     */
    public static Tuple0 of() {
        return INSTANCE;
    }
}
