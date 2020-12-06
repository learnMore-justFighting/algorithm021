第一周的学习结束了，感觉学习到了很多东西，再参加训练营之前，leetcode上面的题目只做了不到十道，到现在已经将近三十道了，不过实战和作业的题目也不是每一道都做了五遍以上，就像老师说的那样，学习算法的误区有两点：一是非得自己做出来，为此不惜花费动辄一个小时或几个小时的时间，即使这样，也不一定能够做的出来，而且确实感到很打击。第二点就是进步并不是说又做了多少道新题，而是对之前做的题目能不能多刷多解，做到敏捷迅速，轻松写意。
关于视频学习，我觉得栈和队列的相关视频那里我还是有不懂的地方，可能还是需要多刷刷题吧，说句不好意思的，之前括号匹配的问题在我看来还挺难的，没想到在leecode上面也不过是个简单题，还是自己的算法能力不够强。

用 add first 或 add last 这套新的 API 改写 Deque 的代码

Deque<String> deque=new LinkedList<>();

deque.addFirst("a");
deque.addFirst("b");
deque.addFirst("c");
System.out.println(deque);

String str=deque.getFirst();
System.out.println(str);
System.out.println(deque);

while(deque.size()>0){
    System.out.println(deque.removeFirst());
}
System.out.println(deque);
学习笔记
