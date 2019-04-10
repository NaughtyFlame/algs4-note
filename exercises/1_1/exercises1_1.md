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


## 1.1.21

```Java
import edu.princeton.cs.algs4.StdIn;

/**
 * Ex_1_1_21
 */
public class Ex_1_1_21 {

    public static void main(String[] args) {
        while (StdIn.hasNextLine()) {
            String name = StdIn.readString();
            int value_a = StdIn.readInt();
            int value_b = StdIn.readInt();
            System.out.printf("%8s|%8d|%8d|%8.3f\n",name, value_a, value_b, (value_a * 1.0 / value_b));
        }
    }
}
```

准备了一个测试用例`student.txt`.

```txt
Bob 6 3
Jack 7 4
Marry 9 5
```

运行方式`java Ex_1_1_21 < student.txt`

## 1.1.22

只要在迭代的rank函数中加上一个depth的参数即可。

生成n个spaces的String的参考了这个[链接](https://codereview.stackexchange.com/questions/47986/printing-80-or-more-times-the-same-character)

```Java
public static int rank(int key, int[] a, int lo, int hi, int depth) {
    if (lo > hi) return -1;
    int mid = lo + (hi - lo) / 2;
    char[] spaces_char = new char[depth];
    Arrays.fill(spaces_char, ' ');
    String spaces = new String(spaces_char);
    if (key < a[mid]) {
        System.out.print(spaces);
        System.out.printf("lo: %6d - hi: %6d\n", lo, hi);
        return rank(key, a, lo, mid - 1, depth + 1);
    } else if (key > a[mid]) {
        System.out.print(spaces);
        System.out.printf("lo: %6d - hi: %6d\n", lo, hi);
        return rank(key, a, mid + 1, hi, depth + 1);
    } else {
        return mid;
    }
}
```

## 1.1.23

判断一下`rank()`的返回值即可，这里修改了一下传入的方式，书上的代码过时了，编译的时候的警告。

运行脚本：

```shell
# for those in whitelist
java Ex_1_1_23 tinyW.txt + < tinyT.txt
# for those not whitelist
java Ex_1_1_23 tinyW.txt - < tinyT.txt
```

```Java
public static void main(String[] args) {
    In in = new In(args[0]);
    int[] whitelist = in.readAllInts();

    String check = args[1];

    Arrays.sort(whitelist);

    if (check.equals("+")) {
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) >= 0) {
                System.out.println("+ " + key);
            }
        }
    } else {
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                System.out.println("- " + key);
            }
        }
    }
}
```

## 1.1.24

```Java
public static int gcd(int p, int q) {
    System.out.println(p + " " + q);
    if (q == 0) return p;
    int r = p % q;
    return gcd(q, r);
}
```

## 1.1.25

简单证明（非归纳法）。

$a=kb+r$

设d为a,b的公约数

$r= a-kb$

$\frac{r}{d}=\frac{a}{d}-k\frac{b}{d}=m$

可知，$\frac{a}{d}$和$\frac{b}{d}$都是整数，那么d也是r的约数。

## 1.1.26

简单的交换策略。

## 1.1.27

这个题目一开始看可能会不太懂，主要是因为对二项分布不太熟悉。函数的返回的是进行N次实验，其中成功k次(成功的概率是p)。那么概率可以用递归求解。

$$P(N,k) = (1-p)*P(N-1,k) + p*P(N-1,k-1)$$

也就是说对于第N次成功k次的概率是，前N-1次成功k次并且第N次失败的概率，加上，前N-1次成功k-1次并且第N次成功的概率。
这个问题可以转换成动态规划问题。

```Java
double metric = new double[][];
// init metric here.

metric[N][K] = (1-p) * metric[N-1][K] + p * metric[N-1][K-1];
```

## 1.1.28

一开始以为是要用BinarySearch进行去重的操作。实际上只需要去重即可。
输入一个排序过的array，返回去重的array。

```Java
public static int[] duplicates(int[] array) {
    if (array.length <= 1) {
        return array;
    }
    // tag indique the end of no duplicates array.
    int tag = 0;

    for (int i = 1; i < array.length; i++) {
        if (array[i] != array[i-1]) {
            array[tag+1] = array[i];
            tag += 1;
        }
    }
    return Arrays.copyOfRange(array, 0, tag+1);
}
```

## 1.1.29

对于`rank()`函数，需要修改它的停止条件。对于目标mid,它有这样的特性，a[mid]要小于key，且a[mid+1]要大于等于key，这样的mid就是边界。

```Java
public static int rank(int key, int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    if (key > a[hi]) return hi + 1;
    while (lo <= hi) {
        int mid = lo + (hi-lo) / 2;
        if (a[mid] < key && a[mid+1] == key) {
            return mid + 1;
        } else if (a[mid] >= key) {
            hi = mid - 1;
        } else {
            lo = mid + 1;
        }
    }

    return 0;
}
```

对于`count()`函数，我们可以用`rank()`，这样就找到了目标位置的前一位，然后一一对比计数即可。

```Java
public static int count(int key, int[] a) {
    int i = rank(key, a);
    int count_equal = 0;
    while (i < a.length && a[i] == key) {
        count_equal += 1;
        i += 1;
    }

    return count_equal;
}
```

## 1.1.30

首先判断互质可以用辗转相除法，如果公约数大于1，就不是互质。(Ex_1_1_24.class中的gcd, 不过稍微要进行修改，因为输入有0和1，所以要同时对两个参数进行判断)

```Java
public static int gcd(int p, int q) {
    if (q == 0 || p == 0) return p; // check both p and q.
    int r = p % q;
    return gcd(q, r);
}
```

另外可以加速的方式是，可以用先求右上角的值，因为左下角就是i和j的顺序交换了，是否互质的结果是相同的。

```Java
for (int i = 0; i < N; i++) {
    for (int j = i; j < N; j++) {
        if (gcd(i, j) > 1) {
            metric[i][j] = false;
            metric[j][i] = false;
        } else {
            metric[i][j] = true;
            metric[j][i] = true;
        }
    }
}
```
可以看到这里只循环了右上角，可以同时给出[i,j]和[j,i]位置的值。