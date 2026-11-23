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
 * A representation of the model object '<em><b>CIM Identification Of Managed System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IdentificationOfManagedSystem is an association that links the SystemIdentification object to the CIM_System(s) that are being identified and represented in the Namespace.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IdentificationOfManagedSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Interop' override.Antecedent='CIM_System REF' override.Antecedent.Max='1' override.Antecedent.Description='The System which is identified.' override.Dependent='CIM_SystemIdentification REF' override.Dependent.Max='1' override.Dependent.Description='The SystemIdentification information.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_IdentificationOfManagedSystem extends CIM_Dependency {
} // CIM_IdentificationOfManagedSystem
