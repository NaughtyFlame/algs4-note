# 遇到的一些问题

## tip 1

在做1.1.23时，编译会有警告，原因是有些用法已经过时。

`int[] whitelist = In.readInts(args[0]);`

改成：

`int[] whitelist = new In(args[0]).readAllInts();`

参考来源:[点击链接](https://www.v2ex.com/t/301773#r_3498963)
但是发现网站上更新了最新的代码，如题如下。

```Java
In in = new In(args[0]);
int[] whitelist = in.readAllInts();
```