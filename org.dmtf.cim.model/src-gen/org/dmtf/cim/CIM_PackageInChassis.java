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
 * A representation of the model object '<em><b>CIM Package In Chassis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Chassis can contain other Packages, such as other Chassis and Cards. The PackageInChassis association makes explicit this relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PackageInChassis()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Package' override.GroupComponent='CIM_Chassis REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The Chassis that contains other PhysicalPackages.' override.PartComponent='CIM_PhysicalPackage REF' override.PartComponent.Description='The PhysicalPackage which is contained in the Chassis.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PackageInChassis extends CIM_Container {
} // CIM_PackageInChassis
