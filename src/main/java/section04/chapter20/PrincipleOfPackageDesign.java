package section04.chapter20;

/**
 * principle of package design
 * 包的设计原则
 *
 * granularity: the principles of package cohesion
 * 粒度:包的内聚性原则
 *
 * the reuse - release equivalence principle
 * 重用发布等价原则
 *      the granule of reuse is the granule of release
 *      重用的粒度就是发布的粒度
 *
 *      这里看着有点云里雾里，说的很邪乎，至少对我是这样。下面是我个人的见解。
 *      重用的代码放到某个包里面，某个包可以交给其他同事维护。于是就有使用方和提供方。
 *      使用方有权利使用旧版的包，提供方有权利发布新版的包。
 *      这里包可以是jar包，sdk
 *
 * the common - reuse principle
 * 共同重用原则
 *      the classes in a package are reused together. if you reuse one of the classes in a package, you reuse them all.
 *      包中的类被一起使用，使用了一个就使用了他们全部
 *      这种包就会比较小了吧
 *
 * the common closure principle
 * 共同封闭原则
 *      the classes in a package should be closed together against the same kinds of changes.
 *      包中类应该共同变化于某个诱因
 *      a change that affects a package all the classes in that package and no other package.
 *      诱因仅改变某个包，而不改变其他包
 *
 * stability: the principles of package coupling
 * 稳定性：包的耦合原则
 *
 *  the acyclic - dependency principle
 *  无循环依赖原则
 *      allow no cycles in the package dependency graph
 *      在包的依赖图中不允许有环
 *
 * the stable - dependency principle
 * 稳定依赖原则
 *      depend in the direction of stability
 *      朝着稳定的方向依赖
 *
 *  the stable - abstraction principle
 *  稳定抽象原则
 *      a package should be as abstract as it is stable
 *      包的抽象程度越高越稳定
 *
 */
public class PrincipleOfPackageDesign {
}
