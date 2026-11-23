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
 * A representation of the model object '<em><b>CIM Replica Pool For Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialized pool for replicas is associated exclusively to one source storage element or globally to the StorageConfigurationService. Such a pool is typically used to provide storage for delta replica space consumed in small chunks by replica elements. Elements representing the storage are not required to be made explicit.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReplicaPoolForStorage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.Antecedent='CIM_EnabledLogicalElement REF' override.Antecedent.Key='true' override.Antecedent.Max='1' override.Antecedent.Description='The source storage element or the StorageConfigurationService.' override.Dependent='CIM_StoragePool REF' override.Dependent.Key='true' override.Dependent.Description='The specialized replica pool.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ReplicaPoolForStorage extends CIM_Dependency {
} // CIM_ReplicaPoolForStorage
