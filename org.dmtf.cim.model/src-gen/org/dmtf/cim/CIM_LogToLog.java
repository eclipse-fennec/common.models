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
 * A representation of the model object '<em><b>CIM Log To Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This associates a log entry to another log (for example, a subtest log).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogToLog()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::System' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Key='true' override.Antecedent.Description='A reference to the instance of CIM_RecordInLog in the\nparent log.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Key='true' override.Dependent.Description='A reference to a CIM_Log that is dependent on the Antecedent (parent log).' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LogToLog extends CIM_Dependency {
} // CIM_LogToLog
