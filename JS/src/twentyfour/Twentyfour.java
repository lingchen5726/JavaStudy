package twentyfour;

/* By Daniel Woo you can contact me: DanielYWoo.hotmail.com
 * 我没把算术优先级写进去，反正一直从左到右一口气算，如果考虑算术优先级的话，用递归不是很合适，因为递归体现的是栈型数据结构。如果要算术优先级的话，用个循环就行，而且算法比用递归还好，可能你是为了练习递归吧，如果真的开发环静下是不赞成使用递归的，所有的递归算法都可以写成非递归算法，而且通常效率更高，但是可读性比递归程序稍稍差了一点点。
 * Modified by Robert to support 1,5,5,5
 * 不支持括号。
 * */
import java.util.Random;
import java.util.Stack;

public class Twentyfour{
private	static int n=4;
private int MAX = 100;
private	int num[] = new int[n];
private Random rand = new Random();
private static Stack stk = new Stack();
public static final int OP_PLUS = 1;
public static final int OP_MINUS = 2;
public static final int OP_MULTI = 3;
public static final int OP_DIVIDE = 4;

public static void main(String args[])
{	
	Twentyfour np = new Twentyfour();
np.init();
if(np.resolve(0, 0, 0))
outputResult();
}
public static void outputResult()
{
System.out.println("\nFound!");
for(int i=0; i<=n; i++)
System.out.print(stk.pop());
}
public void init()
{
	/*
int i;	
for(i=0; i<n; i++){
num[i]=(int)(rand.nextFloat()*100);
//System.out.print("   " + num[i]);
}
	*/
	System.out.print("Quiz is:   ");
	/*
	num[0]=1;
	num[1]=5;
	num[2]=5;
	num[3]=5;
	*/
	num[0]=1;
	num[1]=2;
	num[2]=3;
	num[3]=8;
	for(int i=0; i<n; i++){
		System.out.print("   " + num[i]);
	}
}
public boolean resolve(int operation, float value, int step)
{	
if(step!=0){//if it's first step, skip these codes	
if(step>=n) //reach end of num[]
if(Math.abs(Math.abs(value)-24.0)<0.1){
pushElement(-1, value, step);	
return true;//found
}else
return false;//not found	

switch(operation){
case OP_PLUS:
value += num[step];
break;
case OP_MINUS:
value -= num[step];
break;
case OP_MULTI:
value *= num[step];
break;
case OP_DIVIDE:	
if(num[step]==0) {step--; return false;}
value = value/num[step];
break;	
}	
}else{//first step, so set initial value
value = num[0];
}

step++;	
if(resolve(OP_PLUS, value, step)) {pushElement(OP_PLUS, value, step); step--; return true;}
if(resolve(OP_MINUS, value, step)) {pushElement(OP_MINUS, value, step); step--; return true;}
if(resolve(OP_MULTI, value, step)) {pushElement(OP_MULTI, value, step); step--; return true;}
if(resolve(OP_DIVIDE, value, step)) {pushElement(OP_DIVIDE, value, step); step--; return true;}
step--;
return false;
}
public void pushElement(int i, float value, int step)
{	step--;
switch(i){
case OP_PLUS:stk.push("" + num[step] + (step==n-1 ? " = " : "  +  "));break;
case OP_MINUS:stk.push("" + num[step] + (step==n-1 ? " = " : "  -  "));break;
case OP_MULTI:stk.push("" + num[step] + (step==n-1 ? " = " : "  *  "));break;
case OP_DIVIDE:stk.push("" + num[step] + (step==n-1 ? " = " : "  /  "));break;
default:stk.push(" " + value);break;
}
}
}