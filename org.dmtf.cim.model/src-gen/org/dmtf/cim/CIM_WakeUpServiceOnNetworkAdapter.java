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
 * A representation of the model object '<em><b>CIM Wake Up Service On Network Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_WakeUpServiceOnNetworkAdapter class has been deprecated because NetworkAdapter is deprecated. Instead use the CIM_WakeUpServiceOnNetworkPort class. 
 * Deprecated description: WakeUpServiceOnNetworkAdapter defines where the WakeUpService is implemented.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WakeUpServiceOnNetworkAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_WakeUpServiceOnNetworkPort\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' override.Antecedent='CIM_NetworkAdapter REF' override.Antecedent.Deprecated='[\"CIM_WakeUpServiceOnNetworkPort.Antecedent\"]' override.Antecedent.Max='1' override.Antecedent.Description='Note: The use of this method has been deprecated. \nDeprecated description: The NetworkAdapter that implements the Service.' override.Dependent='CIM_WakeUpService REF' override.Dependent.Deprecated='[\"CIM_WakeUpServiceOnNetworkPort.Dependent\"]' override.Dependent.Description='Note: The use of this method has been deprecated. \nDeprecated description: The wakeup Service that is provided on the NetworkAdapter.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_WakeUpServiceOnNetworkAdapter extends CIM_DeviceServiceImplementation {
} // CIM_WakeUpServiceOnNetworkAdapter
