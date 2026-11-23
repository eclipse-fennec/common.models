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
 * A representation of the model object '<em><b>CIM Endpoint Of Network Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EndpointOfNetworkPipe describes the endpoints between which a pipe transfers information. Whether an endpoint is a source or sink is indicated by a property of the association, SourceOrSink.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EndpointOfNetworkPipe#getSourceOrSink <em>Source Or Sink</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EndpointOfNetworkPipe()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::Pipes' MappingStrings='[\"Recommendation.ITU|M3100.Pipe.a-TPInstance\",\"Recommendation.ITU|M3100.Pipe.z-TPInstance\"]' override.Antecedent='CIM_ProtocolEndpoint REF' override.Antecedent.Min='2' override.Antecedent.Max='2' override.Antecedent.Description='One of the endpoints of the pipe.' override.Dependent='CIM_NetworkPipe REF' override.Dependent.Description='The pipe which is dependent on the endpoints as the source or sink of the transferred information.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_EndpointOfNetworkPipe extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Source Or Sink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the endpoint is a source (value = 2), or sink (value = 3) for the pipe. If this information is not applicable, the property is set to 4. If the information is not known, the property is set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Or Sink</em>' attribute.
	 * @see #setSourceOrSink(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EndpointOfNetworkPipe_SourceOrSink()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Source\",\"Sink\",\"Not Applicable\"]'"
	 * @generated
	 */
	Integer getSourceOrSink();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EndpointOfNetworkPipe#getSourceOrSink <em>Source Or Sink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Or Sink</em>' attribute.
	 * @see #getSourceOrSink()
	 * @generated
	 */
	void setSourceOrSink(Integer value);

} // CIM_EndpointOfNetworkPipe
