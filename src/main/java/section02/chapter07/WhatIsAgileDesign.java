package section02.chapter07;

/**
 * agility design
 * 敏捷设计
 *
 * agility is about building software in tiny increments
 * 敏捷意味着以微小的增量方式构建一个软件
 *
 * with each iteration, the team improves the design of the system so that it is as good as it can be for the system as it is now.
 * 每次迭代,队伍改进设计去提升系统,仅符合当下的情况
 *
 * smell of poor design
 * 不好的设计的坏味道
 *
 * 1.rigidity - the design is hard to change.
 * 1.僵化性：很难改动,牵一发而动全身
 * 2.fragility - the design is easy to break.
 * 2.脆弱性：改动一处，逻辑上无关的地方出问题了
 * 3.immobility - the design is hard to reuse.
 * 3.牢固性: 很难解耦系统的某一部分，使之成为可以重用的功能
 * 4.viscosity - it is hard to do the right thing.
 * 4.粘滞性：很难设计保持系统的方案，或者，软件环境效率低
 * 5.needless complexity - over design.
 * 5.不必要的复杂性：过度设计
 * 6.needless repetition - mouse abuse.
 * 6.不必要的重复：滥用复制
 * 7.opacity - disorganized expression.
 * 7.晦涩性：没有有组织的表达设计意图
 *
 * design principles
 * 设计原则
 * 1.SRP - the single responsibility principle
 * 1.单一职责原则： 一个类变化的原因只有一个
 * 2.OCP - the open closed principle.
 * 2.开闭原则： 修改代码时，不用修改老的类，仅新增类即可
 * 3.LSP - the liskov substitution principle.
 * 3.里氏替换原则： 父类类型替换子类类型，程序结果不变
 * 4.DIP - the dependency inversion principle.
 * 4.依赖倒置原则： 高层定义抽象，底层实现抽象
 * 5.ISP - the interface segregation principle.
 * 5.接口隔离原则：使用接口隔离各个实现
 */
public class WhatIsAgileDesign {
}
