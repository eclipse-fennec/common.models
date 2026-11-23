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
 * A representation of the model object '<em><b>CIM Service SAP Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ServiceSAPDependency is an association between a Service and a ServiceAccessPoint that indicates that the referenced SAP is utilized by the Service to provide its functionality. For example, Boot Services can invoke BIOS Disk Services (interrupts) in order to function.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceSAPDependency()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Service' override.Antecedent='CIM_ServiceAccessPoint REF' override.Antecedent.Description='The required ServiceAccessPoint.' override.Dependent='CIM_Service REF' override.Dependent.Description='The Service that is dependent on an underlying SAP.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceSAPDependency extends CIM_Dependency {
} // CIM_ServiceSAPDependency
