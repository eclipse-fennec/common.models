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
 * A representation of the model object '<em><b>CIM Software Feature SAP Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a ServiceAccessPoint and how it is implemented in software. The cardinality of this association is many-to-many. A SAP may be provided by more than one SoftwareFeature. When multiple SoftwareFeatures are associated with a single SAP, it is assumed that these elements operate in conjunction to provide the AccessPoint. Note that any SoftwareFeature may provide more than one ServiceAccessPoint. 
 * If different implementations of a SAP exist, each of these implementations would result in individual instantiations of the ServiceAccessPoint object. These individual instantiations would then have their own associations to the unique implementations.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareFeatureSAPImplementation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::DeploymentModel' override.Antecedent='CIM_SoftwareFeature REF' override.Antecedent.Description='The SoftwareFeature implementing the SAP.' override.Dependent='CIM_ServiceAccessPoint REF' override.Dependent.Description='The AccessPoint being implemented.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareFeatureSAPImplementation extends CIM_Dependency {
} // CIM_SoftwareFeatureSAPImplementation
