object ExampleRunner extends App {

  // either pass the file name as an argument or specify it here
  utils.RunFile(args.headOption.getOrElse("Try.scala"))

}
