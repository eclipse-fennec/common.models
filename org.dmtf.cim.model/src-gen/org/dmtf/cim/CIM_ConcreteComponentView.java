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
 * A representation of the model object '<em><b>CIM Concrete Component View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ConcreteComponentView instance is a view that is derived from the CIM_ConcreteComponent between a base CIM_ManagedElement (e.g., CIM_StorageExtent of a Disk Drive) and the CIM_ManagedElement it is a component of (e.g., its primordial CIM_StoragePool).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteComponentView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.45.0' UMLPackagePath='CIM::Core::CoreElements' override.GroupComponent='CIM_ManagedElement REF' override.GroupComponent.Key='true' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The CIM_ManagedElement (e.g., CIM_StoragePool) to which the CIM_Managedelement (e.g., CIM_StorageExtent of the Disk Drive) is assigned.' override.PartComponent='CIM_View REF' override.PartComponent.Key='true' override.PartComponent.Description='A View Class (e.g., CIM_DiskDriveView) instance that is assigned to the CIM_ManagedElement (e.g., CIM_StoragePool).' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ConcreteComponentView extends CIM_AbstractComponent {
} // CIM_ConcreteComponentView
