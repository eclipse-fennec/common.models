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
 * A representation of the model object '<em><b>CIM Log In Device File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MessageLogs can reside in data files, on specially allocated storage areas such as disks or memory, or output as raw I/O streams. In fact, a single Log may use each of these mechanisms to output or capture its contents. The LogInDeviceFile association describes a Log outputting to a raw I/O stream DeviceFile - for example, a serial port on a UNIX system.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogInDeviceFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::Logs' override.Antecedent='CIM_DeviceFile REF' override.Antecedent.Description='The I/O stream DeviceFile.' override.Dependent='CIM_MessageLog REF' override.Dependent.Description='The MessageLog outputting to the DeviceFile.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LogInDeviceFile extends CIM_Dependency {
} // CIM_LogInDeviceFile
