# ALGS CHAPTER1 Fundamentals Exercises

## 1.1.1

- a.`7`
- b.`200.0000002`
- c.`true`

## 1.1.2

- a. `1.618` double 
- b. `10.0`  double
- c. `true`  boolean
- d. `"33"`  String

## 1.1.3

[source](./Ex_1_1_3.java)

```Java
public class Ex_1_1_3 {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a==b && b==c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
```

## 1.1.4

- a. then多余
- b. statement缺少`()`
- c. 正确
- d. `c = 0;`

## 1.1.5

[source](./Ex_1_1_5.java)

```Java
public class Ex_1_1_5 {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        if ((0 < x  &&  x < 1) && (0 < y && y < 1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
```

## 1.1.6

Fibonacci sequence

## 1.1.7

- a. `3.00009`
- b. `999`
- c. `1000000`

## 1.1.8

- a.`b`
- b.`197`
- c.`e`

## 1.1.9

[source](./Ex_1_1_9.java)

```Java
public class Ex_1_1_9 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }

        System.out.println(s);
    }
}
```

## 1.1.10

需要用`new`为`a[]`分配内存。

## 1.1.11

代码分成两部分，第一部分根据给定的大小随机生成array，第二部分为打印array.
运行方式`java Ex_1_1_11 4 5`,其中4,5分别是行数的列数，可自由修改。

```Java
public class Ex_1_1_11 {

    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        boolean[][] array = new boolean[row][col];

        // init the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (StdRandom.uniform(0.0, 1.0) > 0.5) {
                    array[i][j] = true;
                } else {
                    array[i][j] = false;
                }
            }
        }

        // print out the col num
        System.out.printf(" ");
        for (int j = 0; j < col; j++) {
            System.out.printf("%2d", j);
        }
        System.out.print("\n");
        // 
        for (int i = 0; i < row; i++) {
            System.out.printf("%d", i);
            for (int j = 0; j < col; j++) {
                if (array[i][j] == true) {
                    System.out.printf("%2s", "*");
                } else {
                    System.out.printf("%2s", " ");
                }
            }
            System.out.print("\n");
        }
    }
}
```

## 1.1.12

```Shell
0
1
2
3
4
5
6
7
8
9
```

## 1.1.13

从先行再列遍历改成先列后行遍历即可。

```Java
import edu.princeton.cs.algs4.StdRandom;
public class Ex_1_1_13 {

    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        int[][] array = new int[row][col];
        int value;
        // random generate array with given array size
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = StdRandom.uniform(0, 10);
                System.out.printf("%2d", array[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("transpositon...");

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.printf("%2d", array[i][j]);
            }
            System.out.print("\n");
        }

    }
}
```

## 1.1.14

从1开始，不断乘以2进行判断，使用while循环。

```Java
public class Ex_1_1_14 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(lg(N));
    }

    public static int lg(int N) {
        int res = 1;

        while (res <= N) {
            res *= 2;
        }

        return res / 2;
    }
}
```

## 1.1.15

用`StdRandom`生成固定长度的Array,然后调用编写的method.

```Java
import java.util.Arrays;
import edu.princeton.cs.algs4.StdRandom;
/**
 * Ex_1_1_15
 */
public class Ex_1_1_15 {

    public static int[] histogram(int[] a, int M) {
        int[] res = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < M) {
                res[a[i]] += 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // random generate array.
        int len_array = 10;
        int[] array = new int[len_array];
        for (int i = 0; i < array.length; i++) {
            array[i] = StdRandom.uniform(0, 6);
        }
        int[] res = histogram(array, 3);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(res));
    }
}
```

## 1.1.16

311361142246

## 1.1.17

递归的停止条件在后，所以永远不对到达，没法停止循环。

## 1.1.18

`mystery(2, 25) = 50`
`mystery(3, 11) = 33`
这是乘法的递归实现，注意看`mystery(a+a, b/2)`，相当于将a翻倍，系数b减半。将`+`改成`*`，是指数的递归实现，`mystery(a, b) = a^b`

## 1.1.19

计算Fibonacci数列很多中间值都是被重复计算的，可以把中间值保存，当F(N)已经被计算过的时候就直接读取，不用在递归计算了。

```Java
private static long[] array = new long[100];

public static long F(int N) {
    if (N == 0) {
        array[0] = 0;
    } else if (N == 1) {
        array[1] = 1;
    } else {
        array[N] = array[N-1] + array[N-2];

    return array[N];
}
```

## 1.1.20

求解 $ln(N!)$ 可以转换成$\sum_{k=1}^N ln(N)$,这样处理可以提高使运行不溢出的N的上界。

```Java
public static double lnN(int N) {
    if (N==1) {
        return 0;
    } else {
        return lnN(N-1) + Math.log(N);
    }
}
```