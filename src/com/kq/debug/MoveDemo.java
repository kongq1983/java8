package com.kq.debug;

import com.kq.util.BinaryStringUtil;

/**
 * @author kq
 * @date 2020-07-15 13:46
 * @since 2020-0630
 */
public class MoveDemo {

    static final int HASH_BITS = 0x7fffffff;

    public static void main(String[] args) {
        int num = Integer.MAX_VALUE;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int moveRight16 = Integer.MIN_VALUE >>>16;

        int newHash = spread(num);

        System.out.println("spread="+newHash);
        System.out.println("newHash 二进制"+ BinaryStringUtil.getBinaryString(newHash));
        System.out.println("moveRight16="+moveRight16);
        System.out.println("moveRight16 二进制"+ BinaryStringUtil.getBinaryString(moveRight16));
    }


    static final int spread(int h) {
        return (h ^ (h >>> 16)) & HASH_BITS;   // HASH_BITS（0x7fffffff） = 0111 1111 1111 1111 1111 1111 1111 1111 0x7fffffff保证了是正数
    }

}
