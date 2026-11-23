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
 * A representation of the model object '<em><b>CIM Software Element Service Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a Service and how it is implemented by one or more executable SoftwareElements. Note that this association is restricted to 'executable' Elements. In earlier phases of deployment, the SoftwareFeatureService Implementation association is adequate and recommended. 
 * The relationship between this association and Software FeatureServiceImplementation is more fully described here. SoftwareElementServiceImplementation allows the description of greater granularity than SoftwareFeatureService Implementation, when a SoftwareFeature is fully deployed and results in several executable Elements. These Elements may implement several different Services. 
 * Since SoftwareFeatures decompose into SoftwareElements, it is possible to describe how software implements a Service by using either this association or the SoftwareFeature ServiceImplementation relationship. One or the other should be chosen. Both associations should not be used for a single Service instance, since their information is redundant. 
 * This relationship is especially important when the SoftwareFeature and Product aspects are not described for a SoftwareElement (ie, when the acquisition and deployment of the software is not detailed). In this case, the Software ElementServiceImplementation association is the only one available to describe how a Service is implemented in software. Since SoftwareFeatures are not instantiated, it is not possible to use the SoftwareFeatureService Implementation association. 
 * The cardinality of this association is many-to-many. A Service may be provided by more than one SoftwareElement. If this is true, it is assumed that the SoftwareElements operate in conjunction. And, any SoftwareElement may provide more than one Service.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementServiceImplementation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Application::DeploymentModel' override.Antecedent='CIM_SoftwareElement REF' override.Antecedent.Description='The executable SoftwareElement implementing the Service.' override.Dependent='CIM_Service REF' override.Dependent.Description='The Service implemented by the SoftwareElement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareElementServiceImplementation extends CIM_Dependency {
} // CIM_SoftwareElementServiceImplementation
