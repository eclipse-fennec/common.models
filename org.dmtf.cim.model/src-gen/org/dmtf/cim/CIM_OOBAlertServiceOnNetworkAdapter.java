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
 * A representation of the model object '<em><b>CIM OOB Alert Service On Network Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of CIM_OOBAlertServiceOnNetworkAdapter has been deprecated because NetworkAdapter has been deprecated. Instead use the CIM_OOBAlertServiceOnNetworkPort class. 
 * Deprecated description: OOBAlertServiceOnNetworkAdapter defines where the out-of-band alerting Service is implemented.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertServiceOnNetworkAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_OOBAlertServiceOnNetworkPort\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' override.Antecedent='CIM_NetworkAdapter REF' override.Antecedent.Deprecated='[\"CIM_OOBAlertServiceOnNetworkPort.Antecedent\"]' override.Antecedent.Max='1' override.Antecedent.Description='Note: The use of this method has been deprecated. \nDeprecated description: The NetworkAdapter that implements the Service.' override.Dependent='CIM_OOBAlertService REF' override.Dependent.Deprecated='[\"CIM_OOBAlertServiceOnNetworkPort.Dependent\"]' override.Dependent.Description='Note: The use of this method has been deprecated. \nDeprecated description: The alerting Service that is provided on the NetworkAdapter.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_OOBAlertServiceOnNetworkAdapter extends CIM_DeviceServiceImplementation {
} // CIM_OOBAlertServiceOnNetworkAdapter
