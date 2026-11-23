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
 * A representation of the model object '<em><b>CIM System Packaging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Similar to the way that LogicalDevices are 'Realized' by PhysicalElements, Systems can be associated with specific packaging or PhysicalElements. This association explicitly defines the relationship between a System and its packaging.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemPackaging()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Physical' override.Antecedent='CIM_PhysicalElement REF' override.Antecedent.Description='The PhysicalElements that provide the packaging of a System.' override.Dependent='CIM_System REF' override.Dependent.Description='The System whose packaging is described.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SystemPackaging extends CIM_Dependency {
} // CIM_SystemPackaging
