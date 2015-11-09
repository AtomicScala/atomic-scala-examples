package utils

import scala.tools.nsc.{ScriptRunner, GenericRunnerSettings}

object RunFile {
  
  def apply(file: String) = {
    val settings = new GenericRunnerSettings(println _)
    settings.nc.value = true
    settings.usejavacp.value = true
    ScriptRunner.runScript(settings, "examples/" + file, List.empty[String])
  }

}
