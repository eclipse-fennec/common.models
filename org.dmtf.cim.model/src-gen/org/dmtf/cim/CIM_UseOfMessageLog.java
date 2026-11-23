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
 * A representation of the model object '<em><b>CIM Use Of Message Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ManagedSystemElements may record their event, error or informational data within MessageLogs. The use of a Log to hold a ManagedSystemElement's data is described by this association. 
 * UseOfMessageLog has the same semantics as UseOfLog. Users SHOULD reference UseOfLog in lieu of this association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UseOfMessageLog()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.9.0' UMLPackagePath='CIM::System::Logs' override.Antecedent='CIM_MessageLog REF' override.Antecedent.Description='The MessageLog.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_UseOfMessageLog extends CIM_UseOfLog {
} // CIM_UseOfMessageLog
