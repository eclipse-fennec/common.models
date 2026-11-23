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
 * A representation of the model object '<em><b>CIM Contained Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ContainedTransform associates a proposal with a list of transforms. If multiple transforms of a given type are included in a proposal, these transforms are interpreted as alternatives -- i.e., logically ORed with each other. The order of preference is dictated by the SequenceNumber property. Sets of transforms of different types are logically ANDed. For example, a proposal based on two AH transforms and three ESP transforms means one of the AH AND one of the ESP transforms MUST be chosen. Note that at least 1 transform MUST be aggregated into the proposal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ContainedTransform#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ContainedTransform()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|ContainedTransform\"]' override.GroupComponent='CIM_IPsecProposal REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The Proposal containing the transforms.' override.GroupComponent.MappingStrings='[\"IPSP Policy Model.IETF|ContainedTransform.GroupComponent\"]' override.PartComponent='CIM_SATransform REF' override.PartComponent.Min='1' override.PartComponent.Description='Transforms in the proposal.' override.PartComponent.MappingStrings='[\"IPSP Policy Model.IETF|ContainedTransform.PartComponent\"]' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ContainedTransform extends CIM_Component {
	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SequenceNumber indicates the order of preference for SATransforms of the same type. Lower-valued transforms are preferred over transforms of the same type with higher values. For ContainedTransforms (of the same type) that reference the same IPsecProposal, SequenceNumber values MUST be unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ContainedTransform_SequenceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"IPSP Policy Model.IETF|ContainedTransform.SequenceNumber\"]'"
	 * @generated
	 */
	Integer getSequenceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ContainedTransform#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(Integer value);

} // CIM_ContainedTransform
