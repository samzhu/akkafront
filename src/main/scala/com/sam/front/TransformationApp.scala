package com.sam.front

object TransformationApp {
  def main(args: Array[String]): Unit = {
    // starting 2 frontend nodes
    TransformationFrontend.main(Array.empty)
    TransformationFrontend.main(Array.empty)
  }
}
