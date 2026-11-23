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
 * A representation of the model object '<em><b>CIM Process Executable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link between a Process and a DataFile indicating that the File participates in the execution of the Process.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProcessExecutable()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::Processing' override.Antecedent='CIM_DataFile REF' override.Antecedent.Description='The DataFile participating in the execution of the Process.' override.Dependent='CIM_Process REF' override.Dependent.Description='The Process.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ProcessExecutable extends CIM_Dependency {
} // CIM_ProcessExecutable
