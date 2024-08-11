
# Consumer
它包含有一个有输入而无输出的accept接口方法； 除accept方法，它还包含有andThen这个方法

## accept
```
/**
* 对给定参数执行消费操作。
* @param t 输入参数
  */
  void accept(T t);
```

## andThen
consumer 也有 andThen方法，跟Function中作用一样，先执行调用者的accept，再执行这个after的accept

```
default Consumer<T> andThen(Consumer<? super T> after) {
    Objects.requireNonNull(after);
    return (T t) -> { accept(t); after.accept(t); };
}
```
