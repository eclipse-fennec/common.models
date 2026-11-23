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
 * A representation of the model object '<em><b>CIM Allocated Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between LogicalDevices and SystemResources, indicating that the Resource is assigned to the Device.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedResource()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::SystemResources' override.Antecedent='CIM_SystemResource REF' override.Antecedent.Description='The Resource.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The LogicalDevice to which the Resource is assigned.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AllocatedResource extends CIM_Dependency {
} // CIM_AllocatedResource
