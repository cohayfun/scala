
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2007, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Thu Apr 12 14:45:21 CEST 2007

package scala

/** Tuple1 is the canonical representation of a @see Product1 */
case class Tuple1[+T1](_1:T1)
  extends Product1[T1]  {

   override def toString() = {
     val sb = new compat.StringBuilder
     sb.append('(').append(_1).append(",)")
     sb.toString
   }
}
