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
 * A representation of the model object '<em><b>CIM OOB Alert Service On Modem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OOBAlertServiceOnModem defines where the out-of-band alerting Service is implemented. The Service can either employ a Modem or NetworkAdapter to send alerts.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OOBAlertServiceOnModem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::Modems' override.Antecedent='CIM_Modem REF' override.Antecedent.Max='1' override.Antecedent.Description='The Modem that implements the alerting Service.' override.Dependent='CIM_OOBAlertService REF' override.Dependent.Description='The alerting Service that is provided on the Modem.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_OOBAlertServiceOnModem extends CIM_DeviceServiceImplementation {
} // CIM_OOBAlertServiceOnModem
