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
 * A representation of the model object '<em><b>CIM Diagnostics Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiagnosticsLog is being deprecated in order to change the class name to DiagnosticLog. This is being done to follow the naming convention used for other diagnostic model classes. 
 * DiagnosticsLog serves as an aggregation point for DiagnosticRecord objects. This class exists in order to encourage the use of a consolidated record management methodology for diagnostics. A common set of providers for this log and its associated records SHOULD be used to control functions such as record persistence, query support and overall data integrity in a consistent manner.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticsLog()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_DiagnosticLog\"]' Version='2.22.0' UMLPackagePath='CIM::System::Logs' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticsLog extends CIM_RecordLog {
} // CIM_DiagnosticsLog
