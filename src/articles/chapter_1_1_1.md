## 代码

```java
{{#include ../ch1_1/Ex01.java}}
```
## 总结

体会整数相除，科学计数法，逻辑运算

## 扩展

当两个整数相除，并且需要显示小数部分时，可以通过转换其中一个操作数为`double`类型，比如上面的除法操作，可以写成：

```java
(0 + 15) / (double)2;
1.0 * (0 + 15) / 2;
(0 + 15) / 2.0;
```