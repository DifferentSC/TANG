/**
 * Copyright (C) 2014 Microsoft Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.tang.types;

import java.util.Set;

import com.microsoft.tang.exceptions.BindException;

public interface ClassNode<T> extends Node {

  public ConstructorDef<T>[] getInjectableConstructors();

  public ConstructorDef<T> getConstructorDef(ClassNode<?>... args)
      throws BindException;

  public ConstructorDef<T>[] getAllConstructors();

  public void putImpl(ClassNode<T> impl);
  public Set<ClassNode<T>> getKnownImplementations();
  public String getDefaultImplementation();
  public boolean isUnit();
  public boolean isInjectionCandidate();
  public boolean isExternalConstructor();

  public boolean isImplementationOf(ClassNode<?> inter);
}