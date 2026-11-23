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
 * A representation of the model object '<em><b>CIM Software Feature Service Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a Service and how it is implemented in software. The cardinality of this association is many-to -many. A Service may be provided by more than one SoftwareFeature. When multiple SoftwareFeatures are associated with a single Service, it is assumed that these elements operate in conjunction to provide the Service. Note that any SoftwareFeature may provide more than one Service. 
 * If different implementations of a Service exist, each of these implementations would result in individual instantiations of the Service object. These individual instantiations would then have their own associations to the unique implementations.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareFeatureServiceImplementation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Application::DeploymentModel' override.Antecedent='CIM_SoftwareFeature REF' override.Antecedent.Description='The SoftwareFeature implementing the Service.' override.Dependent='CIM_Service REF' override.Dependent.Description='The Service being implemented.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareFeatureServiceImplementation extends CIM_Dependency {
} // CIM_SoftwareFeatureServiceImplementation
