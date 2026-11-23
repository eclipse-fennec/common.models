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
 * A representation of the model object '<em><b>CIM Container View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ContainerView instance is a view that is derived from the CIM_Container between the View Class of a physical element (e.g., the Disk Drive View) and the CIM_PhysicalPackage of the ComputerSystem.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ContainerView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.45.0' UMLPackagePath='CIM::Physical::ComponentElement' override.GroupComponent='CIM_PhysicalPackage REF' override.GroupComponent.Key='true' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The CIM_PhysicalPackage for the ComputerSystem instance that groups the View Class of the physical element (e.g., the CIM_PhysicalPackage of the Disk Drive).' override.PartComponent='CIM_View REF' override.PartComponent.Key='true' override.PartComponent.Description='A View Class instance that includes CIM_PhysicalPackage information (e.g., for a CIM_DiskDrive)' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ContainerView extends CIM_AbstractComponent {
} // CIM_ContainerView
