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
 * A representation of the model object '<em><b>CIM Reflector Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association will serve as the base class for defining and distributing BGP routing information for the reflector of this Cluster.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReflectorService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Network::BGP' override.Antecedent='CIM_BGPCluster REF' override.Antecedent.Max='1' override.Antecedent.Description='The Cluster for which this Service is being defined.' override.Dependent='CIM_BGPService REF' override.Dependent.Min='1' override.Dependent.Description='The BGPService which distributes routing information in the Cluster.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ReflectorService extends CIM_Dependency {
} // CIM_ReflectorService
