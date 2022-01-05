package section02.chapter10;

/**
 * liskov substitution principle
 * 里氏替换原则
 *
 * subtypes must be substitutable for their base types.
 * 子类必须可以替换掉他们的基本类型,且使得程序行为不变
 *
 * 几个启发式的不遵守里氏替换原则
 * 1.某些代码依赖于特定子类
 * 2.子类重写了父类的方法
 * 3.子类不支持父类的方法
 *
 * 改善
 * 1.基于契约设计，指定使用方式
 * 2.子类不再继承父类，而是直接成为父类的邻居
 */
public class LiskovSubstitutionPrinciple {
}
