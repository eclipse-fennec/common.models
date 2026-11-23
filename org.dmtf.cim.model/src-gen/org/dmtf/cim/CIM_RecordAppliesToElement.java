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
 * A representation of the model object '<em><b>CIM Record Applies To Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ManagedSystemElements may create RecordForLog objects to record their event, error or informational data within Logs. The relationship between these managed elements and the records they create is described by this association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RecordAppliesToElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.9.0' UMLPackagePath='CIM::System::Logs' override.Antecedent='CIM_RecordForLog REF' override.Antecedent.Description='The Record.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Description='The ManagedSystemElement that participated in the creation of the Record.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RecordAppliesToElement extends CIM_Dependency {
} // CIM_RecordAppliesToElement
