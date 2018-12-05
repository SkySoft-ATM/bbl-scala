package com.skysoftatm

class PatternMatching {
  // Pattern matching
  def match1(i: Int): String = {
    i match {
      case 1 => return "one"
      case 2 => return "two"
      case _ => return "something else"
    }
  }

  // Sugar
  def match2(i: Int): String = i match {
    case 1 => "one"
    case 2 => "two"
    case _ => "something else"
  }

  // Case classes
  abstract class Notification

  case class Email(sender: String, title: String, body: String) extends Notification

  case class SMS(caller: String, message: String) extends Notification

  // How to display a notification depending on the notification type
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        s"You got an email from $email with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
    }
  }
}
