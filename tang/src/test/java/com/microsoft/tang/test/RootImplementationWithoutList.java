package com.microsoft.tang.test;

import com.microsoft.tang.annotations.Parameter;

import javax.inject.Inject;

/**
 * The root of the object graph without list
 * @see com.microsoft.tang.test.RootImplementation
 */
public class RootImplementationWithoutList implements RootInterface {
  // TODO: Remove this class after #192 is fixed
  private final String requiredString;
  private final String optionalString;
  private final UnitClass unit;
  private final Handler<String> stringHandler;
  private final Handler<Integer> integerHandler;
  private final AnInterface anInterface;
  private final int anInt;
  private final double aDouble;
  private final InjectableClass injectableClass;
  private final SetOfImplementations setOfImplementations;
  private final SetOfBaseTypes setOfBaseTypes;
  private final CyclicDependency cyclicDependency;

  @Inject
  public RootImplementationWithoutList(
      @Parameter(TestConfigurationWithoutList.RequiredString.class) final String requiredString,
      @Parameter(TestConfigurationWithoutList.OptionalString.class) final String optionalString,
      @Parameter(TestConfigurationWithoutList.StringHandler.class) final Handler<String> stringHandler,
      @Parameter(TestConfigurationWithoutList.IntegerHandler.class) final Handler<Integer> integerHandler,
      @Parameter(TestConfigurationWithoutList.NamedParameterInteger.class) final int anInt,
      @Parameter(TestConfigurationWithoutList.NamedParameterDouble.class) double aDouble,
      final UnitClass unit,
      final AnInterface anInterface,
      final InjectableClass injectableClass,
      final SetOfImplementations setOfImplementations,
      final SetOfBaseTypes setOfBaseTypes,
      CyclicDependency cyclicDependency) {

    this.requiredString = requiredString;
    this.optionalString = optionalString;
    this.unit = unit;
    this.stringHandler = stringHandler;
    this.integerHandler = integerHandler;
    this.anInterface = anInterface;
    this.anInt = anInt;
    this.aDouble = aDouble;
    this.injectableClass = injectableClass;
    this.setOfImplementations = setOfImplementations;
    this.setOfBaseTypes = setOfBaseTypes;
    this.cyclicDependency = cyclicDependency;
  }

  @Override
  public boolean isValid() {
    if (!this.setOfImplementations.isValid()) {
      return false;
    }
    if (!this.requiredString.equals(TestConfiguration.REQUIRED_STRING_VALUE)) {
      return false;
    }

    if (!this.optionalString.equals(TestConfiguration.OPTIONAL_STRING_VALUE)) {
      return false;
    }

    this.integerHandler.process(3);
    this.stringHandler.process("three");
    if (this.unit.getIntValue() != 3) {
      return false;
    }
    if (!this.unit.getStringValue().equals("three")) {
      return false;
    }
    if (this.anInterface == null) {
      return false;
    }

    if (this.aDouble != TestConfiguration.NAMED_PARAMETER_DOUBLE_VALUE) {
      return false;
    }
    if (this.anInt != TestConfiguration.NAMED_PARAMETER_INTEGER_VALUE) {
      return false;
    }

    return true;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    RootImplementationWithoutList that = (RootImplementationWithoutList) o;

    if (Double.compare(that.aDouble, aDouble) != 0) return false;
    if (anInt != that.anInt) return false;
    if (anInterface != null ? !anInterface.equals(that.anInterface) : that.anInterface != null) return false;
    if (integerHandler != null ? !integerHandler.equals(that.integerHandler) : that.integerHandler != null)
      return false;
    if (optionalString != null ? !optionalString.equals(that.optionalString) : that.optionalString != null)
      return false;
    if (requiredString != null ? !requiredString.equals(that.requiredString) : that.requiredString != null)
      return false;
    if (stringHandler != null ? !stringHandler.equals(that.stringHandler) : that.stringHandler != null) return false;
    if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
    if (injectableClass != null ? !injectableClass.equals(that.injectableClass) : that.injectableClass != null)
      return false;
    if (setOfImplementations != null ? !setOfImplementations.equals(that.setOfImplementations) : that.setOfImplementations != null)
      return false;
    if (setOfBaseTypes != null ? !setOfBaseTypes.equals(that.setOfBaseTypes) : that.setOfBaseTypes != null)
      return false;
    if (cyclicDependency != null ? !cyclicDependency.equals(that.cyclicDependency) : that.cyclicDependency != null)
      return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = requiredString != null ? requiredString.hashCode() : 0;
    result = 31 * result + (optionalString != null ? optionalString.hashCode() : 0);
    result = 31 * result + (unit != null ? unit.hashCode() : 0);
    result = 31 * result + (stringHandler != null ? stringHandler.hashCode() : 0);
    result = 31 * result + (integerHandler != null ? integerHandler.hashCode() : 0);
    result = 31 * result + (anInterface != null ? anInterface.hashCode() : 0);
    result = 31 * result + anInt;
    temp = Double.doubleToLongBits(aDouble);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
