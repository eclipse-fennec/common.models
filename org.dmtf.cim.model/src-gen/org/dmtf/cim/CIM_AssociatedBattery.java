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
 * A representation of the model object '<em><b>CIM Associated Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LogicalDevice might use or require one or more Batteries. This relationship is described by the AssociatedBattery dependency. It is also possible to model the individual Batteries that comprise a UPS, using this association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedBattery()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::CoolingAndPower' override.Antecedent='CIM_Battery REF' override.Antecedent.Description='The Battery.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The LogicalDevice that needs or is associated with the Battery.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedBattery extends CIM_Dependency {
} // CIM_AssociatedBattery
