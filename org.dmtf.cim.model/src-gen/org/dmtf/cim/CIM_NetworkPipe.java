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
 * A representation of the model object '<em><b>CIM Network Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NetworkPipe is a subclass of EnabledLogicalElement, representing the state and management of a connection or trail between endpoints. This object is different than the association between the endpoints (CIM_ActiveConnection) since the emphasis is NOT on the endpoints but on the management of the pipe itself - its state, configuration, etc. NetworkPipes are defined in the context of a CIM_Network and represent the 'transfer of information . . . between . . . endpoints'. These concepts are aligned with the definition of the Pipe object in ITU's M.3100 specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPipe#getDirectionality <em>Directionality</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPipe#getAggregationBehavior <em>Aggregation Behavior</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPipe()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Network::Pipes' MappingStrings='[\"Recommendation.ITU|M3100.Pipe\",\"Recommendation.ITU|M3100.TrailR1\",\"Recommendation.ITU|M3100.ConnectionR1\",\"Recommendation.ITU|M3100.SubNetworkConnection\"]' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. (For DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.) \n&lt;LocalID&gt; MUST include either a vendor specified unique identifier, or if mapping from an ITU M.3100 environment, the trailID, connectionID or subNetworkConnectionID of the instances of PipeR2.' override.InstanceID.MappingStrings='[\"Recommendation.ITU|M3100.TrailR1.trailId\",\"Recommendation.ITU|M3100.ConnectionR1.connectionID\",\"Recommendation.ITU|M3100.SubNetworkConnection.subNetworkConnectionID\"]' override.EnabledState='uint16' override.EnabledState.MappingStrings='[\"Recommendation.ITU|M3100.Pipe.operationalState\"]' override.RequestedState='uint16' override.RequestedState.Write='true' override.RequestedState.MappingStrings='[\"Recommendation.ITU|M3100.Pipe.administrativeState\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkPipe extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>Directionality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the pipe is bi-directional (value = 2), unidirectional (value = 3), or this information is not known (value = 0). For unidirectional pipes, the source and sink are indicated by a property (SourceOrSink) of the association, EndpointOfNetworkPipe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directionality</em>' attribute.
	 * @see #setDirectionality(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPipe_Directionality()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"Bi-Directional\",\"Unidirectional\"]' MappingStrings='[\"Recommendation.ITU|M3100.Pipe.directionality\"]'"
	 * @generated
	 */
	Integer getDirectionality();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPipe#getDirectionality <em>Directionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directionality</em>' attribute.
	 * @see #getDirectionality()
	 * @generated
	 */
	void setDirectionality(Integer value);

	/**
	 * Returns the value of the '<em><b>Aggregation Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the pipe is composed of lower-level pipes, and if so, how these lower-level pipes are aggregated (in parallel or in sequence). The specific instances of NetworkPipe that are combined are described using the NetworkPipeComposition association. 
	 * 
	 * In the context of M.3100, the ability to be composed of lower-level pipes is modeled as a Trail. A Trail is made up of one or more Connections. (Note that both Trails and Connections are subclasses of Pipe). Because of the flexibility of the NetworkPipeComposition association, there is no need to subclass NetworkPipe, as was done in M.3100, but merely to instantiate the NetworkPipeComposition association to describe the bundling of the lower-level pipes (i.e., the connections), or the sequencing of them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Behavior</em>' attribute.
	 * @see #setAggregationBehavior(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPipe_AggregationBehavior()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"No Lower-Level Composition\",\"Combined In Parallel\",\"Combined In Sequence\"]'"
	 * @generated
	 */
	Integer getAggregationBehavior();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPipe#getAggregationBehavior <em>Aggregation Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Behavior</em>' attribute.
	 * @see #getAggregationBehavior()
	 * @generated
	 */
	void setAggregationBehavior(Integer value);

} // CIM_NetworkPipe
