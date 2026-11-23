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
 * A representation of the model object '<em><b>CIM Conditioning Service On Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The QoS Model describes the traffic conditioning functions in place for a network device. In order to 'be conditioned', a packet is received at a ProtocolEndpoint. After 'conditioning', a packet is dropped or leaves the device via a ProtocolEndpoint. This dependency on ProtocolEndpoints is defined by the ConditioningServiceOn Endpoint association. A property of the association, ServiceType, indicates whether the ConditioningService handles incoming ("Ingress") or out-going ("Egress") packets. This association is deprecated since different cardinalities are needed on the ingress and egress classes. This cannot be done using a single association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ConditioningServiceOnEndpoint#getServiceType <em>Service Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConditioningServiceOnEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_IngressConditioningServiceOnEndpoint\",\"CIM_EgressConditioningServiceOnEndpoint\"]' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_ProtocolEndpoint REF' override.Antecedent.Deprecated='[\"CIM_IngressConditioningServiceOnEndpoint.Antecedent\",\"CIM_EgressConditioningServiceOnEndpoint.Antecedent\"]' override.Antecedent.Max='1' override.Antecedent.Description='The ProtocolEndpoint through which traffic arrives at or leaves from a network device.' override.Dependent='CIM_ConditioningService REF' override.Dependent.Deprecated='[\"CIM_IngressConditioningServiceOnEndpoint.Dependent\",\"CIM_EgressConditioningServiceOnEndpoint.Dependent\"]' override.Dependent.Description='The ConditioningService which begins or ends the traffic conditioning processing within a network device.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ConditioningServiceOnEndpoint extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether a packet is incoming (value = 1, "Ingress") or out-going (value = 2, "Egress") at the ProtocolEndpoint, relative to the ConditioningService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see #setServiceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConditioningServiceOnEndpoint_ServiceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_IngressConditioningServiceOnEndpoint\",\"CIM_EgressConditioningServiceOnEndpoint\"]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Ingress\",\"Egress\"]'"
	 * @generated
	 */
	Integer getServiceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConditioningServiceOnEndpoint#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(Integer value);

} // CIM_ConditioningServiceOnEndpoint
