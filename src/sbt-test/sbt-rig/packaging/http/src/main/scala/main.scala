package foo.http

import foo.CommonStuff

object Main extends CommonStuff {
  def main(args: Array[String]): Unit = {
    println("Hello, world.")
    Thread.currentThread.join
  }
}
