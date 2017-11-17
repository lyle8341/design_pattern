/**
 * 转载：http://www.jianshu.com/p/b96b37e8b760
 *<p>=======================简单工厂模式</p>
  public interface Sender {
      public void Send();
  }
  public class MailSender implements Sender {
    @Override
    public void Send() {
      System.out.println("this is mailsender!");
    }
  }
 public class SendFactory {
   public Sender produce(String type) {
     if ("mail".equals(type)) {
      return new MailSender();
     } else if ("sms".equals(type)) {
      return new SmsSender();
     } else {
      System.out.println("请输入正确的类型!");
      return null;
     }
   }
 }
 public class FactoryTest {
   public static void main(String[] args) {
     SendFactory factory = new SendFactory();
     Sender sender = factory.produce("sms");
     sender.Send();
   }
 }
eg:在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象
 *
 *
 *<p>==========================工厂方法模式</p>

 public class SendFactory {
   public Sender produceMail(){
   return new MailSender();
   }
   public Sender produceSms(){
   return new SmsSender();
   }
 *
 *
 * <p>=============================静态工厂模式</p>
 *
 public class SendFactory {

 public static Sender produceMail(){
 return new MailSender();
 }

 public static Sender produceSms(){
 return new SmsSender();
 }
 }

 public class FactoryTest {

 public static void main(String[] args) {
 Sender sender = SendFactory.produceMail();
 sender.Send();
 }
 }
 * 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
 *
 * <p>
 *   工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，
 *   可以通过工厂方法模式进行创建。在以上的三种模式中，第一种如果传入的字符串有误，
 *   不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，
 *   我们会选用第三种——静态工厂方法模式
 * </p>
 *
 *
 *
 *<p>==================================抽象工厂模式</p>
 *<p>
 *   工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，
 *   必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，
 *   如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，
 *   直接增加新的工厂类就可以了，不需要修改之前的代码
 *</p>
 *
 public interface Sender {
  public void Send();
 }
 public class MailSender implements Sender {
 @Override
 public void Send() {
 System.out.println("this is mailsender!");
 }
 }

 public class SmsSender implements Sender {

 @Override
 public void Send() {
 System.out.println("this is sms sender!");
 }
 }


 public interface Provider {
 public Sender produce();
 }

 public class SendMailFactory implements Provider {
  @Override
  public Sender produce(){
  return new MailSender();
  }
}

 public class SendSmsFactory implements Provider{
  @Override
  public Sender produce() {
  return new SmsSender();
  }
}

 public class Test {
   public static void main(String[] args) {
   Provider provider = new SendMailFactory();
   Sender sender = provider.produce();
   sender.Send();
   }
 }
 *
 */
package com.lyle.create.工厂模式;
