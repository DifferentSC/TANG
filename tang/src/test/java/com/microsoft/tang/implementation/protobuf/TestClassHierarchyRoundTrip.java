package com.microsoft.tang.implementation.protobuf;

import org.junit.Test;

import com.microsoft.tang.Tang;
import com.microsoft.tang.exceptions.InjectionException;
import com.microsoft.tang.exceptions.NameResolutionException;
import com.microsoft.tang.implementation.TangImpl;
import com.microsoft.tang.implementation.TestClassHierarchy;

public class TestClassHierarchyRoundTrip extends TestClassHierarchy{

  private void setup1() {
    TangImpl.reset();
    ns = Tang.Factory.getTang().getDefaultClassHierarchy();
  }
  private void setup2() {
    TangImpl.reset();
    ns = new ProtocolBufferClassHierarchy(ProtocolBufferClassHierarchy.serialize(ns));
  }
  
  @Test
  @Override
  public void testJavaString() throws NameResolutionException {
    setup1();
    super.testJavaString();
    setup2();
    super.testJavaString();
  }
  
  @Test
  @Override
  public void testSimpleConstructors() throws NameResolutionException {
    setup1();
    super.testSimpleConstructors();
    setup2();
    super.testSimpleConstructors();
  }

  @Test
  @Override
  public void testNamedParameterConstructors() throws NameResolutionException {
    setup1();
    super.testNamedParameterConstructors();
    setup2();
    super.testNamedParameterConstructors();
  }
  @Test
  @Override
  public void testArray() throws NameResolutionException {
    setup1();
    super.testArray();
    setup2();
    super.testArray();
  }
  @Test
  @Override
  public void testRepeatConstructorArg() throws NameResolutionException {
    setup1();
    super.testRepeatConstructorArg();
    setup2();
    super.testRepeatConstructorArg();
  }
  @Test
  @Override
  public void testRepeatConstructorArgClasses() throws NameResolutionException {
    setup1();
    super.testRepeatConstructorArgClasses();
    setup2();
    super.testRepeatConstructorArgClasses();
  }
  @Test
  @Override
  public void testLeafRepeatedConstructorArgClasses() throws NameResolutionException {
    setup1();
    super.testLeafRepeatedConstructorArgClasses();
    setup2();
    super.testLeafRepeatedConstructorArgClasses();
  }
  @Test
  @Override
  public void testNamedRepeatConstructorArgClasses() throws NameResolutionException {
    setup1();
    super.testNamedRepeatConstructorArgClasses();
    setup2();
    super.testNamedRepeatConstructorArgClasses();
  }
  @Test
  @Override
  public void testResolveDependencies() throws NameResolutionException {
    setup1();
    super.testResolveDependencies();
    setup2();
    super.testResolveDependencies();
  }
  @Test
  @Override
  public void testDocumentedLocalNamedParameter() throws NameResolutionException {
    setup1();
    super.testDocumentedLocalNamedParameter();
    setup2();
    super.testDocumentedLocalNamedParameter();
  }
  @Test
  @Override
  public void testNamedParameterTypeMismatch() throws NameResolutionException {
    setup1();
    super.testNamedParameterTypeMismatch();
    setup2();
    super.testNamedParameterTypeMismatch();
  }
  @Test
  @Override
  public void testUnannotatedName() throws NameResolutionException {
    setup1();
    super.testUnannotatedName();
    setup2();
    super.testUnannotatedName();
  }
  @Test
  @Override
  public void testAnnotatedNotName() throws NameResolutionException {
    setup1();
    super.testAnnotatedNotName();
    setup2();
    super.testAnnotatedNotName();
  }
  @Test
  @Override
  public void testGenericTorture1() throws NameResolutionException {
    setup1();
    super.testGenericTorture1();
    setup2();
    super.testGenericTorture1();
  }
  @Test
  @Override
  public void testGenericTorture2() throws NameResolutionException {
    setup1();
    super.testGenericTorture2();
    setup2();
    super.testGenericTorture2();
  }
  @Test
  @Override
  public void testGenericTorture3() throws NameResolutionException {
    setup1();
    super.testGenericTorture3();
    setup2();
    super.testGenericTorture3();
  }
  @Test
  @Override
  public void testGenericTorture4() throws NameResolutionException {
    setup1();
    super.testGenericTorture4();
    setup2();
    super.testGenericTorture4();
  }
  @Test
  @Override
  public void testGenericTorture5() throws NameResolutionException {
    setup1();
    super.testGenericTorture5();
    setup2();
    super.testGenericTorture5();
  }
  @Test
  @Override
  public void testGenericTorture6() throws NameResolutionException {
    setup1();
    super.testGenericTorture6();
    setup2();
    super.testGenericTorture6();
  }
  @Test
  @Override
  public void testGenericTorture7() throws NameResolutionException {
    setup1();
    super.testGenericTorture7();
    setup2();
    super.testGenericTorture7();
  }
  @Test
  @Override
  public void testGenericTorture8() throws NameResolutionException {
    setup1();
    super.testGenericTorture8();
    setup2();
    super.testGenericTorture8();
  }
  @Test
  @Override
  public void testGenericTorture9() throws NameResolutionException {
    setup1();
    super.testGenericTorture9();
    setup2();
    super.testGenericTorture9();
  }
  @Test
  @Override
  public void testInjectNonStaticLocalArgClass() throws NameResolutionException {
    setup1();
    super.testInjectNonStaticLocalArgClass();
    setup2();
    super.testInjectNonStaticLocalArgClass();
  }
  @Test
  @Override
  public void testOKShortNames() throws NameResolutionException {
    setup1();
    super.testOKShortNames();
    setup2();
    super.testOKShortNames();
  }
  @Test
  @Override
  public void testRoundTripInnerClassNames() throws NameResolutionException, ClassNotFoundException {
    setup1();
    super.testRoundTripInnerClassNames();
    setup2();
    super.testRoundTripInnerClassNames();
  }
  @Test
  @Override
  public void testUnitIsInjectable() throws NameResolutionException, InjectionException {
    setup1();
    super.testUnitIsInjectable();
    setup2();
    super.testUnitIsInjectable();
  }
  @Test
  @Override
  public void testBadUnitDecl() throws NameResolutionException {
    setup1();
    super.testBadUnitDecl();
    setup2();
    super.testBadUnitDecl();
  }
  @Test
  @Override
  public void nameCantBindWrongSubclassAsDefault() throws NameResolutionException {
    setup1();
    super.nameCantBindWrongSubclassAsDefault();
    setup2();
    super.nameCantBindWrongSubclassAsDefault();
  }
  @Test
  @Override
  public void ifaceCantBindWrongImplAsDefault() throws NameResolutionException {
    setup1();
    super.ifaceCantBindWrongImplAsDefault();
    setup2();
    super.ifaceCantBindWrongImplAsDefault();
  }
}