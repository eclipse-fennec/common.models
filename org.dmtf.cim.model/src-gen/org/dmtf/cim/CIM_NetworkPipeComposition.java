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
 * A representation of the model object '<em><b>CIM Network Pipe Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NetworkPipeComposition describes the makeup a pipe, based on lower-level ones. If the pipe is not composed of lower-level entities (i.e., its AggregationBehavior property is set to 2), then no instances of this association should be defined where the pipe has the role of GroupComponent. 
 * 
 * In the context of M.3100, this semantic is modeled as a Trail that is made up of one or more Connections. Both Trails and Connections are subclasses of M.3100's Pipe. Because of the flexibility of the NetworkPipeComposition association, there is no need to subclass NetworkPipe, as was done in M.3100, but merely to instantiate this association to describe the bundling of the lower-level pipes (connections), or the sequencing of them. How the lower-level pipes are aggregated is described by the property, AggregationBehavior, of NetworkPipe. If the pipes are combined in a sequence, the ordering is conveyed via the property, AggregationSequence, on this association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPipeComposition#getAggregationSequence <em>Aggregation Sequence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPipeComposition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Network::Pipes' MappingStrings='[\"Recommendation.ITU|M3100.TrailR1.serverConnectionListPackage\",\"Recommendation.ITU|M3100.TrailR1.clientConnectionListPackage\"]' override.GroupComponent='CIM_NetworkPipe REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The higher level pipe that is composed of lower-level parts/pipes.' override.PartComponent='CIM_NetworkPipe REF' override.PartComponent.Description='A pipe which is a part of a higher-level one.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkPipeComposition extends CIM_Component {
	/**
	 * Returns the value of the '<em><b>Aggregation Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the ordering of the PartComponent pipes in the GroupComponent. If the AggregationBehavior property of the GroupComponent pipe is set to 0 or 3 ("Unknown" or "Combined In Parallel"), then this property MUST be set to 0. If the AggregationBehavior is set to 4 ("Combined In Sequence"), then this property SHOULD indicate the ordering of the component pipes. Ordering starts with 1 and larger numbers indicate subsequent pipes. The numbering does not have to be in sequence. The word SHOULD is used in this Description, since the specific ordering of all the component pipes may not be known. In these cases, a value of 0 would be placed in AggregationSequence to indicate that ordering information is not available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Sequence</em>' attribute.
	 * @see #setAggregationSequence(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPipeComposition_AggregationSequence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getAggregationSequence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPipeComposition#getAggregationSequence <em>Aggregation Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Sequence</em>' attribute.
	 * @see #getAggregationSequence()
	 * @generated
	 */
	void setAggregationSequence(Integer value);

} // CIM_NetworkPipeComposition
