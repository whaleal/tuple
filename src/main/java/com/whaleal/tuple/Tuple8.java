package com.whaleal.tuple;

import java.util.function.Function;

/**
 * A tuple that holds eight values
 * @param <T1> The type of the first value held by this tuple
 * @param <T2> The type of the second value held by this tuple
 * @param <T3> The type of the third value held by this tuple
 * @param <T4> The type of the fourth value held by this tuple
 * @param <T5> The type of the fifth value held by this tuple
 * @param <T6> The type of the sixth value held by this tuple
 * @param <T7> The type of the seventh value held by this tuple
 * @param <T8> The type of the eighth value held by this tuple
 *
 * @author wh
 *
 */
public final class Tuple8< T1, T2, T3, T4, T5, T6, T7, T8 > extends Tuple {
    private final T1 t1;
    private final T2 t2;
    private final T3 t3;
    private final T4 t4;
    private final T5 t5;
    private final T6 t6;
    private final T7 t7;
    private final T8 t8;


    private Tuple8( T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        super(t1, t2, t3, t4, t5, t6, t7, t8);
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
        this.t7 = t7;
        this.t8 = t8;
    }



    /**
     * 创建一个包含8个元素的元组
     *
     * @param t1  第一个元素
     * @param t2  第二个元素
     * @param t3  第三个元素
     * @param t4  第四个元素
     * @param t5  第五个元素
     * @param t6  第六个元素
     * @param t7  第七个元素
     * @param t8  第八个元素
     * @param <T1>  第一个元素类型
     * @param <T2>  第二个元素类型
     * @param <T3>  第三个元素类型
     * @param <T4>  第四个元素类型
     * @param <T5>  第五个元素类型
     * @param <T6>  第六个元素类型
     * @param <T7>  第七个元素类型
     * @param <T8>  第八个元素类型
     * @return 元组
     * @see TupleUtil#tuple(Object, Object, Object, Object,Object,Object,Object,Object)
     */
    public static < T1, T2, T3, T4, T5, T6, T7, T8 > Tuple8< T1, T2, T3, T4, T5, T6, T7, T8> of( T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8 ) {
        return new Tuple8<>(t1, t2, t3, t4, t5, t6, t7, t8);
    }


    @Override
    public Tuple8<T8,T7,T6,T5,T4,T3,T2,T1> reverse() {
        return new Tuple8<>( this.t8, this.t7, this.t6, this.t5, this.t4, this.t3, this.t2, this.t1);
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
