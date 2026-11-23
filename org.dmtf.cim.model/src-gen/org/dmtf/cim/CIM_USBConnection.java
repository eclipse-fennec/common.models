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
 * A representation of the model object '<em><b>CIM USB Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * USBConnection associates a Device with the USBPort to which it is connected.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_USBConnection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::USB' override.Antecedent='CIM_USBPort REF' override.Antecedent.Max='1' override.Antecedent.Description='The USBPort.' override.Dependent='CIM_USBDevice REF' override.Dependent.Max='1' override.Dependent.Description='The USBDevice that is connected to the Port.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_USBConnection extends CIM_DeviceConnection {
} // CIM_USBConnection
