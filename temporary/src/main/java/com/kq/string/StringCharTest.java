package com.kq.string;

/**
 * @author kq
 * @date 2021-12-28 11:02
 * @since 2020-0630
 */
public class StringCharTest {


    public static void main(String[] args) {
        String str = "one";  // ldc #2 <one>   astore_1

        String a = "a";
        String b = "b";

        String str1 = new String(str);  //  astore_1
        String str2 = new String(str);  //  astore_1

        String str3 = new String(a+b);  // a+b  new #7 <java/lang/StringBuilder> 两个invokevirtual #9 <java/lang/StringBuilder.append>
        String str4 = new String(a+b);  // a+b  new #7 <java/lang/StringBuilder> 两个invokevirtual #9 <java/lang/StringBuilder.append>

        System.out.println("");

    }

    //StringBuilder
//    public String toString() {
//        // Create a copy, don't share the array
//        return new String(value, 0, count);
//    }

    // append
//    AbstractStringBuilder append(AbstractStringBuilder asb) {
//        if (asb == null)
//            return appendNull();
//        int len = asb.length();
//        ensureCapacityInternal(count + len);
//        asb.getChars(0, len, value, count);
//        count += len;
//        return this;
//    }
}
