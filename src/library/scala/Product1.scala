
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2007, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id: genprod.scala 10061 2007-02-20 18:06:07 +0100 (Tue, 20 Feb 2007) moors $

// generated by genprod on Thu Apr 12 14:45:21 CEST 2007

package scala

import Predef._

object Product1 {
  def unapply[T1](x: Product1[T1]): Option[Product1[T1]] =
    Some(x)
}

/** Product1 is a cartesian product of 1 components
 */
trait Product1[+T1] extends Product {

  /**
   *  The arity of this product.
   *  @return 1
   */
  @deprecated override def arity = productArity

  /**
   *  The arity of this product.
   *  @return 1
   */
  override def productArity = 1

  /**
   *  Returns the n-th projection of this product if 0&lt;=n&lt;arity,
   *  otherwise null.
   *
   *  @param n number of the projection to be returned
   *  @return  same as _(n+1)
   *  @throws  IndexOutOfBoundsException
   */
  @deprecated override def element(n: Int) = productElement(n)

  /**
   *  Returns the n-th projection of this product if 0&lt;=n&lt;arity,
   *  otherwise null.
   *
   *  @param n number of the projection to be returned
   *  @return  same as _(n+1)
   *  @throws  IndexOutOfBoundsException
   */
  override def productElement(n: Int) = n match {
    case 0 => _1
    case _ => throw new IndexOutOfBoundsException(n.toString())
  }

  /** projection of this product */
  def _1: T1


}
