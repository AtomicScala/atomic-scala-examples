echo off
cls

if not exist com/atomicscala/AtomicTest.class (
    echo scalac AtomicTest.scala
    call scalac AtomicTest.scala
) else (
    echo com/atomicscala/AtomicTest.class already exists
)

if not exist pythagorean/RightTriangle.class (
    echo scalac PythagoreanTheorem.scala
    call scalac PythagoreanTheorem.scala
) else (
    echo pythagorean/RightTriangle.class already exists
)

if not exist com/yoururl/libraryname/x.class (
    echo scalac ALibrary.scala
    call scalac ALibrary.scala
) else (
    echo com/yoururl/libraryname/x.class already exists
)

if not exist sodafountain/IceCream.class (
    echo scalac SodaFountain.scala
    call scalac SodaFountain.scala
) else (
    echo sodafountain/IceCream.class already exists
)

if not exist com/atomicscala/Name.class (
    echo scalac Name.scala
    call scalac Name.scala
) else (
    echo com/atomicscala/Name.class already exists
)

if not exist WhenAmI.class (
    echo scalac Compiled.scala
    call scalac Compiled.scala
) else (
    echo WhenAmI.class already exists
)

if not exist EchoArgs.class (
    echo scalac CompiledWithArgs.scala
    call scalac CompiledWithArgs.scala
) else (
    echo EchoArgs.class already exists
)

if not exist EchoArgs2.class (
    echo scalac CompiledWithMain.scala
    call scalac CompiledWithMain.scala
) else (
    echo EchoArgs2.class already exists
)

if not exist paintcolors/Color.class (
    echo scalac PaintColors.scala
    call scalac PaintColors.scala
) else (
    echo paintcolors/Color.class already exists
)

if not exist colorblend/package.class (
    echo scalac ColorBlend.scala
    call scalac ColorBlend.scala
) else (
    echo colorblend/package.class already exists
)

if not exist errors/Except1.class (
    echo scalac Errors.scala
    call scalac Errors.scala
) else (
    echo errors/Except1.class already exists
)

if not exist codelisting/CodeListing.class (
    echo scalac CodeListing.scala
    call scalac CodeListing.scala
) else (
    echo codelisting/CodeListing.class already exists
)

if not exist codelistingtester/CodeListingTester.class (
    echo scalac CodeListingTester.scala
    call scalac CodeListingTester.scala
) else (
    echo codelistingtester/CodeListingTester.class already exists
)

if not exist codelistingeither/CodeListingEither.class (
    echo scalac CodeListingEither.scala
    call scalac CodeListingEither.scala
) else (
    echo codelistingeither/CodeListingEither.class already exists
)

if not exist com/atomicscala/reporterr/FailMsg.class (
    echo scalac Fail.scala
    call scalac Fail.scala
) else (
    echo com/atomicscala/reporterr/FailMsg.class already exists
)

if not exist codelistingcustom/CodeListingCustom.class (
    echo scalac CodeListingCustom.scala
    call scalac CodeListingCustom.scala
) else (
    echo codelistingcustom/CodeListingCustom.class already exists
)

if not exist codevector/CodeVector.class (
    echo scalac CodeVector.scala
    call scalac CodeVector.scala
) else (
    echo codevector/CodeVector.class already exists
)

if not exist ElidingDBC.class (
    echo scalac ElidingDBC.scala
    call scalac ElidingDBC.scala
) else (
    echo ElidingDBC.class already exists
)

if not exist com/atomicscala/Logging.class (
    echo scalac Logging.scala
    call scalac Logging.scala
) else (
    echo com/atomicscala/Logging.class already exists
)

if not exist Quoting2/package.class (
    echo scalac Quoting2.scala
    call scalac Quoting2.scala
) else (
    echo Quoting2/package.class already exists
)

if not exist primesieve/Eratosthenes.class (
    echo scalac Eratosthenes.scala
    call scalac Eratosthenes.scala
) else (
    echo primesieve/Eratosthenes.class already exists
)



if exist _testerrors.txt (del _testerrors.txt)
if exist _AtomicTestErrors.txt (del _AtomicTestErrors.txt)

FOR %%I IN (
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
) DO (
echo scala %%I
CALL scala -nocompdaemon %%I 2>> _testerrors.txt
)

javac FindPrimes.java
java FindPrimes
