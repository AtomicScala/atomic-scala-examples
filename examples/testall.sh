#!/bin/bash

trap 'exit' INT TERM # exit when interrupted or terminated
clear

conditionalCompile() {
  if [ ! -e "$1" ]
  then
	  echo scalac "$2"
	  scalac "$2"
  else
	  echo "$1" already exists
  fi
}

conditionalCompile com/atomicscala/AtomicTest.class AtomicTest.scala
conditionalCompile pythagorean/RightTriangle.class PythagoreanTheorem.scala
conditionalCompile com/yoururl/libraryname/x.class ALibrary.scala
conditionalCompile sodafountain/IceCream.class SodaFountain.scala
conditionalCompile com/atomicscala/Name.class Name.scala
conditionalCompile WhenAmI.class Compiled.scala
conditionalCompile EchoArgs.class CompiledWithArgs.scala
conditionalCompile EchoArgs2.class CompiledWithMain.scala
conditionalCompile paintcolors/Color.class PaintColors.scala
conditionalCompile colorblend/package.class ColorBlend.scala
conditionalCompile errors/Except1.class Errors.scala
conditionalCompile codelisting/CodeListing.class CodeListing.scala
conditionalCompile codelistingtester/CodeListingTester.class CodeListingTester.scala
conditionalCompile codelistingeither/CodeListingEither.class CodeListingEither.scala
conditionalCompile com/atomicscala/reporterr/FailMsg.class Fail.scala
conditionalCompile codelistingcustom/CodeListingCustom.class CodeListingCustom.scala
conditionalCompile codevector/CodeVector.class CodeVector.scala
conditionalCompile ElidingDBC.class ElidingDBC.scala
conditionalCompile com/atomicscala/Logging.class Logging.scala
conditionalCompile Quoting2/package.class Quoting2.scala
conditionalCompile primesieve/Eratosthenes.class Eratosthenes.scala

rm -fv _testerrors.txt _testoutput.txt _AtomicTestErrors.txt

scripts=(
Values.scala
Types.scala
Expressions.scala
If.scala
If2.scala
If3.scala
If4.scala
If5.scala
BMI.scala
EvaluationOrder.scala
IntegerMath.scala
CompoundExpressions1.scala
CompoundExpressions2.scala
CompoundExpressions3.scala
CompoundBMI.scala
MultiplyByTwo.scala
AddMultiply.scala
Animals.scala
Hyena.scala
Dog.scala
Cat.scala
Hamster.scala
ImportClass.scala
ImportMultiple.scala
ImportSameLine.scala
ImportCombined.scala
ImportNameChange.scala
ImportEverything.scala
FullyQualify.scala
ImportPythagorean.scala
TestingExample.scala
TDDFail.scala
TDDStillFails.scala
TDDWorks.scala
Cup.scala
Cup2.scala
For.scala
Vectors.scala
TrueOrFalse.scala
OneOrTheOther.scala
CheckTruth.scala
UseALibrary.scala
UsingAtomicTest.scala
BasicMethods.scala
VectorCollection.scala
ClassBodies.scala
Temperature.scala
TicTacToe.scala
ForVector.scala
ForWithRanges.scala
RangeShorthand.scala
MatchExpressions.scala
ClassArg.scala
VisibleClassArgs.scala
MultipleClassArgs.scala
VariableClassArgs.scala
NamedArguments.scala
NamedAndDefaultArgs.scala
Family.scala
Overloading.scala
OverloadingAdd.scala
Coffee.scala
GardenGnome.scala
CaseClasses.scala
StringInterpolation.scala
ExpressionInterpolation.scala
CaseClassInterpolation.scala
ParameterizedTypes.scala
ParameterizedReturnTypes.scala
DisplayVector.scala
DisplayVectorWithAnonymous.scala
DisplayDuck.scala
DisplayDuckTestable.scala
TwoArgAnonymous.scala
CallLater.scala
AssignAnonymous.scala
SimpleMap.scala
Sum.scala
Reduce.scala
MoreReduce.scala
Comprehension.scala
Yielding.scala
Yielding2.scala
Yielding3.scala
Yielding4.scala
PatternMatchingWithTypes.scala
PatternMatchingCaseClasses.scala
Brevity1.scala
Brevity2.scala
Brevity3.scala
Brevity4.scala
Brevity5.scala
Brevity6.scala
Alias.scala
MethodParentheses.scala
Molecule.scala
Swearing.scala
Bicycle.scala
Surrey.scala
SurreyWithToString.scala
ReturnBlob.scala
Tuples.scala
TupleUnpacking.scala
CaseUnpack.scala
ObjectsAndMethods.scala
ThisKeyword.scala
ObjectKeyword.scala
CompanionObject.scala
ObjectField.scala
ObjectMethods.scala
ObjCounter.scala
FactoryMethod.scala
GreatApe.scala
GreatApe2.scala
AuxiliaryInitialization.scala
GreatApe3.scala
Level.scala
AbstractKeyword.scala
AbstractClasses.scala
AbstractAdder.scala
Materials.scala
TraitBodies.scala
TraitInheritance.scala
TraitCollision.scala
Framework.scala
UniformAccess.scala
LinearRegression.scala
Solid.scala
Polymorphism.scala
House1.scala
House2.scala
House3.scala
House4.scala
House5.scala
AerobicExercise.scala
TaggingTrait.scala
Resilience.scala
Constraint.scala
MaltShoppe.scala
SeqOperations.scala
RecursivePrint.scala
RecursiveSum.scala
CollectionSums.scala
Zipper.scala
IndexWithZip.scala
ZipMap.scala
Sets.scala
RemoveDuplicates.scala
Maps.scala
PetMap.scala
ChangingAVal.scala
AnUnchangingVar.scala
References.scala
ImmutableMaps.scala
MutableMaps.scala
ColorBlendTest.scala
ColorBlendMap.scala
DivZero.scala
MultipleExceptions.scala
CodeListingTest.scala
DivZeroEither.scala
MultiEitherErrors.scala
ShowListingEither.scala
EitherMap.scala
Banded.scala
BandedOption.scala
ComprehensionOption.scala
OptionOperations.scala
OptionChaining.scala
OptionMap.scala
AddNewArguments.scala
DivZeroTry.scala
Try.scala
TryRecover.scala
PigInt.scala
ContainerOfOne.scala
TryTransform.scala
IntPercent.scala
Catching.scala
TryComprehension.scala
ShowListingTry.scala
CustomErrors.scala
FailMsgDemo.scala
UsingFail.scala
DivZeroCustom.scala
ShowListingCustom.scala
ShowCode.scala
DesignByContract.scala
LoggingTest.scala
Quoting.scala
Quote.scala
ExtensionMethodArguments.scala
Shape_Inheritance.scala
Shape_TypeClass.scala
)

for script in "${scripts[@]}"; do
    echo scala "${script}"
    scala -nocompdaemon "${script}" > >(tee -a _testoutput.txt) \
        2> >(tee -a _testerrors.txt >&2)
done

javac FindPrimes.java
java FindPrimes
