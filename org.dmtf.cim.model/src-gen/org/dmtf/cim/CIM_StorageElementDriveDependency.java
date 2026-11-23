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
 * A representation of the model object '<em><b>CIM Storage Element Drive Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_StorageElementDriveDependency is used to show dependency between a disk drive and storage elements such as StorageVolumes.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageElementDriveDependency()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.Antecedent='CIM_DiskDrive REF' override.Antecedent.Key='true' override.Antecedent.Description='Antecedent represents the independent disk drive in this association.' override.Dependent='CIM_LogicalElement REF' override.Dependent.Key='true' override.Dependent.Description='Dependent represents the element that is dependent on the disk drive.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_StorageElementDriveDependency extends CIM_Dependency {
} // CIM_StorageElementDriveDependency
