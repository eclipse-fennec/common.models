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
 * A representation of the model object '<em><b>CIM Operation Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_OperationLog is a specialization of the CIM_UseOfMessageLog association that identifies a reproducible record of operations for a LogicalElement.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OperationLog()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::System::Logs' override.Antecedent='CIM_MessageLog REF' override.Antecedent.Description='The Log containing reproducible operations for the associated LogicalElement.' override.Dependent='CIM_LogicalElement REF' override.Dependent.Min='1' override.Dependent.Max='1' override.Dependent.Description='The LogicalElement for the associated OperationLog.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_OperationLog extends CIM_UseOfMessageLog {
} // CIM_OperationLog
