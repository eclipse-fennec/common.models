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
 * A representation of the model object '<em><b>CIM Software Element SAP Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a ServiceAccessPoint and how it is implemented by one or more executable SoftwareElements. Note that this association is restricted to 'executable' Elements. In earlier phases of deployment, the Software FeatureSAPImplementation association is adequate and recommended. 
 * The relationship between this association and Software FeatureSAPImplementation is more fully described here. SoftwareElementSAPImplementation allows the description of greater granularity than SoftwareFeatureSAPImplementation, when a SoftwareFeature is fully deployed and results in several executable Elements. These Elements may implement several different ServiceAccessPoints. 
 * Since SoftwareFeatures decompose into SoftwareElements, it is possible to describe how software implements a SAP by using either this association or the SoftwareFeatureSAP Implementation relationship. One or the other should be chosen. Both associations should not be used for a particular AccessPoint, since their information is redundant. 
 * This relationship is especially important when the SoftwareFeature and Product aspects are not described for a SoftwareElement (ie, when the acquisition and deployment of the software is not detailed). In this case, the Software ElementSAPImplementation association is the only one available to describe how an AccessPoint is implemented in software. Since SoftwareFeatures are not instantiated, it is not possible to use the SoftwareFeatureSAP Implementation association. 
 * The cardinality of this association is many-to-many. A ServiceAccessPoint may be provided by more than one Software Element. (If this is true, it is assumed that the Software Elements operate in conjunction.) And, any SoftwareElement may provide more than one SAP.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementSAPImplementation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Application::DeploymentModel' override.Antecedent='CIM_SoftwareElement REF' override.Antecedent.Description='The executable SoftwareElement implementing the SAP.' override.Dependent='CIM_ServiceAccessPoint REF' override.Dependent.Description='The ServiceAccessPoint implemented by the SoftwareElement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareElementSAPImplementation extends CIM_Dependency {
} // CIM_SoftwareElementSAPImplementation
