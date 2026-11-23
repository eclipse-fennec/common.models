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
 * A representation of the model object '<em><b>CIM Clustering Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ClusteringService represents the functionality provided by a Cluster. For example, failover functionality may be modeled as a Service of a failover Cluster.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ClusteringService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::System::SystemElements' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ClusteringService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AddNode brings a new ComputerSystem into a Cluster. The node to be added is specified as a parameter to the method. The return value should be 0 if the Computer System is successfully added, 1 if the method is not supported and any other number if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param CS The node to add to the cluster.
	 * <!-- end-model-doc -->
	 * @model CSAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long AddNode(CIM_ComputerSystem CS);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EvictNode removes a ComputerSystem from a Cluster. The node to be evicted is specified as a parameter to the method. The return value should be 0 if the ComputerSystem is successfully evicted, 1 if the method is not supported and any other number if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param CS The node to remove from the cluster.
	 * <!-- end-model-doc -->
	 * @model CSAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long EvictNode(CIM_ComputerSystem CS);

} // CIM_ClusteringService
