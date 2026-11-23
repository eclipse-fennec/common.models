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
 * A representation of the model object '<em><b>CIM Device Service Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a Service and how it is implemented. The cardinality of this association is many-to-many. A Service can be provided by more than one Logical Device, operating in conjunction. And, any Device can provide more than one Service. When multiple Devices are associated with a single Service, it is assumed that these elements operate in conjunction to provide the Service. If different implementations of a Service exist, each of these implementations would result in individual instantiations of the Service object. These individual instantiations would then have associations to the unique implementations.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DeviceServiceImplementation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Device' override.Antecedent='CIM_LogicalDevice REF' override.Antecedent.Description='The LogicalDevice.' override.Dependent='CIM_Service REF' override.Dependent.Description='The Service implemented using the Logical Device.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DeviceServiceImplementation extends CIM_Dependency {
} // CIM_DeviceServiceImplementation
