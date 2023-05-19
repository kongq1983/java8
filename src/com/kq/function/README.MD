
# Function
Function也是一个函数式编程接口；它代表的含义是“函数”，而函数经常是有输入输出的，因此它含有一个apply方法，包含一个输入与一个输出

除apply方法外，它还有 compose 与 andThen 及 indentity 三个方法，其使用见下述示例

## apply
```
//将Function对象应用到输入的参数上，然后返回计算结果
R apply(T t);
```

## andThen
```
// 先执行调用者的apply，再执行这个after的apply
// andThen 的语义正是“一步接一步”操作,我执行完，再继续执行你
default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
    Objects.requireNonNull(after);
    return (T t) -> after.apply(apply(t));
}
```

## compose
```
// 先执行这个before的apply，再执行调用者的apply
default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
Objects.requireNonNull(before);
return (V v) -> apply(before.apply(v));
}
```
