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
 * A representation of the model object '<em><b>CIM Policy Group In System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association that links a PolicyGroup to the System in whose scope the Group is defined.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyGroupInSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Policy' override.Antecedent='CIM_System REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The System in whose scope a PolicyGroup is defined.' override.Dependent='CIM_PolicyGroup REF' override.Dependent.Weak='true' override.Dependent.Description='A PolicyGroup named within the scope of a System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyGroupInSystem extends CIM_PolicySetInSystem {
} // CIM_PolicyGroupInSystem
