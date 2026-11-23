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
 * A representation of the model object '<em><b>CIM Network Virtual Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_NetworkVirtualAdapter class has been deprecated. A specific association is not needed. Instead use the CIM_ConcreteIdentity class. 
 * Deprecated description: NetworkVirtual Adapter describes that an instance of NetworkAdapter is actually the result of several Adapters participating in a load-balanced RedundancyGroup.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkVirtualAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ConcreteIdentity\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' override.SystemElement='CIM_NetworkAdapter REF' override.SystemElement.Deprecated='[\"CIM_ConcreteIdentity.SystemElement\"]' override.SystemElement.Description='Note: The use of this method has been deprecated. \nDeprecated description: The \'virtual\' NetworkAdapter.' override.SameElement='CIM_ExtraCapacityGroup REF' override.SameElement.Deprecated='[\"CIM_ConcreteIdentity.SameElement\"]' override.SameElement.Description='Note: The use of this method has been deprecated. \nDeprecated description: The ExtraCapacity RedundancyGroup that describes the load balancing. The result of the load balancing is the \'virtual\' Adapter.' keys='SystemElement,SameElement'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkVirtualAdapter extends CIM_LogicalIdentity {
} // CIM_NetworkVirtualAdapter
