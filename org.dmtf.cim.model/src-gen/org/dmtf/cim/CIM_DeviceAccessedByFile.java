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
 * A representation of the model object '<em><b>CIM Device Accessed By File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies the LogicalDevice that is associated with, and accessed using the referenced DeviceFile.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DeviceAccessedByFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::FileElements' override.Antecedent='CIM_DeviceFile REF' override.Antecedent.Description='The DeviceFile.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Max='1' override.Dependent.Description='The Device that is accessed using the DeviceFile.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DeviceAccessedByFile extends CIM_Dependency {
} // CIM_DeviceAccessedByFile
