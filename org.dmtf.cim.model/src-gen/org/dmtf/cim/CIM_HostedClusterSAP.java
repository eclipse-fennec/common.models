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
 * A representation of the model object '<em><b>CIM Hosted Cluster SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HostedClusterSAP defines the hosting ComputerSystem for a ClusteringSAP. Since this relationship is subclassed from HostedAccessPoint, it inherits the scoping/naming scheme defined for AccessPoint - where an AccessPoint is weak to its hosting System. In this case, a ClusteringSAP must be weak to its hosting ComputerSystem.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedClusterSAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::SystemElements' override.Antecedent='CIM_ComputerSystem REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The ComputerSystem.' override.Dependent='CIM_ClusteringSAP REF' override.Dependent.Description='The ClusteringSAP that is hosted on the ComputerSystem.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedClusterSAP extends CIM_HostedAccessPoint {
} // CIM_HostedClusterSAP
