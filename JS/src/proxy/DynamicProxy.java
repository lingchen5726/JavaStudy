package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
//import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    private Object sub;
    public DynamicProxy(Object subject) {
        this.sub = subject;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Call from dynamicProxy");
        method.invoke(sub, args);
        return null;
    }
    
    /*通过这种方式:
     * 被代理的对象(RealSubject)可以在运行时动态改变，
     * 需要控制的接口(Subject接口)可以在运行时改变，
     * 控制的方式(DynamicSubject类)也可以动态改变，
     * 从而实现了非常灵活的动态代理关系。
     * */
    public static void main(String[] args) throws Throwable{
        // TODO Auto-generated method stub
        RealSubject rs = new RealSubject("DynamicRealSubject");
        InvocationHandler proxy = new DynamicProxy(rs);
        Class<?> cls = rs.getClass();
        /*
        Class c = Proxy.getProxyClass(cls.getClassLoader(),cls.getInterfaces());
        Constructor ct=c.getConstructor(new Class[]{InvocationHandler.class});
        Subject subject =(Subject) ct.newInstance(new Object[]{ds});
        */
        Subject subject = (Subject)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), proxy);
        subject.request("Girl");
        
        DynamicSubject ds = new DynamicSubject("DS2");
        InvocationHandler proxy2 = new DynamicProxy(ds);
        Class<?> cls2 = ds.getClass();
        subject = (Subject)Proxy.newProxyInstance(cls2.getClassLoader(), cls2.getInterfaces(), proxy2);
        subject.request("Girl");
    }

}
