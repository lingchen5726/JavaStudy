package twentyfour;

/*
 * 编起来很长，说个基本算法
基本程序分两部分
1.计算用户输入表达式是否正确
2.给出可能表达式
分开说
1.先提取用户输入表达式的运算符（+-*,/）,然后用if判断优先级，要多次判断，然后计算是否正确
2.基本上 是用穷举法
首先对四个数进行排列组合
对每种组合，不涉及运算顺序有
[(a ▲ b) ■ c] ★ d 
[a ▲ (b ■ c)] ★ d 
(a ▲ b) ■ (c ★ d) 
a ▲ [(b ■ c) ★ d] 
a ▲ [b ■ (c ★ d)] 
种计算
依次计算结果看是否有24即可*/

public class TP24 { 
	TP24(float a, float b, float c, float d) {
		;
	}

public static void main(String[] args) { 
new TP24(1,2,3,4); 
} 

} 