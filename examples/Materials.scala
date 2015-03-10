// Materials.scala

trait Color
trait Texture
trait Hardness

class Fabric

class Cloth extends Fabric with Color
  with Texture with Hardness

class Paint extends Color with Texture
  with Hardness
