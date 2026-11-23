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
 * A representation of the model object '<em><b>CIM Cluster Service Access By SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ClusterServiceAccessBySAP is the relationship between a ClusteringService and its access points.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ClusterServiceAccessBySAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::SystemElements' override.Antecedent='CIM_ClusteringService REF' override.Antecedent.Description='The ClusteringService.' override.Dependent='CIM_ClusteringSAP REF' override.Dependent.Description='An access point for the ClusteringService.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ClusterServiceAccessBySAP extends CIM_ServiceAccessBySAP {
} // CIM_ClusterServiceAccessBySAP
