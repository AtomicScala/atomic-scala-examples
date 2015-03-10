// ImportRoyalty.scala
import royals.Royalty

val royal = new Royalty("Henry", "Laughs")
val title = royal.title()
assert("Sir Laughsalot" == title,
  "Expected Sir Laughsalot, Got " + title)
