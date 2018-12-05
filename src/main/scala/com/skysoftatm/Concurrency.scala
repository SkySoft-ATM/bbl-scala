package com.skysoftatm

import akka.actor.{Actor, ActorSystem, Props}

object Concurrency {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("AskTestSystem")

    system.actorOf(Props[ParentActor])
  }

  // Actor model
  // Actor: primitive for concurrent computation
  // An actor can:
  // - Send messages to other
  // - Receive and react to messages
  // - Spawn new actors
  class ChildActor extends Actor {
    def receive = {
      case "ping" => {
        println("received ping")
        sender ! "pong"
      }
      case _ => println("unknown message")
    }
  }

  class ParentActor extends Actor {
    val child = context.actorOf(Props[ChildActor])
    child ! "ping"

    def receive = {
      case "pong" => {
        println("received pong")
        child ! "ping"
      }
      case _ => println("unknown message")
    }
  }

}
