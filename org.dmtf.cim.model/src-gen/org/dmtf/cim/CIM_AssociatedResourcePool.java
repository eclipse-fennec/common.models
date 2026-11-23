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
 * A representation of the model object '<em><b>CIM Associated Resource Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associates a ResourcePool, such as a StoragePool, to an object inherited from System, for example an AdminDomain. This association identifies the ResourcePools that the System depends on.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedResourcePool()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.Antecedent='CIM_ResourcePool REF' override.Antecedent.Key='true' override.Antecedent.Description='The antecedent component.' override.Dependent='CIM_System REF' override.Dependent.Key='true' override.Dependent.Description='The dependent component.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedResourcePool extends CIM_Dependency {
} // CIM_AssociatedResourcePool
