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
 * A representation of the model object '<em><b>CIM OOB Alert Service On Network Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OOBAlertServiceOnNetworkPort defines where the out-of-band alerting Service is implemented. Currently, the Service can either employ a Modem or a NetworkPort to send alerts.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertServiceOnNetworkPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::Ports' override.Antecedent='CIM_NetworkPort REF' override.Antecedent.Max='1' override.Antecedent.Description='The NetworkPort that implements the Service.' override.Dependent='CIM_OOBAlertService REF' override.Dependent.Description='The alerting Service that is provided on the NetworkPort.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_OOBAlertServiceOnNetworkPort extends CIM_DeviceServiceImplementation {
} // CIM_OOBAlertServiceOnNetworkPort
