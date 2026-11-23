/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Application System Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This dependency expresses use-relationships or other logical interactions between application systems. At the business level, the relationship could be due to a distributed business process. Viewed from the technical level, the relationship is to be interpreted as communication between application systems. ApplicationSystemDependency primarily expresses 'horizontal' relationships, i.e., relationships between distributed or local application systems.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ApplicationSystemDependency()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::AppRuntime' override.Antecedent='CIM_ApplicationSystem REF' override.Antecedent.Description='Antecedent represents the independent application system in this association.' override.Dependent='CIM_ApplicationSystem REF' override.Dependent.Description='Dependent represents the application system dependent on the Antecedent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ApplicationSystemDependency extends CIM_Dependency {
} // CIM_ApplicationSystemDependency
