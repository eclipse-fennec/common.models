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
 * A representation of the model object '<em><b>CIM Library Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Similar to the way that LogicalDevices are 'Realized' by PhysicalElements, a StorageLibrary can be realized in one or more PhysicalPackages. The LibraryPackage association explicitly defines this relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LibraryPackage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Device::StorageLib' override.Antecedent='CIM_PhysicalPackage REF' override.Antecedent.Description='The PhysicalPackage(s) that realize a StorageLibrary.' override.Dependent='CIM_StorageLibrary REF' override.Dependent.Description='The StorageLibrary.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LibraryPackage extends CIM_SystemPackaging {
} // CIM_LibraryPackage
