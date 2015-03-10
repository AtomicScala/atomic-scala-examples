// Polymorphism.scala
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

class Element extends Name {
  def interact(other:Element) =
    s"$this interact $other"
}

class Inert extends Element
class Wall extends Inert

trait Material {
  def resilience:String
}
trait Wood extends Material {
  def resilience = "Breakable"
}
trait Rock extends Material {
  def resilience = "Hard"
}
class RockWall extends Wall with Rock
class WoodWall extends Wall with Wood

trait Skill
trait Fighting extends Skill {
  def fight = "Fight!"
}
trait Digging extends Skill {
  def dig = "Dig!"
}
trait Magic extends Skill {
  def castSpell = "Spell!"
}
trait Flight extends Skill {
  def fly = "Fly!"
}

class Character(var player:String="None")
  extends Element
class Fairy extends Character with Magic
class Viking extends Character
  with Fighting
class Dwarf extends Character with Digging
  with Fighting
class Wizard extends Character with Magic
class Dragon extends Character with Magic
  with Flight

val d = new Dragon
d.player = "Puff"
d.interact(new Wall) is
"Dragon interact Wall"

def battle(fighter:Fighting) =
  s"$fighter, ${fighter.fight}"
battle(new Viking) is "Viking, Fight!"
battle(new Dwarf) is "Dwarf, Fight!"
battle(new Fairy with Fighting) is
"anon, Fight!"

def fly(flyer:Element with Flight,
  opponent:Element) =
    s"$flyer, ${flyer.fly}, " +
    s"${opponent.interact(flyer)}"

fly(d, new Fairy) is
"Dragon, Fly!, Fairy interact Dragon"
