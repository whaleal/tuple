package com.whaleal.tuple;

import java.util.function.Function;

/**
 * A tuple that holds five values
 * @param <T1> The type of the first value held by this tuple
 * @param <T2> The type of the second value held by this tuple
 * @param <T3> The type of the third value held by this tuple
 * @param <T4> The type of the fourth value held by this tuple
 * @param <T5> The type of the fifth value held by this tuple
 *
 * @author wh
 *
 */
public final class Tuple5<T1, T2, T3, T4, T5> extends Tuple {

    private final T1 t1;
    private final T2 t2;
    private final T3 t3;
    private final T4 t4;
    private final T5 t5;


    private Tuple5( final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5 ) {
        super(t1, t2, t3, t4, t5);
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
    }

    /**
     * 创建一个包含5个元素的元组
     *
     * @param t1  第一个元素
     * @param t2  第二个元素
     * @param t3  第三个元素
     * @param t4  第四个元素
     * @param t5  第五个元素
     * @param <T1>  第一个元素类型
     * @param <T2>  第二个元素类型
     * @param <T3>  第三个元素类型
     * @param <T4>  第四个元素类型
     * @param <T5>  第五个元素类型
     * @return 元组
     * @see TupleUtil#tuple(Object, Object, Object, Object,Object,Object)
     */
    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> of(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5) {
        return new Tuple5<>(t1, t2, t3, t4, t5);
    }

    /**
     * 反转元组
     *
     * @return 反转后的元组
     *
     */
    @Override
    public Tuple5<T5, T4, T3, T2, T1> reverse() {
        return new Tuple5<>(this.t5, this.t4, this.t3, this.t2, this.t1);
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
