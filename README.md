# SortedDividerViewGroup

- 此View功能是可以动态添加有序号的view,比如有3个view,分别编号1,2,3
然后我们可以随便顺序添加这三个view,比如添加顺序为321,最后显示的结果都是123有序的View

- 里面的分割线也是一样的,实现原理是每个view默认前面都是有一个divider的,当然第一个默认不显示。
随着view的不断添加,divider也会跟着添加。

- 由于有些时候divider不是需要的,例如1跟2就需要直接相邻,不需要分割线,那么就可以调用方法屏蔽2的分割线即可。

- 在移除view的时候,分割线也会跟随移除的。


- 总之,我们只要预先定好顺序,就可以随意的往里面添加view,不用关心先后顺序。

![image](https://github.com/yk3372/SortedDividerViewGroup/blob/master/captures/device_1.png)
![image](https://github.com/yk3372/SortedDividerViewGroup/blob/master/captures/device_2.png)
