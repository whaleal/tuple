package com.whaleal.tuple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * 创建元组工具类，使用更加简便
 *
 * @author wh
 *
 *
 */
public final class TupleUtil {

    private TupleUtil() {
    }

    /**
     * 创建Tuple0
     *
     * @return Tuple0
     */
    public static Tuple0 tuple() {
        return Tuple0.of();
    }

    /**
     * 创建Tuple1
     *
     * @param t1 元素
     * @param <T1>   元素泛型
     * @return Tuple1
     * @see Tuple1#of(Object)
     *
     */
    public static <T1> Tuple1<T1> tuple(final T1 t1) {
        return Tuple1.of(t1);
    }

    /**
     * 创建Tuple2
     *
     * @param t1 元素
     * @param t2 元素
     * @param <T1>    元素泛型
     * @param <T2>    元素泛型
     * @return Tuple2
     * @see Tuple2#of(Object, Object)
     *
     */
    public static <T1, T2> Tuple2<T1, T2> tuple(final T1 t1, final T2 t2) {
        return Tuple2.of(t1, t2);
    }

    /**
     * 创建Tuple3
     *
     * @param t1 元素
     * @param t2 元素
     * @param t3 元素
     * @param <T1>    元素泛型
     * @param <T2>    元素泛型
     * @param <T3>    元素泛型
     * @return Tuple3
     * @see Tuple3#of(Object, Object, Object)
     *
     */
    public static <T1, T2, T3> Tuple3<T1, T2, T3> tuple(final T1 t1, final T2 t2, final T3 t3) {
        return Tuple3.of(t1, t2, t3);
    }

    /**
     * 创建Tuple4
     *
     * @param t1 元素
     * @param t2 元素
     * @param t3 元素
     * @param t4 元素
     * @param <T1>    元素泛型
     * @param <T2>    元素泛型
     * @param <T3>    元素泛型
     * @param <T4>    元素泛型
     * @return Tuple4
     * @see Tuple4#of(Object, Object, Object, Object)
     *
     */
    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> tuple( final T1 t1, final T2 t2, final T3 t3, final T4 t4) {
        return Tuple4.of(t1, t2, t3, t4);
    }

    /**
     * 创建Tuple5
     *
     * @param t1  元素
     * @param t2 元素
     * @param t3  元素
     * @param t4 元素
     * @param t5  元素
     * @param <T1>    元素泛型
     * @param <T2>    元素泛型
     * @param <T3>    元素泛型
     * @param <T4>    元素泛型
     * @param <T5>    元素泛型
     * @return Tuple5
     * @see Tuple5#of(Object, Object, Object, Object, Object)
     *
     */
    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> tuple(final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5) {
        return Tuple5.of(t1, t2, t3, t4, t5);
    }

    /**
     * 创建Tuple6
     *
     * @param t1  第一个元素
     * @param t2  第二个元素
     * @param t3  第三个元素
     * @param t4  第四个元素
     * @param t5  第五个元素
     * @param t6  第六个元素
     * @param <T1>  第一个元素类型
     * @param <T2>  第二个元素类型
     * @param <T3>  第三个元素类型
     * @param <T4>  第四个元素类型
     * @param <T5>  第五个元素类型
     * @param <T6>  第六个元素类型
     * @return 元组
     * @see Tuple6#of(Object, Object, Object, Object, Object,Object)
     */
    public static < T1, T2, T3, T4, T5, T6 > Tuple6< T1, T2, T3, T4, T5, T6 > tuple( T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6 ) {
        return Tuple6.of(t1, t2, t3, t4, t5, t6);
    }

    /**
     * 创建Tuple7
     *
     * @param t1  第一个元素
     * @param t2  第二个元素
     * @param t3  第三个元素
     * @param t4  第四个元素
     * @param t5  第五个元素
     * @param t6  第六个元素
     * @param t7  第七个元素
     * @param <T1>  第一个元素类型
     * @param <T2>  第二个元素类型
     * @param <T3>  第三个元素类型
     * @param <T4>  第四个元素类型
     * @param <T5>  第五个元素类型
     * @param <T6>  第六个元素类型
     * @param <T7>  第七个元素类型
     * @return 元组
     * @see Tuple7#of(Object, Object, Object, Object, Object,Object,Object)
     */
    public static < T1, T2, T3, T4, T5, T6, T7 > Tuple7< T1, T2, T3, T4, T5, T6, T7 > tuple( T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7 ) {
        return Tuple7.of(t1, t2, t3, t4, t5, t6, t7);
    }

    /**
     * 创建Tuple8
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
     * @see Tuple8#of(Object, Object, Object, Object, Object,Object,Object,Object)
     */
    public static < T1, T2, T3, T4, T5, T6, T7, T8 > Tuple8< T1, T2, T3, T4, T5, T6, T7, T8 > tuple( T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8 ) {
        return Tuple8.of(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * 创建Tuple9
     *
     * @param t1  第一个元素
     * @param t2  第二个元素
     * @param t3  第三个元素
     * @param t4  第四个元素
     * @param t5  第五个元素
     * @param t6  第六个元素
     * @param t7  第七个元素
     * @param t8  第八个元素
     * @param t9  第九个元素
     * @param <T1>  第一个元素类型
     * @param <T2>  第二个元素类型
     * @param <T3>  第三个元素类型
     * @param <T4>  第四个元素类型
     * @param <T5>  第五个元素类型
     * @param <T6>  第六个元素类型
     * @param <T7>  第七个元素类型
     * @param <T8>  第八个元素类型
     * @param <T9>  第九个元素类型
     * @return 元组
     * @see Tuple9#of(Object, Object, Object, Object, Object,Object,Object,Object,Object)
     */
    public static < T1, T2, T3, T4, T5, T6, T7, T8, T9 > Tuple9< T1, T2, T3, T4, T5, T6, T7, T8, T9 > tuple( T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9 ) {
        return Tuple9.of(t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    /**
     * 由数组创建TupleN
     *
     * @param args 数组
     * @return TupleN
     *
     */
    public static TupleN tuple(final Object... args) {
        return TupleN.of(args);
    }

    /**
     * 元组列表针对其中某个元素排序，例如
     * <pre>{@code
     *     List<Tuple2> list = new ArrayList<>();
     *     list.add(Tuple2.of(5, "5"));
     *     list.add(Tuple2.of(2, "2"));
     *     list.add(Tuple2.of(3, "3"));
     *     list.add(Tuple2.of(1, "1"));
     *     list.add(Tuple2.of(4, "4"));
     *     //按第一列Integer类型升序
     *     Tuple.sort(list, 0, Integer::compare);
     *     //按第二列String类型升序
     *     Tuple.sort(list, 1, String::compareTo);
     *     }
     * </pre>
     *
     * @param list       需要排序的元组列表
     * @param index      用于排序的元素序号
     * @param comparator 排序函数
     * @param <T>        需要排序的数据类型
     *
     */
    public static <T> void sort(final List<? extends Tuple> list, final int index, final Comparator<T> comparator) {
        requireNonNull(list, "list is null");
        if (list.size() < 2)
            return;
        requireNonNull(comparator, "comparator is null");
        if (index < 0)
            throw new IllegalArgumentException("index must >= 0");
        list.sort(Comparator.comparing(t -> t.get(index), comparator));
    }

    /**
     * 元组数组针对其中某个元素排序，例如
     * <pre>{@code
     *     Tuple2[] array = new Tuple2[5];
     *     array[0] = Tuple2.of("5", 5);
     *     array[1] = Tuple2.of("2", 2);
     *     array[2] = Tuple2.of("3", 3);
     *     array[3] = Tuple2.of("1", 1);
     *     array[4] = Tuple2.of("4", 4);
     *     //按第一列String类型升序
     *     Tuple.sort(array, 0, String::compareTo);
     *     //按第二列Integer类型升序
     *     Tuple.sort(array, 1, Integer::compare);
     *     }
     * </pre>
     *
     * @param array      需要排序的元组数组
     * @param index      用于排序的元素序号
     * @param comparator 排序函数
     * @param <T>        需要排序的数据类型
     *
     */
    public static <T> void sort(final Tuple[] array, final int index, final Comparator<T> comparator) {
        requireNonNull(array, "array is null");
        if (array.length < 2)
            return;
        requireNonNull(comparator, "comparator is null");
        if (index < 0)
            throw new IllegalArgumentException("index must >= 0");
        Arrays.sort(array, Comparator.comparing(t -> (T)t.get(index), comparator));
    }
}
