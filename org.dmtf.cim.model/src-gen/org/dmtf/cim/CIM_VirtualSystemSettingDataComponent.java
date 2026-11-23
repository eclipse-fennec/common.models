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
 * A representation of the model object '<em><b>CIM Virtual System Setting Data Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_VirtualSystemSettingDataComponent association establishes a 'part of' relationship between an instance of the CIM_VirtualSystemSettingData class and a set of instances of the CIM_ResourceAllocationSettingData class.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSettingDataComponent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.22.0' UMLPackagePath='CIM::System::SystemElements' override.GroupComponent='CIM_VirtualSystemSettingData REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='Reference to an instance of the CIM_VirtualSystemSettingData class that is the top-level object of a virtual system configuration.' override.PartComponent='CIM_ResourceAllocationSettingData REF' override.PartComponent.Description='Reference to an instance of the CIM_ResourceAllocationSettingData class representing a part of a virtual system configuration applicable to one particular virtual resource.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualSystemSettingDataComponent extends CIM_Component {
} // CIM_VirtualSystemSettingDataComponent
